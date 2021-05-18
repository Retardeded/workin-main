package pl.edu.agh.rest.client;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.specimpl.MultivaluedMapImpl;
import pl.edu.agh.rest.model.Student;
import pl.edu.agh.rest.model.StudentProto;
import pl.edu.agh.rest.protobuf.StudentMessageWriter;

import javax.swing.*;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RESTClient {

    private ResteasyClient restClient;
    private String username = "";
    private String password = "";
    private static String token = null;


    public RESTClient() {
        this.restClient = new ResteasyClientBuilder().build();
    }

    public RESTClient(String username, String password) {
        this.restClient = new ResteasyClientBuilder().build();
        this.username = username;
        this.password = password;
        authorize();
    }

    public void endSession() {
        if(!restClient.isClosed())
            restClient.close();
    }

    public void authorize() {
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/auth/login");
        Form form = new Form();
        form.param("login", this.username);
        form.param("password", this.password);
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED));
        MultivaluedMap<String, String> headers = response.getStringHeaders();
        token = headers.getFirst("authorization");
    }

    private List<Student> getAllStudents(MultivaluedMap<String, Object> parameters) {
        List<Student> result = null;
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/");

        System.out.println("Getting all students");
        if(parameters != null && !parameters.isEmpty()) {
            target = target.queryParams(parameters);
            System.out.println("filtering parameters:");
            for(String key : parameters.keySet()) {
                System.out.println(" - " + key + ": " + parameters.getFirst(key));
            }
        }

        Response response = target.request().get();
        int responseStatus = response.getStatus();
        if(responseStatus == 200) {
            result = response.readEntity(new GenericType<List<Student>>() {});
        }
        response.close();

        System.out.println("HTTP STATUS: "+responseStatus);
        return result;
    }

    private Student getStudentByAlbum(int album){
        Student result = null;
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/"+album);
        System.out.println("Getting student with id "+album);
        Response response = target.request().get();
        int responseStatus = response.getStatus();
        if(responseStatus == 200) {
            result = response.readEntity(Student.class);
        }
        response.close();
        System.out.println("HTTP STATUS: "+responseStatus);
        return result;
    }

    private StudentProto.Student getStudentByAlbumProto(int album){
        StudentProto.Student result = null;
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/"+album+"/protobuf").register(StudentMessageWriter.class);
        System.out.println("Getting student with album "+album+"(ProtoBuf)");
        Response response = target.request().get();
        int responseStatus = response.getStatus();
        if(responseStatus == 200) {
            result = response.readEntity(StudentProto.Student.class);
        }
        response.close();
        System.out.println("HTTP STATUS: "+responseStatus);
        return result;
    }

    private void addStudent(Student student){
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/");
        System.out.println("Adding student: "+student.toString());
        if(token == null) {
            authorize();
        }
        Response response = target.request().header("Authorization", token).post(Entity.entity(student, MediaType.APPLICATION_JSON_TYPE));
        System.out.println("HTTP STATUS: "+response.getStatus());
        response.close();
    }

    private void updateStudent(int album, Student student){
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/"+album);
        System.out.println("Updating student: "+student.toString());
        if(token == null) {
            authorize();
        }
        Response response = target.request().header("Authorization", token).put(Entity.entity(student, MediaType.APPLICATION_JSON_TYPE));
        System.out.println("HTTP STATUS: "+response.getStatus());
        response.close();
    }

    private void displayAvatar(int id){
        byte[] result = null;
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/"+id+"/picture");
        System.out.println("Getting avatar of student with id "+id);
        Response response = target.request().get();
        int responseStatus = response.getStatus();
        if(responseStatus == 200) {
            result = response.readEntity(byte[].class);
        }
        response.close();
        System.out.println("HTTP STATUS: "+responseStatus);
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 540);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(result));
        panel.add(label);
        jFrame.getContentPane()
                .add(panel);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    private void removeStudent(int id){
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/"+id);
        System.out.println("Removing student with id "+id);
        if(token == null) {
            authorize();
        }
        Response response = target.request().header("Authorization", token).delete();
        System.out.println("HTTP STATUS: "+response.getStatus());
        response.close();
    }


    public static void main(String[] args) {

        RESTClient client = new RESTClient("user3","user3");

        System.out.println("\nWszyscy studenci (album, imię, przedmioty):");
        for(Student student : client.getAllStudents(null)){
            System.out.println(student.toString());
        }


        List<String> courses = new ArrayList<>();
        courses.add("Badania operacyjne");
        courses.add("Prawo autorskie");
        Student student = new Student("Jacek",301111, "defaultAvatar.jpg", courses);
        Student student22 = new Student("Jacek2",301112, "defaultAvatar.jpg", courses);
        client.addStudent(student);
        client.addStudent(student22);


        MultivaluedMap<String, Object> query = new MultivaluedMapImpl<>();
        query.add("name","Jacek");
        System.out.println("\nWszyscy studenci (album, imię, przedmioty) o imieniu Jacek:");
        for(Student student2 : client.getAllStudents(query)){
            System.out.println(student2.toString());
        }


        System.out.println("\nStudent o id 303030");
        System.out.println(client.getStudentByAlbum(303030).toString());


        System.out.println("\n");
        client.displayAvatar(303030);


        System.out.println("\n");
        client.removeStudent(student.getAlbum());


        
        System.out.println("\n");
        System.out.println(client.getStudentByAlbumProto(303030));

        System.out.println("\n");
        client.updateStudent(student22.getAlbum(),student22);

        for(Student student3 : client.getAllStudents(null)){
            System.out.println(student3.toString());
        }

        Student studentUp = new Student("JacekUp",301112, "defaultAvatar.jpg", courses);
        client.updateStudent(student22.getAlbum(),studentUp);

        for(Student student4 : client.getAllStudents(null)){
            System.out.println(student4.toString());
        }

        client.endSession();
    }
}

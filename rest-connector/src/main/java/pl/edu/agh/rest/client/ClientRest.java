package pl.edu.agh.rest.client;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.specimpl.MultivaluedMapImpl;
import pl.edu.agh.model.ClubPresident;
import pl.edu.agh.model.Club;
import pl.edu.agh.model.Student;
import pl.edu.agh.model.StudentProto;
import pl.edu.agh.rest.protobuf.StudentMessageWriter;

import javax.swing.*;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;

public class ClientRest {

    private ResteasyClient restClient;
    private String username = "";
    private String password = "";
    private static String token = null;


    public ClientRest() {
        this.restClient = new ResteasyClientBuilder().build();
    }

    public ClientRest(String username, String password) {
        this.restClient = new ResteasyClientBuilder().build();
        this.username = username;
        this.password = password;
        authorizeUser();
    }

    public void endSession() {
        if(!restClient.isClosed())
            restClient.close();
    }

    public void authorizeUser() {
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/auth/login");
        Form form = new Form();
        form.param("login", this.username);
        form.param("password", this.password);
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED));
        MultivaluedMap<String, String> headers = response.getStringHeaders();
        token = headers.getFirst("authorization");
    }

    private List<Student> getAllStudents(MultivaluedMap<String, Object> params) {
        List<Student> result = null;
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/");

        System.out.println("Getting all students");
        if(params != null && !params.isEmpty()) {
            target = target.queryParams(params);
            System.out.println("filtering params:");
            for(String key : params.keySet()) {
                System.out.println(" - " + key + ": " + params.getFirst(key));
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

    private List<Club> getAllClubs() {
        List<Club> result = null;
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/clubs/");

        System.out.println("Getting all clubs");

        Response response = target.request().get();
        int responseStatus = response.getStatus();
        if(responseStatus == 200) {
            result = response.readEntity(new GenericType<List<Club>>() {});
        }
        response.close();

        System.out.println("HTTP STATUS: "+responseStatus);
        return result;
    }

    private Student getStudentByAlbum(int album){
        Student result = null;
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/"+album);
        System.out.println("Getting student with album "+album);
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
            authorizeUser();
        }
        Response response = target.request().header("Authorization", token).post(Entity.entity(student, MediaType.APPLICATION_JSON_TYPE));
        System.out.println("HTTP STATUS: "+response.getStatus());
        response.close();
    }

    private void addStudentNoAuth(Student student){
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/");
        System.out.println("Adding student: "+student.toString());
        if(token == null) {
            authorizeUser();
        }
        System.out.println(token);
        token = null;
        Response response = target.request().header("NoAuthorization", token).post(Entity.entity(student, MediaType.APPLICATION_JSON_TYPE));
        System.out.println("HTTP STATUS: "+response.getStatus());
        response.close();
    }

    private void updateStudent(int album, Student student){
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/"+album);
        System.out.println("Updating student: "+student.toString());
        if(token == null) {
            authorizeUser();
        }
        Response response = target.request().header("Authorization", token).put(Entity.entity(student, MediaType.APPLICATION_JSON_TYPE));
        System.out.println("HTTP STATUS: "+response.getStatus());
        response.close();
    }

    private void displayPicture(int album){
        byte[] result = null;
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/"+album+"/picture");
        System.out.println("Getting picture of student with album "+album);
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
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(result));
        panel.add(label);
        jFrame.getContentPane()
                .add(panel);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    private void removeStudent(int album){
        ResteasyWebTarget target = restClient.target("http://localhost:8080/rest-api/api/students/"+album);
        System.out.println("Removing student with album "+album);
        if(token == null) {
            authorizeUser();
        }
        Response response = target.request().header("Authorization", token).delete();
        System.out.println("HTTP STATUS: "+response.getStatus());
        response.close();
    }


    public static void main(String[] args) {


        ClientRest client = new ClientRest("user3","user3");


        List<String> courses = new ArrayList<>();
        List<String> courses2 = new ArrayList<>();
        courses.add("Badania operacyjne");
        courses.add("SOA");
        courses2.add("Badania operacyjne");
        ClubPresident clubPresident = new ClubPresident("Kraul", "Mariusz");
        Club club = new Club("Klub Plywacki", clubPresident);
        ClubPresident clubPresident2 = new ClubPresident("Gambit", "Marek");
        Club club2 = new Club("Klub Szachowy", clubPresident2);
        Student student11 = new Student("Jacek",304111, "defaultPicture.jpg", courses, club);
        Student student22 = new Student("Jakub",303312, "defaultPicture.jpg", courses2, club);
        Student student33 = new Student("Maciej",333333, "defaultPicture.jpg", courses, club2);
        Student student44 = new Student("Mateusz",3232323, "defaultPicture.jpg", courses, club);
        Student student55 = new Student("Jan",121212, "defaultPicture.jpg", courses2, club2);
        Student student66 = new Student("Janusz",21212121, "defaultPicture.jpg", courses2, club);
        client.addStudent(student11);
        client.addStudent(student22);
        client.addStudent(student33);
        client.addStudent(student44);
        client.addStudent(student55);
        client.addStudent(student66);

        System.out.println("\nWszyscy studenci (album, imię, przedmioty):");
        for(Student student : client.getAllStudents(null)){
            System.out.println(student.toString());
        }

        MultivaluedMap<String, Object> query = new MultivaluedMapImpl<>();
        query.add("course","SOA");
        System.out.println("\nWszyscy studenci (album, imię, przedmioty) z kursu SOA:");
        for(Student student2 : client.getAllStudents(query)){
            System.out.println(student2.toString());
        }

        System.out.println("\nWszystkie kluby:");
        for(Club club11 : client.getAllClubs()){
            System.out.println(club11.toString());
        }



        System.out.println("\nStudent o albumie 303312");
        System.out.println(client.getStudentByAlbum(303312).toString());
        //not works client.displayPicture(3);
        client.removeStudent(student22.getAlbum());

        System.out.println("\nWszyscy studenci (album, imię, przedmioty):");
        for(Student student : client.getAllStudents(null)){
            System.out.println(student.toString());
        }

        System.out.println("\n");
        System.out.println(client.getStudentByAlbumProto(304111));

        //Student studentUp = new Student("JacekUp",301112, "defaultAvatar.jpg", courses, club2);
        //client.updateStudent(student11.getAlbum(),studentUp);

        for(Student student4 : client.getAllStudents(null)){
            System.out.println(student4.toString());
        }


        /*
        System.out.println("\nadd Student no auth");
        try {
            Student student10000 = new Student("NieMaGo",99999, "defaultAvatar.jpg", courses);
            client.addStudentNoAuth(student10000);
        }
        catch(Exception e) {

        }

         */

        /*

        System.out.println("\nStudent o id 303030");
        //System.out.println(client.getStudentByAlbum(303030).toString());

        System.out.println("\nStudent o id 000000 (Nie istnieje");
        try {
            System.out.println(client.getStudentByAlbum(000000).toString());
        }
        catch(Exception e) {

        }

         */

        client.endSession();
    }
}

package pl.edu.agh.soa;

import javax.xml.ws.BindingProvider;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class Client {

    public static void main(String[] args){
        StudentService studentService = new StudentServiceService().getStudentServicePort();
        authorize((BindingProvider) studentService);
        System.out.println("Lista studentów:");
        listAllStudents(studentService);
        Student student = getStudentByAlbum(studentService, 30030);
        System.out.println(student);
        student = getStudentByAlbum(studentService, 303030);
        System.out.println(student);
        getPictureByAlbum(studentService, studentService.getAllStudents().getStudent().get(0).getAlbum());
    }

    private static void listAllStudents(StudentService studentService) {
        for(Student student : studentService.getAllStudents().getStudent()) {
            System.out.print(student.getAlbum() + ", " + student.getName() + ", ");
            if (student.getCourses() != null){
                System.out.print(student.getCourses().getCourse()+"\n");
            }
            else{
                System.out.println("Brak Kursów");
            }
        }
    }

    private static Student getStudentByAlbum(StudentService studentService, int album){
        if(studentService.getStudentByAlbum(album) != null)
            return studentService.getStudentByAlbum(album);

        return null;
    }

    private static void getPictureByAlbum(StudentService studentService, int album){
        String base64 = studentService.getBase64PictureByAlbum(album);
        try (FileOutputStream stream = new FileOutputStream(String.format("picture_%d.jpg",album))) {
            byte[] byteArray = Base64.getDecoder().decode(base64);
            stream.write(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void authorize(BindingProvider port){
        port.getRequestContext().put("javax.xml.ws.security.auth.username","user3");
        port.getRequestContext().put("javax.xml.ws.security.auth.password","user3");
    }


}
package pl.edu.agh.rest.lab;

//import org.apache.commons.codec.binary.Base64;
import org.jboss.annotation.security.SecurityDomain;
import org.jboss.ws.api.annotation.WebContext;
import pl.edu.agh.model.Student;
import pl.edu.agh.model.StudentsList;

import java.io.IOException;
import java.net.URL;
import java.util.Base64;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.*;
import java.util.List;


@Stateless
@WebService
@SecurityDomain("Auto")
@WebContext(contextRoot = "/laby1", urlPattern = "/service", authMethod = "BASIC", transportGuarantee = "NONE", secureWSDLAccess = false)
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public class StudentService {

    private StudentsList studentsList = new StudentsList().setDefaultData();

    @PermitAll
    @WebMethod(action = "getAllStudents")
    @WebResult(name = "getAllStudents")
    @XmlElementWrapper(name = "students")
    @XmlElement(name = "student")
    public List<Student> getAllStudents(){
        return studentsList.getAllStudents();
    }

    @RolesAllowed("Auto")
    @WebMethod(action = "getStudentByAlbum")
    @WebResult(name = "getStudentByAlbumResult")
    @XmlElement(name = "student")
    public Student getStudentByAlbum(@WebParam(name = "album") int album) {
        return studentsList.getStudentByAlbum(album);
    }

    @RolesAllowed("Auto")
    @WebMethod(action = "getStudentsByName")
    @WebResult(name = "getStudentByNameResult")
    @XmlElementWrapper(name = "students")
    @XmlElement(name = "student")
    public List<Student> getStudentsByName(@WebParam(name = "name") String name){
        return studentsList.getStudentByName(name);
    }

    @RolesAllowed("Auto")
    @WebMethod(action = "getStudentsByCourse")
    @WebResult(name = "getStudentByCourseResult")
    @XmlElementWrapper(name = "students")
    @XmlElement(name = "student")
    public List<Student> getStudentsByCourse(@WebParam(name = "course") String course){
        return studentsList.getStudentByCourse(course);
    }


    @RolesAllowed("Auto")
    @WebMethod(action = "addStudent")
    @WebResult(name = "addStudentResult")
    public String addStudent(@WebParam(name = "album") int album,@WebParam(name = "name") String name){
        try {
            Student student = new Student.Builder()
                    .withName(name)
                    .withAlbum(album)
                    .build();
            studentsList.addStudent(student);

        }catch(Exception e){
            return e.getMessage();
        }
        return "Student added successfully";
    }

    @RolesAllowed("Auto")
    @WebMethod(action = "addCourseToStudent")
    @WebResult(name = "addCourseToStudentResult")
    public String addCourseToStudent(@WebParam(name = "album") int album, @WebParam(name = "course")String course){
        return studentsList.addCourseToStudent(album, course);
    }

    @RolesAllowed("Auto")
    @WebMethod(action = "updatePictureOfStudent")
    @WebResult(name = "updatePicutreOfStudentResult")
    public String updatePictureOfStudent(@WebParam(name = "album") int album, @WebParam(name = "picturePath")String picturePath){
        return studentsList.updatePicture(album, picturePath);
    }

    @RolesAllowed("Auto")
    @WebMethod(action = "removeStudentByAlbum")
    @WebResult(name = "removeStudentByAlbumResult")
    public String deleteStudentByAlbum(@WebParam(name="album") int album){
        studentsList.deleteStudentByAlbum(album);
        return "Student removed successfully";
    }

    @RolesAllowed("Auto")
    @WebMethod(action = "getBase64PictureByAlbum")
    @WebResult(name = "getBase64PictureByAlbumResult")
    public String getBase64PictureByAlbum(@WebParam(name = "album") int album) {
        Student student = studentsList.getStudentByAlbum(album);
        if(student ==  null)
            return null;
        String encoded;
        URL resource = getClass().getClassLoader().getResource(student.getPicturePath());
        try {
            byte[] bytes = new byte[resource.openConnection().getContentLength()];
            resource.openStream().read(bytes);
            encoded = Base64.getEncoder().encodeToString(bytes);
        } catch (IOException e) {
            return e.getMessage();
        }
        return encoded;
    }


}

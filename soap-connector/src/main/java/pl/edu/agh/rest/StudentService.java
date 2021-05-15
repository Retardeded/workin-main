
package pl.edu.agh.rest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentService", targetNamespace = "http://lab.rest.agh.edu.pl/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentService {


    /**
     * 
     * @param album
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "getBase64PictureByAlbum")
    @WebResult(name = "getBase64PictureByAlbumResult", targetNamespace = "")
    @RequestWrapper(localName = "getBase64PictureByAlbum", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.GetBase64PictureByAlbum")
    @ResponseWrapper(localName = "getBase64PictureByAlbumResponse", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.GetBase64PictureByAlbumResponse")
    public String getBase64PictureByAlbum(
        @WebParam(name = "album", targetNamespace = "")
        int album);

    /**
     * 
     * @param course
     * @return
     *     returns pl.edu.agh.rest.GetStudentsByCourseResponse.Students
     */
    @WebMethod(action = "getStudentsByCourse")
    @WebResult(name = "students", targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByCourse", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.GetStudentsByCourse")
    @ResponseWrapper(localName = "getStudentsByCourseResponse", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.GetStudentsByCourseResponse")
    public pl.edu.agh.rest.GetStudentsByCourseResponse.Students getStudentsByCourse(
        @WebParam(name = "course", targetNamespace = "")
        String course);

    /**
     * 
     * @param picturePath
     * @param album
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "updatePictureOfStudent")
    @WebResult(name = "updatePicutreOfStudentResult", targetNamespace = "")
    @RequestWrapper(localName = "updatePictureOfStudent", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.UpdatePictureOfStudent")
    @ResponseWrapper(localName = "updatePictureOfStudentResponse", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.UpdatePictureOfStudentResponse")
    public String updatePictureOfStudent(
        @WebParam(name = "album", targetNamespace = "")
        int album,
        @WebParam(name = "picturePath", targetNamespace = "")
        String picturePath);

    /**
     * 
     * @return
     *     returns pl.edu.agh.rest.GetAllStudentsResponse.Students
     */
    @WebMethod(action = "getAllStudents")
    @WebResult(name = "students", targetNamespace = "")
    @RequestWrapper(localName = "getAllStudents", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.GetAllStudents")
    @ResponseWrapper(localName = "getAllStudentsResponse", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.GetAllStudentsResponse")
    public pl.edu.agh.rest.GetAllStudentsResponse.Students getAllStudents();

    /**
     * 
     * @param album
     * @return
     *     returns pl.edu.agh.rest.Student
     */
    @WebMethod(action = "getStudentByAlbum")
    @WebResult(name = "student", targetNamespace = "")
    @RequestWrapper(localName = "getStudentByAlbum", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.GetStudentByAlbum")
    @ResponseWrapper(localName = "getStudentByAlbumResponse", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.GetStudentByAlbumResponse")
    public Student getStudentByAlbum(
        @WebParam(name = "album", targetNamespace = "")
        int album);

    /**
     * 
     * @param album
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "removeStudentByAlbum")
    @WebResult(name = "removeStudentByAlbumResult", targetNamespace = "")
    @RequestWrapper(localName = "deleteStudentByAlbum", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.DeleteStudentByAlbum")
    @ResponseWrapper(localName = "deleteStudentByAlbumResponse", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.DeleteStudentByAlbumResponse")
    public String deleteStudentByAlbum(
        @WebParam(name = "album", targetNamespace = "")
        int album);

    /**
     * 
     * @param name
     * @return
     *     returns pl.edu.agh.rest.GetStudentsByNameResponse.Students
     */
    @WebMethod(action = "getStudentsByName")
    @WebResult(name = "students", targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByName", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.GetStudentsByName")
    @ResponseWrapper(localName = "getStudentsByNameResponse", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.GetStudentsByNameResponse")
    public pl.edu.agh.rest.GetStudentsByNameResponse.Students getStudentsByName(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param album
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "addStudent")
    @WebResult(name = "addStudentResult", targetNamespace = "")
    @RequestWrapper(localName = "addStudent", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.AddStudent")
    @ResponseWrapper(localName = "addStudentResponse", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.AddStudentResponse")
    public String addStudent(
        @WebParam(name = "album", targetNamespace = "")
        int album,
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param album
     * @param course
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "addCourseToStudent")
    @WebResult(name = "addCourseToStudentResult", targetNamespace = "")
    @RequestWrapper(localName = "addCourseToStudent", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.AddCourseToStudent")
    @ResponseWrapper(localName = "addCourseToStudentResponse", targetNamespace = "http://lab.rest.agh.edu.pl/", className = "pl.edu.agh.rest.AddCourseToStudentResponse")
    public String addCourseToStudent(
        @WebParam(name = "album", targetNamespace = "")
        int album,
        @WebParam(name = "course", targetNamespace = "")
        String course);

}
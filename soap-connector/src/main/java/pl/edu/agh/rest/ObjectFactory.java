
package pl.edu.agh.rest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.edu.agh.rest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCourseToStudent_QNAME = new QName("http://lab.rest.agh.edu.pl/", "addCourseToStudent");
    private final static QName _AddCourseToStudentResponse_QNAME = new QName("http://lab.rest.agh.edu.pl/", "addCourseToStudentResponse");
    private final static QName _AddStudent_QNAME = new QName("http://lab.rest.agh.edu.pl/", "addStudent");
    private final static QName _AddStudentResponse_QNAME = new QName("http://lab.rest.agh.edu.pl/", "addStudentResponse");
    private final static QName _DeleteStudentByAlbum_QNAME = new QName("http://lab.rest.agh.edu.pl/", "deleteStudentByAlbum");
    private final static QName _DeleteStudentByAlbumResponse_QNAME = new QName("http://lab.rest.agh.edu.pl/", "deleteStudentByAlbumResponse");
    private final static QName _GetAllStudents_QNAME = new QName("http://lab.rest.agh.edu.pl/", "getAllStudents");
    private final static QName _GetAllStudentsResponse_QNAME = new QName("http://lab.rest.agh.edu.pl/", "getAllStudentsResponse");
    private final static QName _GetBase64PictureByAlbum_QNAME = new QName("http://lab.rest.agh.edu.pl/", "getBase64PictureByAlbum");
    private final static QName _GetBase64PictureByAlbumResponse_QNAME = new QName("http://lab.rest.agh.edu.pl/", "getBase64PictureByAlbumResponse");
    private final static QName _GetStudentByAlbum_QNAME = new QName("http://lab.rest.agh.edu.pl/", "getStudentByAlbum");
    private final static QName _GetStudentByAlbumResponse_QNAME = new QName("http://lab.rest.agh.edu.pl/", "getStudentByAlbumResponse");
    private final static QName _GetStudentsByCourse_QNAME = new QName("http://lab.rest.agh.edu.pl/", "getStudentsByCourse");
    private final static QName _GetStudentsByCourseResponse_QNAME = new QName("http://lab.rest.agh.edu.pl/", "getStudentsByCourseResponse");
    private final static QName _GetStudentsByName_QNAME = new QName("http://lab.rest.agh.edu.pl/", "getStudentsByName");
    private final static QName _GetStudentsByNameResponse_QNAME = new QName("http://lab.rest.agh.edu.pl/", "getStudentsByNameResponse");
    private final static QName _UpdatePictureOfStudent_QNAME = new QName("http://lab.rest.agh.edu.pl/", "updatePictureOfStudent");
    private final static QName _UpdatePictureOfStudentResponse_QNAME = new QName("http://lab.rest.agh.edu.pl/", "updatePictureOfStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.edu.agh.rest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link GetStudentsByNameResponse }
     * 
     */
    public GetStudentsByNameResponse createGetStudentsByNameResponse() {
        return new GetStudentsByNameResponse();
    }

    /**
     * Create an instance of {@link GetStudentsByCourseResponse }
     * 
     */
    public GetStudentsByCourseResponse createGetStudentsByCourseResponse() {
        return new GetStudentsByCourseResponse();
    }

    /**
     * Create an instance of {@link GetAllStudentsResponse }
     * 
     */
    public GetAllStudentsResponse createGetAllStudentsResponse() {
        return new GetAllStudentsResponse();
    }

    /**
     * Create an instance of {@link AddCourseToStudent }
     * 
     */
    public AddCourseToStudent createAddCourseToStudent() {
        return new AddCourseToStudent();
    }

    /**
     * Create an instance of {@link AddCourseToStudentResponse }
     * 
     */
    public AddCourseToStudentResponse createAddCourseToStudentResponse() {
        return new AddCourseToStudentResponse();
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link DeleteStudentByAlbum }
     * 
     */
    public DeleteStudentByAlbum createDeleteStudentByAlbum() {
        return new DeleteStudentByAlbum();
    }

    /**
     * Create an instance of {@link DeleteStudentByAlbumResponse }
     * 
     */
    public DeleteStudentByAlbumResponse createDeleteStudentByAlbumResponse() {
        return new DeleteStudentByAlbumResponse();
    }

    /**
     * Create an instance of {@link GetAllStudents }
     * 
     */
    public GetAllStudents createGetAllStudents() {
        return new GetAllStudents();
    }

    /**
     * Create an instance of {@link GetBase64PictureByAlbum }
     * 
     */
    public GetBase64PictureByAlbum createGetBase64PictureByAlbum() {
        return new GetBase64PictureByAlbum();
    }

    /**
     * Create an instance of {@link GetBase64PictureByAlbumResponse }
     * 
     */
    public GetBase64PictureByAlbumResponse createGetBase64PictureByAlbumResponse() {
        return new GetBase64PictureByAlbumResponse();
    }

    /**
     * Create an instance of {@link GetStudentByAlbum }
     * 
     */
    public GetStudentByAlbum createGetStudentByAlbum() {
        return new GetStudentByAlbum();
    }

    /**
     * Create an instance of {@link GetStudentByAlbumResponse }
     * 
     */
    public GetStudentByAlbumResponse createGetStudentByAlbumResponse() {
        return new GetStudentByAlbumResponse();
    }

    /**
     * Create an instance of {@link GetStudentsByCourse }
     * 
     */
    public GetStudentsByCourse createGetStudentsByCourse() {
        return new GetStudentsByCourse();
    }

    /**
     * Create an instance of {@link GetStudentsByName }
     * 
     */
    public GetStudentsByName createGetStudentsByName() {
        return new GetStudentsByName();
    }

    /**
     * Create an instance of {@link UpdatePictureOfStudent }
     * 
     */
    public UpdatePictureOfStudent createUpdatePictureOfStudent() {
        return new UpdatePictureOfStudent();
    }

    /**
     * Create an instance of {@link UpdatePictureOfStudentResponse }
     * 
     */
    public UpdatePictureOfStudentResponse createUpdatePictureOfStudentResponse() {
        return new UpdatePictureOfStudentResponse();
    }

    /**
     * Create an instance of {@link Student.Courses }
     * 
     */
    public Student.Courses createStudentCourses() {
        return new Student.Courses();
    }

    /**
     * Create an instance of {@link GetStudentsByNameResponse.Students }
     * 
     */
    public GetStudentsByNameResponse.Students createGetStudentsByNameResponseStudents() {
        return new GetStudentsByNameResponse.Students();
    }

    /**
     * Create an instance of {@link GetStudentsByCourseResponse.Students }
     * 
     */
    public GetStudentsByCourseResponse.Students createGetStudentsByCourseResponseStudents() {
        return new GetStudentsByCourseResponse.Students();
    }

    /**
     * Create an instance of {@link GetAllStudentsResponse.Students }
     * 
     */
    public GetAllStudentsResponse.Students createGetAllStudentsResponseStudents() {
        return new GetAllStudentsResponse.Students();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCourseToStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCourseToStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "addCourseToStudent")
    public JAXBElement<AddCourseToStudent> createAddCourseToStudent(AddCourseToStudent value) {
        return new JAXBElement<AddCourseToStudent>(_AddCourseToStudent_QNAME, AddCourseToStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCourseToStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCourseToStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "addCourseToStudentResponse")
    public JAXBElement<AddCourseToStudentResponse> createAddCourseToStudentResponse(AddCourseToStudentResponse value) {
        return new JAXBElement<AddCourseToStudentResponse>(_AddCourseToStudentResponse_QNAME, AddCourseToStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentByAlbum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteStudentByAlbum }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "deleteStudentByAlbum")
    public JAXBElement<DeleteStudentByAlbum> createDeleteStudentByAlbum(DeleteStudentByAlbum value) {
        return new JAXBElement<DeleteStudentByAlbum>(_DeleteStudentByAlbum_QNAME, DeleteStudentByAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentByAlbumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteStudentByAlbumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "deleteStudentByAlbumResponse")
    public JAXBElement<DeleteStudentByAlbumResponse> createDeleteStudentByAlbumResponse(DeleteStudentByAlbumResponse value) {
        return new JAXBElement<DeleteStudentByAlbumResponse>(_DeleteStudentByAlbumResponse_QNAME, DeleteStudentByAlbumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudents }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllStudents }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "getAllStudents")
    public JAXBElement<GetAllStudents> createGetAllStudents(GetAllStudents value) {
        return new JAXBElement<GetAllStudents>(_GetAllStudents_QNAME, GetAllStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllStudentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "getAllStudentsResponse")
    public JAXBElement<GetAllStudentsResponse> createGetAllStudentsResponse(GetAllStudentsResponse value) {
        return new JAXBElement<GetAllStudentsResponse>(_GetAllStudentsResponse_QNAME, GetAllStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBase64PictureByAlbum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBase64PictureByAlbum }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "getBase64PictureByAlbum")
    public JAXBElement<GetBase64PictureByAlbum> createGetBase64PictureByAlbum(GetBase64PictureByAlbum value) {
        return new JAXBElement<GetBase64PictureByAlbum>(_GetBase64PictureByAlbum_QNAME, GetBase64PictureByAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBase64PictureByAlbumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBase64PictureByAlbumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "getBase64PictureByAlbumResponse")
    public JAXBElement<GetBase64PictureByAlbumResponse> createGetBase64PictureByAlbumResponse(GetBase64PictureByAlbumResponse value) {
        return new JAXBElement<GetBase64PictureByAlbumResponse>(_GetBase64PictureByAlbumResponse_QNAME, GetBase64PictureByAlbumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByAlbum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudentByAlbum }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "getStudentByAlbum")
    public JAXBElement<GetStudentByAlbum> createGetStudentByAlbum(GetStudentByAlbum value) {
        return new JAXBElement<GetStudentByAlbum>(_GetStudentByAlbum_QNAME, GetStudentByAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByAlbumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudentByAlbumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "getStudentByAlbumResponse")
    public JAXBElement<GetStudentByAlbumResponse> createGetStudentByAlbumResponse(GetStudentByAlbumResponse value) {
        return new JAXBElement<GetStudentByAlbumResponse>(_GetStudentByAlbumResponse_QNAME, GetStudentByAlbumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByCourse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudentsByCourse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "getStudentsByCourse")
    public JAXBElement<GetStudentsByCourse> createGetStudentsByCourse(GetStudentsByCourse value) {
        return new JAXBElement<GetStudentsByCourse>(_GetStudentsByCourse_QNAME, GetStudentsByCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByCourseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudentsByCourseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "getStudentsByCourseResponse")
    public JAXBElement<GetStudentsByCourseResponse> createGetStudentsByCourseResponse(GetStudentsByCourseResponse value) {
        return new JAXBElement<GetStudentsByCourseResponse>(_GetStudentsByCourseResponse_QNAME, GetStudentsByCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudentsByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "getStudentsByName")
    public JAXBElement<GetStudentsByName> createGetStudentsByName(GetStudentsByName value) {
        return new JAXBElement<GetStudentsByName>(_GetStudentsByName_QNAME, GetStudentsByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudentsByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "getStudentsByNameResponse")
    public JAXBElement<GetStudentsByNameResponse> createGetStudentsByNameResponse(GetStudentsByNameResponse value) {
        return new JAXBElement<GetStudentsByNameResponse>(_GetStudentsByNameResponse_QNAME, GetStudentsByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePictureOfStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePictureOfStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "updatePictureOfStudent")
    public JAXBElement<UpdatePictureOfStudent> createUpdatePictureOfStudent(UpdatePictureOfStudent value) {
        return new JAXBElement<UpdatePictureOfStudent>(_UpdatePictureOfStudent_QNAME, UpdatePictureOfStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePictureOfStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePictureOfStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab.rest.agh.edu.pl/", name = "updatePictureOfStudentResponse")
    public JAXBElement<UpdatePictureOfStudentResponse> createUpdatePictureOfStudentResponse(UpdatePictureOfStudentResponse value) {
        return new JAXBElement<UpdatePictureOfStudentResponse>(_UpdatePictureOfStudentResponse_QNAME, UpdatePictureOfStudentResponse.class, null, value);
    }

}

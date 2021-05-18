package pl.edu.agh.rest.api;

import io.swagger.annotations.*;
import pl.edu.agh.model.StudentsList;
import pl.edu.agh.rest.auth.JWTTokenNeeded;
import pl.edu.agh.model.Student;
import pl.edu.agh.model.StudentProto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

@Path("/students")
@Api(value = "Students API")
public class StudentRestService {

    private static StudentsList studentList = new StudentsList().setDefaultData();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    @ApiOperation("Returns list of all students")
    @ApiResponses({
            @ApiResponse(code = 404, message = "No students found"),
            @ApiResponse(code = 200, message = "Students found",
                    response = Student.class,
                    responseContainer = "List")
    })
    public Response getAllStudents(
            @QueryParam("name") String name
            //@QueryParam("course") List<String> courses
    ) {
        List<Student> resultList = studentList.getAllStudents();
        System.out.println(resultList);
        if (name != null)
            resultList = resultList.stream().filter(student -> student.getName().equals(name)).
                    collect(Collectors.toList());
        //if (courses != null)
        //for (String course : courses) {
        //        resultList = resultList.stream().filter(student -> student.getCourses().contains(course)).collect(Collectors.toList());
        //    }
        if (resultList.size() == 0)
            return Response.status(Response.Status.NOT_FOUND).entity("No students found").build();
        return Response.status(Response.Status.OK).entity(resultList).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{album}")
    @ApiOperation("Returns student with given album")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Student found"),
            @ApiResponse(code = 404, message = "Student with given id not found")
    })
    public Response getStudentById(@ApiParam(required = true) @PathParam("album") int album) {
        if (studentList.getStudentByAlbum(album) == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        } else {
            return Response.status(Response.Status.OK).entity(studentList.getStudentByAlbum(album)).build();
        }
    }

    @POST
    @Path("/")
    @JWTTokenNeeded
    @ApiOperation("Adds student to the database")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Student added"),
            @ApiResponse(code = 409, message = "Student with the same album already exists")
    })
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addStudent(@ApiParam(required = true, name = "New Student") Student student) {

        try {
            studentList.addStudent(student);
            return Response.status(Response.Status.CREATED).build();
        } catch (Exception e) {
            return Response.status(Response.Status.CONFLICT).build();
        }
    }

    @PUT
    @Path("/{album}")
    @JWTTokenNeeded
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation("Updates student with given album")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Student updated"),
            @ApiResponse(code = 404, message = "Student with given id does not exist")
    })
    public Response updateStudent(@ApiParam(required = true) @PathParam("album") int album, @ApiParam(required = true, name = "New Student") Student student) {
        try {
            studentList.updateStudent(album, student);
            return Response.status(Response.Status.OK).build();
        } catch (Exception e) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{album}")
    @JWTTokenNeeded
    @ApiOperation("Removes student with given album")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Student deleted"),
            @ApiResponse(code = 404, message = "Student with given album does not exist")
    })
    public Response deleteStudent(@ApiParam(required = true) @PathParam("album") int album) {
        studentList.removeStudentByAlbum(album);
        return Response.status(Response.Status.OK).build();
    }

    @GET
    @Produces("image/jpeg")
    @Path("/{album}/picture")
    @ApiOperation("Returns picture of student with given albums")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Student found, picture returned"),
            @ApiResponse(code = 404, message = "Student with given album not found"),
            @ApiResponse(code = 500, message = "Something went wrong during loading the image, try again later")
    })
    public Response getPictureByAlbum(@ApiParam(required = true) @PathParam("album") int album) {
        Student student = studentList.getStudentByAlbum(album);
        if (student == null)
            return Response.status(Response.Status.NOT_FOUND).build();
        Object result;
        URL resource = getClass().getClassLoader().getResource(student.getPicturePath());
        try {
            byte[] bytes = new byte[resource.openConnection().getContentLength()];
            resource.openStream().read(bytes);
            result = bytes;
        } catch (IOException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
        return Response.status(Response.Status.OK).entity(result).build();
    }

    @GET
    @Produces("application/protobuf")
    @Path("/{album}/protobuf")
    @ApiOperation("Returns student with given album (in ProtoBuf)")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Student found"),
            @ApiResponse(code = 404, message = "Student with given album not found")
    })
    public Response getStudentByAlbumProto(@ApiParam(required = true) @PathParam("album") int album) {
        if (studentList.getStudentByAlbum(album) == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        } else {
            var studentBuilder = StudentProto.Student.newBuilder();
            Student student = studentList.getStudentByAlbum(album);
            studentBuilder.setPicturePath(student.getPicturePath()).setAlbum(student.getAlbum()).setName(student.getName()).addAllCourses(student.getCourses());
            var newStudent = studentBuilder.build();
            return Response.status(Response.Status.OK).entity(newStudent).build();
        }
    }

}

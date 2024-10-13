package jdbc.course_monitoring.dao;

import jdbc.course_monitoring.exception.FacultyException;
import jdbc.course_monitoring.model.Faculty;

import java.util.List;

public interface FacultyDao {
    String addFaculty(Faculty faculty) throws FacultyException;
    Faculty getFacultyById(int facultyId) throws FacultyException;
    List<Faculty> getAllFaculties() throws FacultyException;
    boolean authenticate(String username, String password) throws FacultyException;
    String updatePassword(String username,String newPassword) throws FacultyException;

    String updateFaculty(int facultyId, Faculty updatedFaculty) throws FacultyException;

    String deleteFaculty(int facultyId) throws FacultyException;
}

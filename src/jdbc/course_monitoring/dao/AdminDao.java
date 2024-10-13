package jdbc.course_monitoring.dao;

import jdbc.course_monitoring.exception.AdminException;
import jdbc.course_monitoring.model.Admin;

public interface AdminDao {
    String addAdmin(Admin admin) throws AdminException;

    boolean authenticate(String username, String password) throws AdminException;

    String updatePassword(String username, String newPassword) throws AdminException;


}

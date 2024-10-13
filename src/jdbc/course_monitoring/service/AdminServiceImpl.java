package jdbc.course_monitoring.service;

import jdbc.course_monitoring.dao.AdminDao;
import jdbc.course_monitoring.dao.AdminDaoImpl;
import jdbc.course_monitoring.exception.AdminException;
import jdbc.course_monitoring.model.Admin;

public class AdminServiceImpl implements AdminService {


    private AdminDao dao;

    public AdminServiceImpl() {
        this.dao = new AdminDaoImpl();
    }

    @Override
    public String addAdmin(Admin admin) throws AdminException {
        return dao.addAdmin(admin);

    }

    @Override
    public boolean authenticate(String username, String password) throws AdminException {
        return dao.authenticate(username, password);
    }

    @Override
    public String updatePassword(String username, String newPassword) throws AdminException {
        return dao.updatePassword(username, newPassword);
    }


}

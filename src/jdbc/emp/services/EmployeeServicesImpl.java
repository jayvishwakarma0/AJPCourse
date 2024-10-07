package jdbc.emp.services;

import jdbc.emp.Dao.EmployeeDao;
import jdbc.emp.Dao.EmployeeDaoImpl;
import jdbc.emp.Exception.EmployeeException;
import jdbc.emp.model.Employee;

import java.util.List;

public class EmployeeServicesImpl implements EmployeeServices{
    EmployeeDao dao = new EmployeeDaoImpl();
    @Override
    public String registerEmp(Employee emp) throws EmployeeException {
        String msg = dao.registerEmp(emp);
        return msg;
    }

    @Override
    public List<Employee> getAllEmp() throws EmployeeException {
        List<Employee> allEmp = dao.getAllEmp();
        return allEmp;
    }

    @Override
    public Employee getEmpById(int id) throws EmployeeException {
        Employee emp = dao.getEmpById(id);
        return emp;
    }

    @Override
    public String updateEmp(Employee emp) throws EmployeeException {
        String msg = dao.updateEmp(emp);
        return msg;
    }

    @Override
    public Employee deleteEmp(int eid) throws EmployeeException {
        Employee emp = dao.deleteEmp(eid);
        return emp;
    }
}

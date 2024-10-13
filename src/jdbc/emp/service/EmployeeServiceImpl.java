package jdbc.emp.service;

import jdbc.emp.dao.EmployeeDao;
import jdbc.emp.dao.EmployeeDaoImpl;
import jdbc.emp.exception.EmployeeException;
import jdbc.emp.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
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

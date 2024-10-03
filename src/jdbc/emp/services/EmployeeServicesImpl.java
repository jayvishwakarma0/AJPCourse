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
        return null;
    }

    @Override
    public Employee getEmpById(int id) throws EmployeeException {
        return null;
    }

    @Override
    public String updateEmp(Employee emp) throws EmployeeException {
        return null;
    }

    @Override
    public Employee deleteEmp(int id) throws EmployeeException {
        return null;
    }
}

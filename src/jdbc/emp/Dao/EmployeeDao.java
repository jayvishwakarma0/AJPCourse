package jdbc.emp.Dao;

import jdbc.emp.Exception.EmployeeException;
import jdbc.emp.model.Employee;

import java.util.List;

public interface EmployeeDao {
    public String registerEmp(Employee emp) throws EmployeeException;
    public List<Employee> getAllEmp() throws EmployeeException;
    public Employee getEmpById(int id) throws EmployeeException;
    public String updateEmp(Employee emp) throws  EmployeeException;
    public Employee deleteEmp(int id)  throws EmployeeException;
}

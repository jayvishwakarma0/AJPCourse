package jdbc.emp.services;

import jdbc.emp.Exception.EmployeeException;
import jdbc.emp.model.Employee;

import java.util.List;

public interface EmployeeServices {
    public String registerEmp(Employee emp) throws EmployeeException;
    public List<Employee> getAllEmp() throws EmployeeException;
    public Employee getEmpById(int id) throws EmployeeException;
    public String updateEmp(Employee emp) throws  EmployeeException;
    public Employee deleteEmp(int id)  throws EmployeeException;
}

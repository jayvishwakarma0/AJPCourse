package jdbc.emp.Dao;

import jdbc.emp.Exception.EmployeeException;
import jdbc.emp.model.Employee;
import jdbc.emp.utility.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    // this instance will not  created
//    ConnectionFactory con = new ConnectionFactory()

    @Override
    public String registerEmp(Employee emp) throws EmployeeException {
        String query = "insert into Employee values(?,?,?)";
        String msg = null;

       try{
           Connection con =  ConnectionFactory.getInstance().getConnection();
           PreparedStatement ps = con.prepareStatement(query);
           ps.setInt(1,emp.getEid());
           ps.setString(2,emp.getName());
           ps.setDouble(3,emp.getSalary());

           int x = ps.executeUpdate();
           if(x>0){
               msg = "Data inserted successfully";
           }

           con.close();

       }
       catch (SQLException e){
           e.printStackTrace();
       }
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
    public String updateEmp(Employee e) throws EmployeeException {
        return null;
    }

    @Override
    public Employee deleteEmp(int id) throws EmployeeException {
        return null;
    }
}

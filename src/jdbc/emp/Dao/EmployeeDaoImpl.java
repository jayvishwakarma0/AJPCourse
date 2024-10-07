package jdbc.emp.Dao;

import jdbc.emp.Exception.EmployeeException;
import jdbc.emp.model.Employee;
import jdbc.emp.utility.ConnectionFactory;
import jdbc.emp.utility.EmpQueryUtil;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    EmpQueryUtil q = new EmpQueryUtil();

    @Override
    public String registerEmp(Employee emp) throws EmployeeException {
        String msg = null;
        try {
            Connection con = ConnectionFactory.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(q.insertEmployee());
            ps.setInt(1, emp.getEid());
            ps.setString(2, emp.getName());
            ps.setDouble(3, emp.getSalary());

            int x = ps.executeUpdate();
            if (x > 0) {
                msg = "Data inserted successfully";
            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public List<Employee> getAllEmp() throws EmployeeException {
        List<Employee> allEmp = new ArrayList<>();
        try {
            Connection con = ConnectionFactory.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(q.getAllEmp());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Employee e = new Employee();
                e.setEid(rs.getInt("eid"));
                e.setName(rs.getString("ename"));
                e.setSalary(rs.getDouble("esalary"));
                allEmp.add(e);
            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allEmp;
    }

    @Override
    public Employee getEmpById(int eid) throws EmployeeException {
        Employee emp = new Employee();
        try{
            Connection con = ConnectionFactory.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(q.getEmpById());
            ps.setInt(1,eid);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                emp.setEid(rs.getInt("eid"));
                emp.setName(rs.getString("ename"));
                emp.setSalary(rs.getDouble("esalary"));
            } else{
                System.out.println("Employee Not Found");
            }
            con.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

        return emp;
    }

    @Override
    public String updateEmp(Employee emp) throws EmployeeException {
        String msg = null;
        try{
            Connection con = ConnectionFactory.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(q.updateEmp());
            ps.setString(1,emp.getName());
            ps.setDouble(2,emp.getSalary());
            ps.setInt(3,emp.getEid());

            int x = ps.executeUpdate();
            if(x>0){
                msg = "Employee details updated successfully";
            }else{
                msg = "Not able to update data";
            }
            con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public Employee deleteEmp(int eid) throws EmployeeException {
       Employee emp = getEmpById(eid);
       try{
           Connection con = ConnectionFactory.getInstance().getConnection();
           PreparedStatement ps = con.prepareStatement(q.deleteEmp());
           ps.setInt(1,eid);
           int x = ps.executeUpdate();

           if(x>0){
               System.out.println("Employee deleted successfully");
           } else{
               System.out.println("Not able to delete employee");
           }
           con.close();
       }
       catch (SQLException e){
           e.printStackTrace();
       }
       return emp;
    }
}

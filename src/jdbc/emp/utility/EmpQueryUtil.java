package jdbc.emp.utility;

public class EmpQueryUtil {
    public String insertEmployee(){
        return "insert into Employee values(?,?,?)";
    }

    public String getAllEmp(){
        return "select * from Employee";
    }

    public String getEmpById(){
        return "select * from Employee where eid=?";
    }
    public String deleteEmp(){
        return "Delete from Employee where eId = ?";
    }

    public String updateEmp(){
        return "Update employee Set eName=?, esalary=? where eId=?";
    }
}

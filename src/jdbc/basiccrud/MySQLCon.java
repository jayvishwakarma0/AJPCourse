package jdbc.basiccrud;

import java.sql.*;

public class MySQLCon {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ANP_C9284", "root", "Jay@1234");
            Statement st = con.createStatement();
//            String q = "select * from employees";
            String query = String.format("Update Employees set salary = %d where ename='%s'",70000,"Rahul Sharma");
//            ResultSet rs = st.executeQuery(q);

            int row  = st.executeUpdate(query);
//            while (rs.next()) {
//                System.out.println("ID  ->" + rs.getInt(1) + " name -->" + rs.getString(2) + " salary " + rs.getInt(3));
//            }

            if(row>0){
                System.out.println("Updated successfully");
            } else{
                System.out.println("Not Updated");
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


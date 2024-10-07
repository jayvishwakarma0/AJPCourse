package jdbc.emp.utility;

public class CarQueryUtil {
    public String insertCar(){
        return "Insert into Car values(?,?,?)";
    }
    public String getAllCar(){
        return "select * from Car";
    }
    public String getAllCarByEmpId(){
        return "select * from car where empId = ?";
    }
    public String deleteCarById(){
        return "delete from car where carId = ?";
    }
    public String getCarByCarId(){
        return "select * from car where carId=?";
    }
}

package jdbc.emp.Dao;

import jdbc.emp.Exception.CarException;
import jdbc.emp.model.Car;
import jdbc.emp.utility.CarQueryUtil;
import jdbc.emp.utility.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{
    CarQueryUtil q = new CarQueryUtil();
    @Override
    public String registerCar(Car c) throws CarException {
        String msg = null;
        try{
            Connection con = ConnectionFactory.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(q.insertCar());
            ps.setInt(1,c.getCarId());
            ps.setString(2,c.getCarName());
            ps.setInt(3,c.getEmpId());

            int rowAffected = ps.executeUpdate();
            if(rowAffected>0){
                msg = "Data Inserted Successfully";
            } else{
                msg = "Data not inserted Successfully";
            }

            con.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public List<Car> getAllCar() throws CarException {
        List<Car> allCar = new ArrayList<>();
        try{
            Connection con = ConnectionFactory.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(q.getAllCar());
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Car c = new Car();
                c.setCarId(rs.getInt("carId"));
                c.setEmpId(rs.getInt("empid"));
                c.setCarName(rs.getString("carName"));
                allCar.add(c);
            }
            con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return allCar;
    }

    @Override
    public List<Car> getAllCarByEmpId(int empId) throws CarException {
        List<Car> allCar = new ArrayList<>();
        try{
            Connection con = ConnectionFactory.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(q.getAllCarByEmpId());
            ps.setInt(1,empId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Car c = new Car();
                c.setCarId(rs.getInt("carId"));
                c.setCarName(rs.getString("carName"));
                c.setEmpId(rs.getInt("empId"));
                allCar.add(c);
            }
            con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return allCar;
    }
    public Car getCarByCarId(int carId){
        Car car  = new Car();

        try{
            Connection con = ConnectionFactory.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(q.getCarByCarId());
            ps.setInt(1,carId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                car.setCarId(rs.getInt("carId"));
                car.setCarName(rs.getString("carName"));
                car.setEmpId(rs.getInt("empId"));
            }
            con.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return car;
    }

    @Override
    public Car deleteCarById(int carId) throws CarException {
        Car car = getCarByCarId(carId);
        try{
            Connection con = ConnectionFactory.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(q.deleteCarById());
            ps.setInt(1,carId);
            int x  = ps.executeUpdate();

            if(x>0){
                System.out.println("Car deleted Successfully");
            } else{
                System.out.println("Car not deleted");
            }

            con.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return car;
    }
}

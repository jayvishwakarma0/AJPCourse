package jdbc.emp.dao;

import jdbc.emp.exception.CarException;
import jdbc.emp.model.Car;

import java.util.List;

public interface CarDao {
    public String registerCar(Car c) throws CarException;
    public List<Car> getAllCar() throws CarException;
    public List<Car> getAllCarByEmpId(int empId) throws CarException;
    public Car deleteCarById(int carId) throws CarException;
}

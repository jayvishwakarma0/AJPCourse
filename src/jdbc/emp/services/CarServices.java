package jdbc.emp.services;

import jdbc.emp.Exception.CarException;
import jdbc.emp.Exception.EmployeeException;
import jdbc.emp.model.Car;

import java.util.List;

public interface CarServices {
    public String registerCar(Car c) throws CarException;
    public List<Car> getAllCar() throws CarException;
    public List<Car> getAllCarByEmpId(int empId) throws EmployeeException,CarException;
    public Car deleteCarById(int carid) throws CarException;
}

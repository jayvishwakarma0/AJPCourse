package jdbc.emp.service;

import jdbc.emp.exception.CarException;
import jdbc.emp.exception.EmployeeException;
import jdbc.emp.model.Car;

import java.util.List;

public interface CarService {
    public String registerCar(Car c) throws CarException;
    public List<Car> getAllCar() throws CarException;
    public List<Car> getAllCarByEmpId(int empId) throws EmployeeException,CarException;
    public Car deleteCarById(int carid) throws CarException;
}

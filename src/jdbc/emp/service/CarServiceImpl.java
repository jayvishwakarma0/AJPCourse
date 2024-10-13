package jdbc.emp.service;

import jdbc.emp.dao.CarDao;
import jdbc.emp.dao.CarDaoImpl;
import jdbc.emp.exception.CarException;
import jdbc.emp.exception.EmployeeException;
import jdbc.emp.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDao dao = new CarDaoImpl();
    @Override
    public String registerCar(Car c) throws CarException {
        String msg = dao.registerCar(c);
        return msg;
    }

    @Override
    public List<Car> getAllCar() throws CarException {
        List<Car> allCar = dao.getAllCar();
        return allCar;
    }

    @Override
    public List<Car> getAllCarByEmpId(int empId) throws EmployeeException, CarException {
        List<Car> allCar = dao.getAllCarByEmpId(empId);
        return allCar;
    }

    @Override
    public Car deleteCarById(int carid) throws CarException {
        Car c = dao.deleteCarById(carid);
        return c;
    }
}

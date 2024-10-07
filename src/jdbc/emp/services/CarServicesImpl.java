package jdbc.emp.services;

import jdbc.emp.Dao.CarDao;
import jdbc.emp.Dao.CarDaoImpl;
import jdbc.emp.Exception.CarException;
import jdbc.emp.Exception.EmployeeException;
import jdbc.emp.model.Car;

import java.util.List;

public class CarServicesImpl implements CarServices{
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

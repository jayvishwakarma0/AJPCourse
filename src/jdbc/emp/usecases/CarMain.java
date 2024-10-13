package jdbc.emp.usecases;

import jdbc.emp.model.Car;
import jdbc.emp.service.CarService;
import jdbc.emp.service.CarServiceImpl;

import java.util.List;
import java.util.Scanner;

public class CarMain {
    private static Scanner sc = new Scanner(System.in);
    private static CarService carService = new CarServiceImpl();

    public void carOperation() {
        while (true) {
            System.out.println("***** Car Menu *****");
            System.out.println("1 for register car\n2 for get All Car\n3 for get all car by empId\n4 for delete car by id\n0 for exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Oh! You want to insert data");
                    Car c = new Car();
                    System.out.println("Enter car id");
                    c.setCarId(sc.nextInt());
                    System.out.println("Enter car name");
                    c.setCarName(sc.next());
                    System.out.println("Enter emp Id");
                    c.setEmpId(sc.nextInt());

                    String ans = carService.registerCar(c);
                    System.out.println(ans);
                    break;
                case 2:
                    System.out.println("Oh! you want all cars");
                    List<Car> allCar = carService.getAllCar();
                    System.out.println(allCar);
                    break;
                case 3:
                    System.out.println("Oh! you want all cars by emp id");
                    System.out.println("Enter emp id");
                    List<Car> cars = carService.getAllCarByEmpId(sc.nextInt());
                    if (cars.isEmpty()) {
                        System.out.println("Employee don't have any car");
                    } else {
                        System.out.println(cars);
                    }
                    break;
                case 4:
                    System.out.println("Oh! you want to delete car by car Id");
                    System.out.println("Enter car Id");
                    Car car = carService.deleteCarById(sc.nextInt());
                    System.out.println(car);
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println();
        }
    }
}

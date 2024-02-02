package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Camry", "Red"));
        carList.add(new Car("Honda", "Civic", "Blue"));
        carList.add(new Car("Ford", "Mustang", "Yellow"));
        carList.add(new Car("Chevrolet", "Cruze", "Black"));
        carList.add(new Car("BMW", "X5", "White"));
    }

    public List<Car> getCars(Integer count) {
        if (count == null || count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
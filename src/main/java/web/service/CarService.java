package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

@Service
public class CarService {

    private Car[] cars = {
            new Car("Ford", "Mustang", 2020),
            new Car("Chevrolet", "Camaro", 2021),
            new Car("Dodge", "Challenger", 2019),
            new Car("BMW", "M4", 2022),
            new Car("Audi", "RS5", 2022)
    };

    public Car[] getCars(int count) {
        if (count >= cars.length) {
            return cars;
        } else {
            Car[] result = new Car[count];
            for (int i = 0; i < count; i++) {
                result[i] = cars[i];
            }
            return result;
        }
    }

}

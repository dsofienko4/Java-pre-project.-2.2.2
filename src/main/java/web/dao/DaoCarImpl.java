package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DaoCarImpl implements DaoCar {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW", "250 ls", "black"));
        cars.add(new Car("Lada", "150 ls", "brown"));
        cars.add(new Car("Reno", "185 ls", "metalik"));
        cars.add(new Car("KAMAZ", "600 ls", "black"));
        cars.add(new Car("Ford", "350 ls", "white"));
    }

    @Override
    public List<Car> countCars(int count) {
        if (count == 0) {
            return cars;
        }
       return cars.stream().limit(count).collect(Collectors.toList());
    }
}

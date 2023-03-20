package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.DaoCar;
import web.dao.DaoCarImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private DaoCarImpl daoCar;
    @Override
    public List<Car> countCars(int a) {
        return daoCar.countCars(a);
    }
}

package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao{


    @Override
    public List<Car> carsList() {
        return List.of(
                new Car(1, "BMW", 15826),
                new Car(2, "Range Rover ", 25382),
                new Car(3, "Volkswagen", 235625),
                new Car(4, "Toyota", 22365),
                new Car(5, "Chery Tiggo", 32145)
        );
    }
}

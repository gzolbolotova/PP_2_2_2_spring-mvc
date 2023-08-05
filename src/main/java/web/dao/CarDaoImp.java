package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao{


    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        List<Car> subCar;
        if(count > 0){
            switch (count){
                case 1:
                    subCar = cars.subList(0, 1);
                    break;
                case 2:
                    subCar = cars.subList(0, 2);
                    break;
                case 3:
                    subCar = cars.subList(0, 3);
                    break;
                case 4:
                    subCar = cars.subList(0, 4);
                    break;
                case 5:
                    subCar = cars.subList(0, 5);
                    break;
                default:
                    return cars;
            }
            return subCar;
        }else {
            return null;
        }

    }
}

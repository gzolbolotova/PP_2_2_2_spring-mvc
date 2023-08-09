package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarDaoImp carDao;


    public CarServiceImpl(CarDaoImp carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        return carDao.carsList().stream().limit(count).toList();
    }

    @Override
    public List<Car> carsList() {
        return carDao.carsList();
    }
}

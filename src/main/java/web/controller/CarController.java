package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarDaoImp carDaoImp;


    public CarController(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }
    private List<Car> carsList;
    {
        carsList = new ArrayList<>();
        carsList.add(new Car(1, "BMW", 15826));
        carsList.add(new Car(2, "Range Rover ", 25382));
        carsList.add(new Car(3, "Volkswagen", 235625));
        carsList.add(new Car(4, "Toyota", 22365));
        carsList.add(new Car(5, "Chery Tiggo", 32145));
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5", required = false) int count, Model model){
        model.addAttribute("cars", carDaoImp.getCars(carsList, count));
        return "cars";
    }

}

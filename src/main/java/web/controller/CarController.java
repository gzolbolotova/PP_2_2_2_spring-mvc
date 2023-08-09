package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImp;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarServiceImpl carService;


    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5", required = false) int count, Model model){
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }

}

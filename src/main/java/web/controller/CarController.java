package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.CarService;

import static dao.CarDaoImpl.cars;

@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    CarController (CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count,
                            Model model){

        model.addAttribute("cars", carService.carsList(cars, count));
        return "cars";
    }
}

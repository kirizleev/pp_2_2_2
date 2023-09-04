package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import model.Car;
import service.CarService;
import service.CarServiceImpl;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count,
                            Model model){
        CarService carServiceImpl = new CarServiceImpl();

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mazda 6", 2020, 54343));
        cars.add(new Car("Honda Civic", 2015, 105654));
        cars.add(new Car("Lada Priora", 2008, 198783));
        cars.add(new Car("Toyota Prius", 2017, 87109));
        cars.add(new Car("Tesla S", 2022, 31001));

        model.addAttribute("cars", carServiceImpl.carsList(cars, count));

        return "cars";
    }
}

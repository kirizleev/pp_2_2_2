package service;

import model.Car;

import java.util.List;

public interface CarService {
    public List<Car> carsList (List<Car> cars, Integer requestNum);
}

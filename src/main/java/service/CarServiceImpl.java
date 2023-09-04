package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carsList(List<Car> cars, Integer requestNum) {
        if (requestNum == null || requestNum > cars.size()) {
            return cars;
        }
        return cars.subList(0, requestNum);
    }
}

package dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    public static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Mazda 6", 2020, 54343));
        cars.add(new Car("Honda Civic", 2015, 105654));
        cars.add(new Car("Lada Priora", 2008, 198783));
        cars.add(new Car("Toyota Prius", 2017, 87109));
        cars.add(new Car("Tesla S", 2022, 31001));
    }
    @Override
    public List<Car> carsList(List<Car> cars, Integer requestNum) {
        if (requestNum == null || requestNum > cars.size()) {
            return cars;
        }
        return cars.subList(0, requestNum);
    }
}

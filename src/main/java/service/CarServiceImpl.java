package service;

import dao.CarDao;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public CarServiceImpl() {}

    @Override
    public List<Car> carsList(List<Car> cars, Integer requestNum) {
        return carDao.carsList(cars, requestNum);
    }
}
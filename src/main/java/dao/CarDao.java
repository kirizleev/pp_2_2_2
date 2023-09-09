package dao;
import model.Car;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CarDao {
    List<Car> carsList (List<Car> cars, Integer requestNum);
}

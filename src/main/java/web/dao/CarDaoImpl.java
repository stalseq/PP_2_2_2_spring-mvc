package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    private static int car_id;
    private List<Car> listCars;

    {
        listCars = new ArrayList<>();
        listCars.add(new Car(++car_id, "audi", 326));
        listCars.add(new Car(++car_id, "bmw", 456));
        listCars.add(new Car(++car_id, "volkswagen", 654));
        listCars.add(new Car(++car_id, "lada", 567));
        listCars.add(new Car(++car_id, "opel", 453));
    }

    @Override
    public List<Car> getCar(int count) {

        return listCars.stream().limit(count).collect(Collectors.toList());
    }
}

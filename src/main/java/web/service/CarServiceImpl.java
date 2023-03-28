package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Volga", "2411", "black"));
            carList.add(new Car("Moskvich", "412", "red"));
            carList.add(new Car("LADA", "2104", "grey"));
            carList.add(new Car("UAZ", "469", "green"));
            carList.add(new Car("Pobeda", "M-20", "blue"));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
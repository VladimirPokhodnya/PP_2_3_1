package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Volga", "2411", "black"));
        carList.add(new Car("Moskvich", "412", "red"));
        carList.add(new Car("LADA", "2104", "grey"));
        carList.add(new Car("UAZ", "469", "green"));
        carList.add(new Car("Pobeda", "M-20", "blue"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count <= 0 || count > carList.size()) {
            count = carList.size();
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
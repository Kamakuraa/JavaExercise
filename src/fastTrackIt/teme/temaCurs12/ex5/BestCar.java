package fastTrackIt.teme.temaCurs12.ex5;


;

import java.util.*;

public class BestCar {
    private final List<CarShop> carShops = new ArrayList<>();

    public BestCar(Collection<CarShop> carShops) {
        this.carShops.addAll(carShops);
    }

    public List<CarShop> getCarShops() {
        return carShops;
    }

    public Map<CarsName, Integer> mapCarToName() {
        Map<CarsName, Integer> result = new HashMap<>();
        for (CarShop carShop : carShops) {
            result.put(carShop.getName(), carShop.getAge());
        }
        return result;
    }


    public int numberOfTheCar(int result) {
        for (int i = 0; i < carShops.size(); i++) {
            System.out.println(i);
        }
        return result;
    }
}

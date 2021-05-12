package fastTrackIt.teme.temaCurs12.ex5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BestCar bestCar = new BestCar(List.of(
                new CarShop(CarsName.DACIA, 2021, 0, 10000),
                new CarShop(CarsName.BMW, 1999, 100000, 5000),
                new CarShop(CarsName.FORD, 2019, 40000, 13000),
                new CarShop(CarsName.VOLVO, 2015, 300000, 9590)
        ));

        System.out.println(bestCar.getCarShops());
        System.out.println(bestCar.mapCarToName());
        System.out.println(bestCar.numberOfTheCar(0));
    }
}

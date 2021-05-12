package fastTrackIt.teme.temaCurs12.ex5;

import java.util.Objects;

public class CarShop {
    private final CarsName name;
    private final int age;
    private final int km;
    private final int price;

    public CarShop(CarsName name, int age, int km, int price) {
        this.name = name;
        this.age = age;
        this.km = km;
        this.price = price;
    }

    public CarsName getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKm() {
        return km;
    }


    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarShop carShop = (CarShop) o;
        return age == carShop.age && km == carShop.km && price == carShop.price && Objects.equals(name, carShop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, km, price);
    }

    @Override
    public String toString() {
        return "CarShop{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", km=" + km +
                ", price=" + price +
                '}';
    }
}

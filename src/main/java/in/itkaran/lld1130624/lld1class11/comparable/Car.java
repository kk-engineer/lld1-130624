package in.itkaran.lld1130624.lld1class11.comparable;

public class Car implements Comparable<Car> {

    private String model;
    private int price;
    private int maxSpeed;

    public Car(String model, int price, int maxSpeed) {
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public int compareTo(Car other) {
        //return this.price - other.price;
        return other.price - this.price;
    }

    public String toString() {
        return this.model + " - " + this.price + " - " + this.maxSpeed;
    }
}

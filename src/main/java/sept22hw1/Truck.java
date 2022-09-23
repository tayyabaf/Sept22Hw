package sept22hw1;

public class Truck extends Vehicle implements Rideable{
    public Truck(String name, int quantity, double price, Engine engine, float speed) {
        super(name, quantity, price, engine, speed);
    }

    public void totalAfterTax(Vehicle vehicle) {
        System.out.println(calcTax(vehicle) + getPrice());
    }

    @Override
    public int milesPerHour() {
        return 50;
    }
}

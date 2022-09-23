package sept22hw1;

public class Bike extends Vehicle implements Rideable{
    public Bike(String name, int quantity, double price, float speed) {
        super(name, quantity, price, speed);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        System.out.println(calcTax(vehicle) + getPrice());
    }

    @Override
    public int milesPerHour() {
        return 15;
    }
}

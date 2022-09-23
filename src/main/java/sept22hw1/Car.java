package sept22hw1;

public class Car extends Vehicle implements Rideable{
    public Car(String name, int quantity, double price, Engine engine, float speed) {
        super(name, quantity, price, engine, speed);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        System.out.println(calcTax(vehicle) + getPrice());
    }

    @Override
    public int milesPerHour() {
        int intSpeed = (int) getSpeed();
        return intSpeed;
    }
}

package sept22hw1;

public class Horse extends Vehicle implements Rideable{
    public Horse(String name, int quantity, double price, float speed) {
        super(name, quantity, price, speed);
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

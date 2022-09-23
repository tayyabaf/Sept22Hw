package sept22hw1;

public abstract class Vehicle extends Product{
    private int quantity;
    private double price;
    private Engine engine;
    private final double TAX =0.15; //do i need access modifier?
    private float speed;

    public Vehicle(String name, int quantity, double price, float speed) {
        super(name);
        this.quantity=quantity;
        this.price = price;
        this.speed=speed;
    }

    public Vehicle(String name, int quantity, double price, Engine engine, float speed) {
        super(name);
        this.quantity = quantity;
        this.price = price;
        this.engine = engine;
        this.speed = speed;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getTAX() {
        return TAX;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    //methods

    public double totalBeforeTax(Vehicle vehicle){
        return price;
    }

    //check if u need to change return
    public double calcTax(Vehicle vehicle){
        return price * TAX;
    }

    public abstract void totalAfterTax(Vehicle vehicle);
}

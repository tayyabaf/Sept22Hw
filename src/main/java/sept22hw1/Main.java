package sept22hw1;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //making engine
        Engine myEngine = new Engine(3);
    //making objects
        Car myCar = new Car("Carro", 1, 20000, myEngine, 60.9f);
        Truck myTruck = new Truck("FoodTruck", 2,50000, myEngine,40.6f);
        Bike myBike = new Bike("TheBike",1,50,15.5f);
        RollerCoaster myRollercoaster = new RollerCoaster();
        Horse myHorse = new Horse("Horsey", 1, 200, 25.5f);

    //making arrays and using static methods
        Vehicle [] myVehicles = new Vehicle [] {myCar, myTruck, myBike};
        VehicleApp.printVehicleNamesAndPrices(myVehicles);

        Rideable [] myRideableVehicle = new Rideable[]{myCar, myTruck, myBike, myRollercoaster, myHorse};
        VehicleApp.getSpeedOfRideableObjects(myRideableVehicle);

    //invoking totalBeforeTax and totalAfterTax methods
        myCar.totalAfterTax(myCar);
        System.out.println(myCar.totalBeforeTax(myCar));


    }
}

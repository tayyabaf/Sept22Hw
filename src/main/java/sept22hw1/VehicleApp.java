package sept22hw1;

public class VehicleApp {
    public static void printVehicleNamesAndPrices(Vehicle [] myVehicles){
        for (int i = 0; i<myVehicles.length; i++){
            System.out.println("Vehicle " + myVehicles[i].getName() + " is $" + myVehicles[i].getPrice());
        }
    }

    public static void getSpeedOfRideableObjects(Rideable [] myRideableVehicles) {
        System.out.print("The speed for the rideables are ");
        for (int i = 0; i < myRideableVehicles.length; i++) {
            System.out.print(myRideableVehicles[i].milesPerHour() + "MPH, ");
        }
        System.out.println("\n");

    }
}

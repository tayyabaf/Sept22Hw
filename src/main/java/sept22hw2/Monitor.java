package sept22hw2;

public class Monitor {
private Resolution myResolution;
private String model;
private String manufacturer;

    public Monitor(Resolution myResolution, String model, String manufacturer) {
        this.myResolution = myResolution;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "MONITOR: " +
                "Resolution: " + myResolution +
                ", Model:'" + model + '\'' +
                ", Manufacturer:'" + manufacturer + '\'' +
                "\n";
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color "+ color);
    }
}

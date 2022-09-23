package sept22hw2;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    @Override
    public String toString() {
        return "MOTHERBOARD: " + "Model: " + model  +
                ", manufacturer: " + manufacturer  +
                ", ramSlots: " + ramSlots +
                ", cardSlots: " + cardSlots +
                ", bios: " + bios + "\n" ;
    }

    public void loadProgram(String programName){
        System.out.println(programName + " is now running");
    }
}

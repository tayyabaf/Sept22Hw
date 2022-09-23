package sept22hw2;

public class Main {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(3,6,9);
        Resolution resolution = new Resolution(2,8);
        Motherboard myMotherboard = new Motherboard("Arana", "Deof", 4,5,"Tula");
        Case myCase = new Case("Drac", "Pesto", "high", dimension);
        Monitor myMonitor = new Monitor(resolution, "Kato", "Shar");
        PC myPC = new PC(myMotherboard, myMonitor, myCase);
        myPC.description();
        myPC.powerUp();
    }

}

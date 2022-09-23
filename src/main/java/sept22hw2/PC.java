package sept22hw2;

public class PC {
    private Motherboard myMotherboard;
    private Monitor myMonitor;
    private Case myCase;

    public PC(Motherboard myMotherboard, Monitor myMonitor, Case myCase) {
        this.myMotherboard = myMotherboard;
        this.myMonitor = myMonitor;
        this.myCase = myCase;
    }

    public Motherboard getMyMotherboard() {
        return myMotherboard;
    }

    public void setMyMotherboard(Motherboard myMotherboard) {
        this.myMotherboard = myMotherboard;
    }

    public Monitor getMyMonitor() {
        return myMonitor;
    }

    public void setMyMonitor(Monitor myMonitor) {
        this.myMonitor = myMonitor;
    }

    public Case getMyCase() {
        return myCase;
    }

    public void setMyCase(Case myCase) {
        this.myCase = myCase;
    }

    @Override
    public String toString() {
        return "PC{" +
                "myMotherboard=" + myMotherboard +
                ", myMonitor=" + myMonitor +
                ", myCase=" + myCase +
                '}';
    }


    //methods
    private void drawLogo(){
        myMonitor.drawPixel(3,4,"pink");
    }

    public void description(){
        System.out.println("Welcome to worst buy, below is the description of the PC on sale today \n" + myCase + myMonitor + myMotherboard);
    }

    public void powerUp(){
        myCase.pressPowerButton();
        drawLogo();
        myMotherboard.loadProgram("IntelliJ");
    }
}

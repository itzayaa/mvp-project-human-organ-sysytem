public class Lung extends Organ {

    private int oxygenCapacity;

    public Lung (String organName, String systemType, String bodyLocation, String healthStatus, int oxygenCapacity) {

        super(organName, systemType, bodyLocation, healthStatus);
        this.oxygenCapacity = oxygenCapacity;
    }

    public int getOxygenCapacity() {
        return oxygenCapacity;
    }

    public void setOxygenCapacity(int oxygenCapacity) {
        this.oxygenCapacity = oxygenCapacity;
    }

    @Override
    public void performFunction() { //demonstrates runtime polymorphism
        System.out.println("Lungs exchange oxygen and carbon dioxide");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Oxygen Capacity: " + oxygenCapacity + "%");
    }
}

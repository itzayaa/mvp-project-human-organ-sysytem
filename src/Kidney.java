public class Kidney extends Organ {

    private boolean filteringBlood;

    public Kidney(String organName, String systemType, String bodyLocation, String healthStatus, boolean filteringBlood) {
        super(organName, systemType, bodyLocation, healthStatus);
        this.filteringBlood = filteringBlood;
    }

    public boolean isFilteringBlood() {
        return filteringBlood;
    }

    public void setFilteringBlood(boolean filteringBlood) {
        this.filteringBlood = filteringBlood;
    }

    @Override
    public void performFunction() {
        System.out.println("Kidneys remove waste from blood.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Filtering Blood: " + filteringBlood);
    }
}
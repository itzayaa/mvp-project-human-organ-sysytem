public class Organ {

    private String organName;
    private String systemType;
    private String bodyLocation;
    private String healthStatus;

    public Organ (String organName, String systemType, String bodyLocation, String heatlthStatus) {
        this.organName = organName;
        this.systemType = systemType;
        this.bodyLocation = bodyLocation;
        this.healthStatus = heatlthStatus;
    }

    public String getOrganName() {
        return organName;
    }

    public String getSystemType() {
        return systemType;
    }

    public String getBodyLocation() {
        return bodyLocation;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setOrganName (String organName) {
        this.organName = organName;
    }

    public void setSystemType (String systemType) {
        this.systemType = systemType;
    }

    public void setBodyLocation (String bodyLocation) {
        this.bodyLocation =bodyLocation;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void displayInfo() {
        System.out.println("Organ Name: " + organName);
        System.out.println("System Type: " + systemType);
        System.out.println("Body Location: " + bodyLocation);
        System.out.println("Health Status: " + healthStatus);
    }

    public void displayInfo (boolean detailed) { //displays either basic or detailed information depending on the parameter
        if (detailed) {
            System.out.println("----Detailed Information----");
            displayInfo();
        }
        else {
            System.out.println("Organ: " + organName);
        }
    }

    public void performFunction() {
        System.out.println(organName + " performs a body function");
    }
}

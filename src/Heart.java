public class Heart extends Organ {

    private int heartRate;

    public Heart (String organName, String systemType, String bodyLocation, String healthStatus, int heartRate) {
        super(organName, systemType, bodyLocation, healthStatus);
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        if (heartRate > 0) {
            this.heartRate = heartRate;
        }
    }

    @Override
    public void performFunction() {
        System.out.println("Heart pumps blood throughout the body");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Heart Rate: " + heartRate + "bpm");
    }
}

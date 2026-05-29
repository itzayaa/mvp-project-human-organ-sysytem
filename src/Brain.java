public class Brain extends Organ {

    private long neuronCount;

    public Brain(String organName, String systemType, String bodyLocation, String healthStatus, long neuronCount) {
        super(organName, systemType, bodyLocation, healthStatus);
        this.neuronCount = neuronCount;

    }

    public long getNeuronCount() {
        return neuronCount;
    }

    public void setNeuronCount(long neuronCount) {
        this.neuronCount = neuronCount;
    }

    @Override
    public void performFunction() {
        System.out.println("Brain controls body activities.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Neuron Count: " + neuronCount);
    }
}
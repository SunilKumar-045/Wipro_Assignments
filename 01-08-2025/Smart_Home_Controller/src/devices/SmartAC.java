package devices;

public class SmartAC implements SmartDevice,Adjustable{
    private String acName;
    private int temperature;

    public SmartAC(String acName) {
        this.acName = acName;
        this.temperature = 26;
    }

    @Override
    public void increaseSetting() {
        System.out.println("Tempature increased to "+ ++temperature);
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Tempature decreased to "+ --temperature);
    }

    @Override
    public void deviceOn() {
        System.out.println(acName+" AC turned on...");
    }

    @Override
    public void deviceOff() {
        System.out.println(acName+" AC turned off...");
    }
}

package devices;

public class SmartLight implements SmartDevice,Adjustable{

    private String lightType;
    private int brightness;

    public SmartLight(String lightType) {
        this.lightType = lightType;
        this.brightness = 5;
    }

    @Override
    public void deviceOn() {
        System.out.println(lightType+ " Light turned On...");
    }

    @Override
    public void deviceOff() {
        System.out.println(lightType+ " Light turned Off...");
    }

    @Override
    public void increaseSetting() {
        System.out.println("Brightness increased to "+ ++brightness);
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Brightness decreased to "+--brightness);
    }
}

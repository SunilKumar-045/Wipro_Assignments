package devices;

public class SmartFan implements SmartDevice,Adjustable{

    private String fanName;
    private int speed;

    public SmartFan(String fanName) {
        this.fanName = fanName;
        this.speed = 2;
    }

    @Override
    public void increaseSetting() {
        System.out.println("speed increase to "+ ++speed);
    }

    @Override
    public void decreaseSetting() {
        System.out.println("speed decreased to "+ --speed);
    }

    @Override
    public void deviceOn() {
        System.out.println(fanName+" fan turned on");
    }

    @Override
    public void deviceOff() {
        System.out.println(fanName+" fan turned off");
    }
}

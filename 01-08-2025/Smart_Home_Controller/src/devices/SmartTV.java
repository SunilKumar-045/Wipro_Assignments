package devices;

public class SmartTV implements SmartDevice,Adjustable{
    private String tvName;
    private int volume;

    public SmartTV(String tvName) {
        this.tvName = tvName;
        this.volume = 25;
    }

    @Override
    public void increaseSetting() {
        System.out.println("Volume increased to "+ ++volume);
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Volume decreased to "+ --volume);
    }

    @Override
    public void deviceOn() {
        System.out.println(tvName+" TV turned on...");
    }

    @Override
    public void deviceOff() {
        System.out.println(tvName+" TV turned off...");
    }
}

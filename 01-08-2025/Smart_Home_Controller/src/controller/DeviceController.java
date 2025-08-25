package controller;

import devices.*;
public class DeviceController {

    SmartLight light = new SmartLight("LED");
    SmartFan fan = new SmartFan("Crompton");
    SmartAC ac = new SmartAC("LG");
    SmartTV tv = new SmartTV("Samsung");

    public void smartLightController(){
        light.deviceOn();
        light.increaseSetting();
        light.decreaseSetting();
        light.deviceOff();
    }

    public void fanController(){
        fan.deviceOn();
        fan.increaseSetting();
        fan.decreaseSetting();
        fan.deviceOff();
    }

    public void acController(){
        ac.deviceOn();
        ac.increaseSetting();
        ac.decreaseSetting();
        ac.deviceOff();
    }
    public void tvController(){
        tv.deviceOn();
        tv.increaseSetting();
        tv.decreaseSetting();
        tv.deviceOff();
    }
}

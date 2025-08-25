package app;
import controller.*;
public class Main {
    public static void main(String args[]){

        DeviceController controller = new DeviceController();
        controller.smartLightController();
        System.out.println();
        System.out.println();
        controller.fanController();
        System.out.println();
        System.out.println();
        controller.acController();
        System.out.println();
        System.out.println();
        controller.tvController();


    }
}

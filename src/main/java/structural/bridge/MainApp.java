package structural.bridge;

import structural.bridge.devices.Device;
import structural.bridge.devices.Radio;
import structural.bridge.devices.TV;
import structural.bridge.remotes.AdvancedRemote;
import structural.bridge.remotes.BasicRemote;

public class MainApp {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}

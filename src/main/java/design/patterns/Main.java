package design.patterns;

import design.patterns.devices.Device;
import design.patterns.devices.Radio;
import design.patterns.devices.Tv;
import design.patterns.remotes.AdvancedRemote;
import design.patterns.remotes.BasicRemote;

public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
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
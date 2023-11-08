package pl.wiktornobis;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private HeadPhones headPhones;

    List<USBDevice> usbDevices = new ArrayList<>();

    public Computer(Monitor monitor) {
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public HeadPhones getHeadPhones() {
        return headPhones;
    }

    public void setHeadPhones(HeadPhones headPhones) {
        this.headPhones = headPhones;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }
}

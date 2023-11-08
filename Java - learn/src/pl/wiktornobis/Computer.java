package pl.wiktornobis;

import pl.wiktornobis.drive.Drive;
import usbdevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private HeadPhones headPhones;

    List<USBDevice> usbDevices = new ArrayList<>();

    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
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

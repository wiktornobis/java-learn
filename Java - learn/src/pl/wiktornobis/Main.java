package pl.wiktornobis;

import pl.wiktornobis.drive.HDDDrive;
import pl.wiktornobis.drive.SSDDrive;
import usbdevice.MemoryStick;
import usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {

        Monitor monitor = new Monitor();
//        HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();
        Computer computer = new Computer(monitor, drive);

//        drive.addFile(new File("jsnp.jpg"));
//        drive.listFiles();

        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mysz");

        computer.addUSBDevice(memoryStick);
        computer.addUSBDevice(mouse);

        memoryStick.eject();

        computer.removeUSBDevice(memoryStick);
        computer.removeUSBDevice(mouse);


    }
}

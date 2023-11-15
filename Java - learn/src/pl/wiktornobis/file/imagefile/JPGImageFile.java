package pl.wiktornobis.file.imagefile;

import pl.wiktornobis.file.File;
import pl.wiktornobis.file.FileType;

public class JPGImageFile  implements File {
    String name;
    int size;
    FileType fileType;
    int compression;


    public JPGImageFile(String name, int size, FileType fileType, int compression) {
        this.name = name;
        this.size = size;
        this.fileType = fileType;
        this.compression = compression;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public FileType getType() {
        return null;
    }

    public int getCompression() {
        return this.compression;
    }

    public void displayImage() {
        System.out.println("Displaying JPG");
    }

}

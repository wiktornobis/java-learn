package pl.wiktornobis.file.imagefile;

public class JPGImageFile  extends AbstractImageFile {
    private int compression;
    public JPGImageFile(String name, int size, int compression) {
        super(name, size);

        this.compression = compression;
    }


    public int getCompression() {
        return this.compression;
    }

    public void displayImage() {
        System.out.println("Displaying JPG");
    }

}

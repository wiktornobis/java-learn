package pl.wiktornobis.file.imagefile;

import pl.wiktornobis.file.AbstractFile;
import pl.wiktornobis.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {
    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }


}

package pl.wiktornobis.drive;

import pl.wiktornobis.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}

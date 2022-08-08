package pl.klemi.drive;

import pl.klemi.file.File;

public interface Drive {
    void addFile(File file);
    void listFile();
    File findFile (String name);
}

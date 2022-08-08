package pl.klemi.file.imagefile;

import pl.klemi.file.AbstractFile;
import pl.klemi.file.FileType;

public abstract class AbstractImageFile extends AbstractFile{

    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}

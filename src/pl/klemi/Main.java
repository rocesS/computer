package pl.klemi;

import pl.klemi.drive.HDDDrive;
import pl.klemi.drive.SSDDrive;
import pl.klemi.file.File;
import pl.klemi.file.imagefile.GIFImageFile;
import pl.klemi.file.imagefile.JPGImageFile;
import pl.klemi.file.musicfile.MP3MusicFile;
import pl.klemi.usbdevice.MemoryStick;
import pl.klemi.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {
        JPGImageFile jpgImageFile = new JPGImageFile("plik1.jpg", 100, 100);


        System.out.println(jpgImageFile instanceof JPGImageFile);
    }
}
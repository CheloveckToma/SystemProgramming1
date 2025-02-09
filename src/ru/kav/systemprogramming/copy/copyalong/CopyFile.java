package ru.kav.systemprogramming.copy.copyalong;

import ru.kav.systemprogramming.readandwritefile.readfile.FileRead;
import ru.kav.systemprogramming.readandwritefile.writefile.FileWrite;

import java.util.ArrayList;

public class CopyFile extends Thread {

    String pathForRead;
    String pathForWrite;

    CopyFile(String pathForRead, String pathForWrite) {
        this.pathForRead = pathForRead;
        this.pathForWrite = pathForWrite;
    }

    public void run() {
        long firstTime = System.currentTimeMillis();
        ArrayList text = FileRead.readFile(pathForRead);
        FileWrite.fileWrite(text, pathForWrite);
        long secondTime = System.currentTimeMillis();
        System.out.println("Время выполнения:" + (secondTime - firstTime) + " мс");
    }
}

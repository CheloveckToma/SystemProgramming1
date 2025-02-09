package ru.kav.systemprogramming.copy.copyconsistently;

import ru.kav.systemprogramming.readandwritefile.readfile.FileRead;
import ru.kav.systemprogramming.readandwritefile.writefile.FileWrite;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        long firstTime = System.currentTimeMillis();

        ArrayList readText = FileRead.readFile("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithoutnio\\\\fileOne.txt");
        FileWrite.fileWrite(readText, "src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithoutnio\\\\fileTwo.txt");
        ArrayList textToWrite = FileRead.readFile("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithoutnio\\\\fileOne.txt");
        FileWrite.fileWrite(textToWrite, "src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithoutnio\\\\fileTwo.txt");

        long secondTime = System.currentTimeMillis();
        System.out.println("Время выполнения программы: " + (secondTime-firstTime));

    }
}

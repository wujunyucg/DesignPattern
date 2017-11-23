package chapter01.adapter.exam;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file/file.text");
            fileIO.setValue("year", "2014");
            fileIO.setValue("month", "4");
            fileIO.setValue("day", "21");
            fileIO.writeToFile("file/newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

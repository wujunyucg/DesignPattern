package chapter07.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataBase {
    private DataBase() {

    }

    //根据数据库名获取 properties
    public static Properties getProperties(String dbName) {
        String fileName = "file/facade/" + dbName + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(fileName));
        } catch (IOException e) {
            System.out.println("Warning: " + fileName + " is not found.");
        }
        return prop;
    }
}

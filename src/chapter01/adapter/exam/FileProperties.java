package chapter01.adapter.exam;

import java.io.*;
import java.util.Properties;

public class FileProperties extends FileIO{
    Properties properties;

    public FileProperties() {
        this.properties = new Properties();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        InputStream stream = new FileInputStream(filename) ;
        properties.load(stream);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        OutputStream out = new FileOutputStream(fileName);
        properties.store(out, "write by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}

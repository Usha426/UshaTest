package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
    public Properties getProperty(String fileNameWithPath) {
        try {
            FileInputStream fileInput = new FileInputStream(new File(fileNameWithPath));
            Properties properties = new Properties();
            properties.load(fileInput);
            return properties;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Failed to read properties file");
    }
}


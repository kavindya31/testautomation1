package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {

    private Properties getData(String fileName) {

        Properties prop = new Properties();

        try (InputStream input = getClass()
                .getClassLoader()
                .getResourceAsStream(fileName + ".properties")) {

            if (input == null) {
                throw new RuntimeException(fileName + ".properties not found.");
            }

            prop.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }

    public String getProperty(String fileName, String key) {
        return getData(fileName).getProperty(key);
    }
}
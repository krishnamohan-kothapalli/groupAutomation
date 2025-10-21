package appManager;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class propertyFileReader {

    private static Properties prop = new Properties();

    static {
        try (InputStream input = new FileInputStream("src/test/resources/local.properties")) {
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Could not read local.properties");
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }

    public static int getInt(String key) {
        return Integer.parseInt(prop.getProperty(key));
    }

}

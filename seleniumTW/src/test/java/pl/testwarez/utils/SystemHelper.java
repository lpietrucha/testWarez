package pl.testwarez.utils;


public class SystemHelper {

    public static String getSystemPropertyOrDefault(String propertyName, String defaultValue) {
        String value = java.lang.System.getProperty(propertyName);
        if (value == null || "".equals(value)) {
            value = defaultValue;
        }
        //log.info("As property: {} setting: {}", propertyName, value);
        return value;
    }
}

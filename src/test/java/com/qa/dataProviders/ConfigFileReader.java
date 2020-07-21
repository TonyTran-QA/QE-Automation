package com.qa.dataProviders;


import com.qa.enums.DriverType;
import com.qa.enums.EnvirenmentType;
import com.servicecorp.core.utils.ReadProperties;

public class ConfigFileReader {

//    private Properties properties;
//    private final String propertyFilePath = "configs//Configuration.properties";
//
//
//    public ConfigFileReader() {
//        BufferedReader reader;
//        try {
//            reader = new BufferedReader(new FileReader(propertyFilePath));
//            properties = new Properties();
//            try {
//                properties.load(reader);
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
//        }
//    }

    public String getDriverPath() {
        String driverPath = ReadProperties.getConfig("driverPath");
        if (driverPath != null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public long getImplicitlyWait() {
        String implicitlyWait = ReadProperties.getConfig("implicitlyWait");
        if (implicitlyWait != null) {
            try {
                return Long.parseLong(implicitlyWait);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
            }
        }
        return 30;
    }

    public String getApplicationUrl() {
        String url = ReadProperties.getConfig("url");
        if (url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public DriverType getBrowser() {
        String browserName = ReadProperties.getConfig("run-browser");
        switch (browserName) {
            case "chrome":
                return DriverType.CHROME;
            case "firefox":
                return DriverType.FIREFOX;
            case "MicrosoftEdge":
                return DriverType.EDGE;
            case "sarafi":
                return DriverType.SAFARI;
            default:
                throw new RuntimeException("Unexpected value: " + browserName);
        }

    }

    public EnvirenmentType getEnvirenmentType() {
        String environmentName = ReadProperties.getConfig("environment");
        if (environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvirenmentType.LOCAL;
        else if (environmentName.equals("remote")) return EnvirenmentType.REMOTE;
        else
            throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
    }

    public Boolean getBrowserWindowSize() {
        String windowSize = ReadProperties.getConfig("browser-size");
        if (windowSize != null) return Boolean.valueOf(windowSize);
        return true;
    }

}

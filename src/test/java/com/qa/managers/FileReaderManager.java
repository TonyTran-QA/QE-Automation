package com.qa.managers;

import com.qa.dataProviders.ConfigFileReader;
import com.qa.dataProviders.JsonDataReader;
import org.testng.ReporterConfig;

public class FileReaderManager {
    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader configFileReader;
    private static JsonDataReader jsonDataReader;
    private static ReporterConfig reporterConfig;

    public FileReaderManager() {
    }
    public static FileReaderManager getInstance(){
        return fileReaderManager;
    }
    public ConfigFileReader getConfigReader (){
        return (configFileReader==null)? new ConfigFileReader(): configFileReader;
    }
    public JsonDataReader getJsonReader(){
        return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
    }
    public ReporterConfig getReporterConfig()
    {
        return (reporterConfig == null) ? new ReporterConfig() : reporterConfig;
    }
}

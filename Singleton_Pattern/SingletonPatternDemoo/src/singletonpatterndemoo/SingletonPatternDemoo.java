package singletonpatterndemoo;
class ConfigurationManager {
    private static ConfigurationManager instance;
    private String appName;
    private String version;
    private ConfigurationManager() {
        this.appName = "MyApplication";
        this.version = "1.0";
    }
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }
    public String getAppName() {
        return appName;
    }
    public String getVersion() {
        return version;
    }
    public void displayConfig() {
        System.out.println("Application Name: " + appName);
        System.out.println("Version: " + version);
    }
}
public class SingletonPatternDemoo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.displayConfig();
    }
}


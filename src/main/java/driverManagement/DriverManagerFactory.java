package driverManagement;

public class DriverManagerFactory {

    public static DriverManager getDriverManager(DriverType type) {
        DriverManager driverManager;

        //here is possible to add any browser of interest
        //by creating corresponding driver manager and adding it as switch option
        switch (type) {
            default:
                driverManager = new ChromeDriverManager();
        }
        return driverManager;
    }
}

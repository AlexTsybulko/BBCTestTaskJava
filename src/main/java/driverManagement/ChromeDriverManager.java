package driverManagement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {

    protected void createWebDriver() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver(options);
    }
}

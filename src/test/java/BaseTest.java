import driverManagement.DriverManager;
import driverManagement.DriverManagerFactory;
import driverManagement.DriverType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    DriverManager driverManager;
    WebDriver driver;

    @Before
    public void setUp(){
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
    }

    public void getUrl(String url){
        driver.get(url);
    }

    @After
    public void tearDown(){
        driverManager.quitWebDriver();
    }
}

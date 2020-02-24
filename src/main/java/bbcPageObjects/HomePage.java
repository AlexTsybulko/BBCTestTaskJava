package bbcPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "idcta-username")
    private WebElement yourAccountLink;

    public WebElement getYourAccountLink() {
        return yourAccountLink;
    }

    public String getAccountLinkInnerText(){
        return getYourAccountLink().getAttribute("innerText");
    }

    public void waitForAccountNameChanged(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(getYourAccountLink(), "Your account"));
    }
}

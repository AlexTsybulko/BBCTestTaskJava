package bbcPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseAgePage extends BasePage{
    WebDriver driver;

    public ChooseAgePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "a[aria-label = 'Under 13']")
    private WebElement underThirteenBtn;

    @FindBy(css = "a[aria-label = '13 or over']")
    private WebElement thirteenOrOverBtn;

    @FindBy(css = "a[aria-label = 'Go to the BBC Homepage']")
    private WebElement bbcLogoLink;

    public WebElement getUnderThirteenBtn() {
        return underThirteenBtn;
    }

    public WebElement getThirteenOrOverBtn() {
        return thirteenOrOverBtn;
    }

    public void clickThirteenOrOverBtn(){
        getThirteenOrOverBtn().click();
    }

    public void clickUnderThirteenBtn(){
        getUnderThirteenBtn().click();
    }
}

package bbcPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessSignInPage extends BasePage {

    public SuccessSignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".header__title--success")
    private WebElement successHeader;

    @FindBy(id = "submit-button")
    private WebElement continueBtn;

    @FindBy(css = "label[for = 'optIn']")
    private WebElement marketingEmailsYesBtn;

    @FindBy(css = "label[for = 'optOut']")
    private WebElement marketingEmailsNoBtn;

    public WebElement getContinueBtn() {
        return continueBtn;
    }

    public WebElement getMarketingEmailsYesBtn() {
        return marketingEmailsYesBtn;
    }

    public WebElement getMarketingEmailsNoBtn() {
        return marketingEmailsNoBtn;
    }

    public WebElement getSuccessHeader() {
        return successHeader;
    }

    public void clickContinueBtn() {
        getContinueBtn().click();
    }

    public void clickMarketingEmailsYesBtn() {
        getMarketingEmailsYesBtn().click();
    }

    public void clickMarketingEmailsNoBtn() {
        getMarketingEmailsNoBtn().click();
    }

    public void randomAdsAgree() {
        if (Math.random() < 0.5) {
            clickMarketingEmailsYesBtn();
        } else {
            clickMarketingEmailsNoBtn();
        }
    }
}
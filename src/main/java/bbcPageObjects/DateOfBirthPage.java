package bbcPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static net.andreinc.mockneat.unit.types.Ints.ints;

public class DateOfBirthPage extends BasePage{

    public DateOfBirthPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    private WebElement header;

    @FindBy(id = "day-input")
    private WebElement dayOfBirthTxt;

    @FindBy(id = "month-input")
    private WebElement monthOfBirthTxt;

    @FindBy(id = "year-input")
    private WebElement yearOfBirthTxt;

    @FindBy(id = "submit-button")
    private WebElement continueBtn;

    public WebElement getDayOfBirth() {
        return dayOfBirthTxt;
    }

    public WebElement getMonthOfBirth() {
        return monthOfBirthTxt;
    }

    public WebElement getYearOfBirth() {
        return yearOfBirthTxt;
    }

    public WebElement getContinueBtn() {
        return continueBtn;
    }

    public int generateRandomDay() {
        return ints().range(1, 28).get();
    }

    public int generateRandomMonth() {
        return ints().range(1, 12).get();
    }

    public int generateRandomYear() {
        return ints().range(1940, 2005).get();
    }

    public void clickContinue(){
        waitForElementPresent(driver, getContinueBtn());
        waitForElementToBeClickable(driver, getContinueBtn());
        getContinueBtn().click();
    }

    public void enterRandomDateOfBirth(){
        waitForElementPresent(driver, getDayOfBirth());
        getDayOfBirth().sendKeys(Integer.toString(generateRandomDay()));
        getMonthOfBirth().sendKeys(Integer.toString(generateRandomMonth()));
        getYearOfBirth().sendKeys(Integer.toString(generateRandomYear()));
    }
}

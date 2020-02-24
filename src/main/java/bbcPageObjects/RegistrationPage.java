package bbcPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static net.andreinc.mockneat.types.enums.PassStrengthType.STRONG;
import static net.andreinc.mockneat.unit.text.Strings.strings;
import static net.andreinc.mockneat.unit.types.Ints.ints;
import static net.andreinc.mockneat.unit.user.Emails.emails;
import static net.andreinc.mockneat.unit.user.Passwords.passwords;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-identifier-input")
    private WebElement emailTxt;

    @FindBy(id = "password-input")
    private WebElement passwordTxt;

    @FindBy(id = "location-select")
    private WebElement selectCountry;

    @FindBy(id = "submit-button")
    private WebElement registerBtn;

    public WebElement getEmailTxt() {
        return emailTxt;
    }

    public WebElement getPasswordTxt() {
        return passwordTxt;
    }

    public WebElement getRegisterBtn() {
        return registerBtn;
    }

    public String generateRandomEmail() { return emails().get(); }

    public String generateRandomPassword(){
        return strings().size(1).get().toUpperCase()+passwords().type(STRONG).get()+ints().bound(10).get();
    }

    public WebElement getSelectCountry() {
        return selectCountry;
    }

    public boolean isEmailIncorrect(){
        return driver.findElements(By.cssSelector("input[aria-invalid='true'][id ='user-identifier-input']")).size() > 0;
    }

    public boolean isPasswordIncorrect(){
        return driver.findElements(By.cssSelector("input[aria-invalid='true'][id ='password-input']")).size() > 0;
    }

    public void setRandomEmail(){
        getEmailTxt().sendKeys(generateRandomEmail());
        getEmailTxt().sendKeys(Keys.TAB);
    }

    public void setRandomPassword(){
        getPasswordTxt().sendKeys(generateRandomPassword());
        getPasswordTxt().sendKeys(Keys.TAB);
    }

    public void clickRegisterBtn(){
        getRegisterBtn().click();
    }

    public void setEmailWithCheckingCorrectness(){
        setRandomEmail();
        while (isEmailIncorrect()){
            getEmailTxt().clear();
            setRandomEmail();
        }
    }

    public void setPasswordWithCheckingCorrectness(){
        setRandomPassword();
        while (isPasswordIncorrect()) {
            getPasswordTxt().clear();
            setRandomPassword();
        }
    }

    public void selectRandomCountry() {
        Select select = new Select(getSelectCountry());
        select.selectByIndex(ints().range(1,247).get());
    }

    public void enterRegistrationData(){
        waitForElementPresent(driver, getEmailTxt());
        setEmailWithCheckingCorrectness();
        setPasswordWithCheckingCorrectness();
        selectRandomCountry();
    }
}

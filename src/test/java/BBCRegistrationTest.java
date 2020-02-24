import bbcPageObjects.*;
import org.junit.Test;

import static net.andreinc.mockneat.types.enums.PassStrengthType.STRONG;
import static net.andreinc.mockneat.unit.text.Strings.strings;
import static net.andreinc.mockneat.unit.user.Passwords.passwords;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BBCRegistrationTest extends BaseTest{

    String url = "https://account.bbc.com/register";

    @Test
    public void bbcRegistrationTest() throws InterruptedException {

        //get desired url
        getUrl(url);

        //click thirteen or over btn because of impossibility
        //of using under thirteen account outside the UK
        ChooseAgePage chooseAgePage = new ChooseAgePage(driver);
        chooseAgePage.clickThirteenOrOverBtn();

        //enter random date of birth on just opened page and continue
        DateOfBirthPage dateOfBirthPage = new DateOfBirthPage(driver);
        dateOfBirthPage.enterRandomDateOfBirth();
        dateOfBirthPage.clickContinue();

        //enter random registration data and register
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.enterRegistrationData();
        registrationPage.clickRegisterBtn();

        //check visibility of success header on final registration page
        //agree or no for marketing emails
        SuccessSignInPage successSignInPage = new SuccessSignInPage(driver);
        assertTrue(successSignInPage.getSuccessHeader().isDisplayed());
        successSignInPage.randomAdsAgree();
        successSignInPage.clickContinueBtn();

        //check 'your account' caption for personal account link on site
        //which means you have an account from the moment
        HomePage homePage = new HomePage(driver);
        assertEquals("Your account", homePage.getAccountLinkInnerText());
    }
}

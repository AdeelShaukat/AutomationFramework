import WebTestBase.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;

public class SampleTest extends BaseTest {
        @Test (priority = 1)
        public void sampleMethodForEmailEntering() throws InterruptedException {
           HomePageEvents homePageEvents = new HomePageEvents();
            homePageEvents.clickOnSignInButton();
            LoginPageEvents loginPageEvents = new LoginPageEvents();
            loginPageEvents.VerifyNewUserSignUP();
            loginPageEvents.enterNameAndEmailId();
            loginPageEvents.clickSignUpButton();
            loginPageEvents.verifyEnterAccountInfoDisplayed();
            loginPageEvents.enterAccountInfo();
            loginPageEvents.clickSignUpForNewsLetter();
            loginPageEvents.addAddressInformation();
            loginPageEvents.clickCreateAccount();
            loginPageEvents.verifyAccountCreated();
            loginPageEvents.clickContinueButton();
            loginPageEvents.clickDeleteAccountButton();
        }





}

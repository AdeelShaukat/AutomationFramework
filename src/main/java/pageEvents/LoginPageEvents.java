package pageEvents;

import utils.ElementFetch;
import org.testng.Assert;
import pageObjects.LoginPageElements;
import org.openqa.selenium.support.ui.Select;
import utils.TestDataReader;

public class LoginPageEvents {
    ElementFetch elementFetch = new ElementFetch();
    public static final String TEST_DATA_USER_NAME = "testdata.user.name";
    public static final String TEST_DATA_USER_EMAIL = "testdata.user.email";
    public void verifyLoginPageOpenOrNot(){
        Assert.assertTrue(elementFetch.getListWebElements("XPath", LoginPageElements.createAccountText).size()>0, "Login Page did not open");
    }
    public void enterNameAndEmailId(){
        elementFetch.getWebElement("XPath", LoginPageElements.name).sendKeys(TestDataReader.getTestData(TEST_DATA_USER_NAME));
        elementFetch.getWebElement("XPath", LoginPageElements.emailAddress).sendKeys(TestDataReader.getTestData(TEST_DATA_USER_EMAIL));
    }

    public void VerifyNewUserSignUP(){
        Assert.assertTrue(elementFetch.getWebElement("XPath", LoginPageElements.verifySignUp).isDisplayed(), "New User Sign Up Page Displays");
    }

    public void clickSignUpButton(){
        elementFetch.getWebElement("XPath", LoginPageElements.signUp).click();
    }

    public void verifyEnterAccountInfoDisplayed(){
        Assert.assertTrue(elementFetch.getWebElement("XPath", LoginPageElements.accountInfoDisplay).isDisplayed());
    }

    public void enterAccountInfo() throws InterruptedException {
        elementFetch.getWebElement("XPath", LoginPageElements.maleGender).click();
        //elementFetch.getWebElement("XPath", LoginPageElements.name).sendKeys("Test");
        //elementFetch.getWebElement("XPath", LoginPageElements.emailAddress).sendKeys("test?test@gmail.com");
        elementFetch.getWebElement("XPath", LoginPageElements.password).sendKeys("Test");
        Select dateSelect = new Select(elementFetch.getWebElement("XPath", LoginPageElements.date));
        dateSelect.selectByValue("28");
        Thread.sleep(5000);
        Select monthSelect = new Select(elementFetch.getWebElement("XPath", LoginPageElements.month));
        monthSelect.selectByValue("7");
        Thread.sleep(5000);
        Select yearSelect = new Select(elementFetch.getWebElement("XPath", LoginPageElements.year));
        yearSelect.selectByValue("2019");
    }

    public void clickSignUpForNewsLetter(){
        elementFetch.getWebElement("XPath", LoginPageElements.newsLetter).click();
        elementFetch.getWebElement("XPath", LoginPageElements.specialOffers).click();
    }

    public void addAddressInformation(){
        elementFetch.getWebElement("XPath", LoginPageElements.firstName).sendKeys("Test");
        elementFetch.getWebElement("XPath", LoginPageElements.lastName).sendKeys("Test");
        elementFetch.getWebElement("XPath", LoginPageElements.company).sendKeys("Test");
        elementFetch.getWebElement("XPath", LoginPageElements.address).sendKeys("Test");
        elementFetch.getWebElement("XPath", LoginPageElements.address_2).sendKeys("Test");
        Select selectCountry = new Select(elementFetch.getWebElement("XPath", LoginPageElements.country));
        selectCountry.selectByValue("Canada");
        elementFetch.getWebElement("XPath", LoginPageElements.state).sendKeys("Test");
        elementFetch.getWebElement("XPath", LoginPageElements.city).sendKeys("Test");
        elementFetch.getWebElement("XPath", LoginPageElements.zipCode).sendKeys("10001");
        elementFetch.getWebElement("XPath", LoginPageElements.mobileNumber).sendKeys("00000000000");
    }

    public void clickCreateAccount(){
        elementFetch.getWebElement("XPath", LoginPageElements.createAccount).click();
    }

    public void verifyAccountCreated(){
        Assert.assertTrue(elementFetch.getWebElement("XPath", LoginPageElements.accountCreated).isDisplayed(), "Account is created");
    }

    public void clickContinueButton(){
        elementFetch.getWebElement("XPath", LoginPageElements.continueButton).click();
    }

    public void clickDeleteAccountButton(){
        elementFetch.getWebElement("XPath", LoginPageElements.deleteAccount).click();
    }


}

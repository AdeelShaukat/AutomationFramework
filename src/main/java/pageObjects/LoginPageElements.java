package pageObjects;

import java.util.Scanner;

public interface LoginPageElements {
    String createAccountText = "//h3[normalize-space()='Create an account']";
    String verifySignUp = "//h2[normalize-space()='New User Signup!']";
    String name = "//input[@placeholder='Name']";
    String emailAddress = "//input[@data-qa='signup-email']";
    String signUp = "//button[normalize-space()='Signup']";
    String accountInfoDisplay = "//b[normalize-space()='Enter Account Information']";
    String maleGender = "//input[@id='id_gender1']";
    String password = "//input[@id=\"password\"]";
    String date = "//select[@id='days']";
    String month = "//div[@id=\"uniform-months\"]/select[@id='months']";
    String year = "//div[@id=\"uniform-years\"]/select[@id=\"years\"]";
    String newsLetter = "//input[@id='newsletter']";
    String specialOffers = "//input[@id='optin']";
    String firstName = "//input[@id='first_name']";
    String lastName = "//input[@id='last_name']";
    String company = "//input[@id='company']";
    String address = "//input[@id='address1']";
    String address_2 = "//input[@id='address2']";
    String country = "//select[@id='country']";
    String state = "//input[@id='state']";
    String city = "//input[@id='city']";
    String zipCode = "//input[@id='zipcode']";
    String mobileNumber = "//input[@id='mobile_number']";
    String createAccount = "//button[normalize-space()='Create Account']";
    String accountCreated = "//b[normalize-space()='Account Created!']";
    String continueButton = "//a[normalize-space()='Continue']";
    String deleteAccount = "//a[normalize-space()='Delete Account']";


}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {

    @FindBy(xpath = "//*[text() = 'Create an Account']")
    WebElement createAccountButton;

    @FindBy (id = "firstname")
    WebElement firstNameField;

    @FindBy (id = "lastname")
    WebElement lastNameField;

    @FindBy (id = "email_address")
    WebElement emailFieldCreateUser;

    @FindBy (id = "password")
    WebElement passwordFieldCreateUser;

    @FindBy (id = "password-confirmation")
    WebElement passwordConfirmation;

    @FindBy(xpath = "//button[@title='Create an Account']")
    WebElement confirmCreation;

    @FindBy (xpath = "//*[@id=\"html-body\"]/div[2]/header/div[2]/a/img")
    WebElement homeScreenButton;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }


    public void createAccount(String firstname , String lastname , String email , String password , String passwordconfirmation ) {
        type(firstNameField , firstname);
        type(lastNameField , lastname);
        type(emailFieldCreateUser , email);
        type(passwordFieldCreateUser ,password);
        type(passwordConfirmation , passwordconfirmation);
        confirmCreation.click();
    }



}

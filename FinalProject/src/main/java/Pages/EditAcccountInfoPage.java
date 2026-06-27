package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAcccountInfoPage extends BasePage {

    @FindBy(id = "firstname")
    WebElement firstNameField;

    @FindBy(id = "lastname")
    WebElement lastNameField;

    @FindBy(id = "change-email")
    WebElement changeEmailCheckbox;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "current-password")
    WebElement currentPasswordField;

    @FindBy(id = "change-password")
    WebElement changePasswordCheckbox;

    @FindBy(id = "password")
    WebElement newPasswordField;

    @FindBy(id = "password-confirmation")
    WebElement confirmPasswordField;

    @FindBy(xpath = "//button[@title='Save']")
    WebElement saveButton;

    public EditAcccountInfoPage(WebDriver driver) {
        super(driver);
    }

    public void updateAccountData(String fName, String lName, String newEmail, String currentPassword) {
        type(firstNameField, fName);
        type(lastNameField, lName);
        if (!changeEmailCheckbox.isSelected()) {
            click(changeEmailCheckbox);
        }
        type(emailField, newEmail);
        type(currentPasswordField, currentPassword);
        click(saveButton);
    }

    public void changePassword(String currentPass, String newPass) {
        if (!changePasswordCheckbox.isSelected()) {
            click(changePasswordCheckbox);
        }
        type(currentPasswordField, currentPass);
        type(newPasswordField, newPass);
        type(confirmPasswordField, newPass);
        click(saveButton);
    }
}
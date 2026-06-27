package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/p[5]/span/a/strong")
    WebElement logToAdminPage;

    @FindBy (id = "username")
    WebElement adminUserName;

    @FindBy (id = "login")
    WebElement adminPassword;

    @FindBy (xpath = "//*[@id=\"login-form\"]/fieldset/div[3]/div[1]/button")
    WebElement adminSignInButton;

    public AdminLoginPage(WebDriver driver) {
        super(driver);
    }

    public void AdminLogin() {
        type(adminUserName,"demo");
        type(adminPassword,"1q2w3e4r5t");
        click(adminSignInButton);
    }
}

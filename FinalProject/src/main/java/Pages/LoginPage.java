package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
//----------------------------------------------------------------------------------------------------------------------
    @FindBy(id = "email")
    WebElement emailField;

    @FindBy (id = "password")
    WebElement passwordField;

    @FindBy(className = "authorization-link")
    WebElement loginButton;

    @FindBy(css = ".action.login.primary")
    WebElement submitButton;

    @FindBy (xpath = "//*[@id=\"html-body\"]/div[2]/header/div[1]/div/ul/li[2]/span\n")
    WebElement arrowButton; //Arrow on the upright button
//----------------------------------------------------------------------------------------------------------------------

    public void enterEmail(String email){
        type(emailField , email);
    }

    public void enterPassword(String password){
        type(passwordField , password);
    }

    public void logIn(String email , String password){
        click(loginButton);
        enterEmail(email);
        enterPassword(password);
        click(submitButton);
    }
}

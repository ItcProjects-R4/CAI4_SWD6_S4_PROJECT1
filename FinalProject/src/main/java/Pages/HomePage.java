package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage extends BasePage {
    //------------------------------------------------Home Page Locators ---------------------------------------------------
    @FindBy(id = "ui-id-2")
    WebElement whatsNewButton; //what's new button

    @FindBy (xpath = "//*[@id=\"html-body\"]/div[2]/header/div[2]/a/img")
    WebElement homeScreenButton; //home button

    @FindBy(xpath = "//*[text() = 'Create an Account']")
    WebElement createAccountButton;//”Create an account” button

    @FindBy(className = "authorization-link")
    WebElement loginButton; //login button

    @FindBy(xpath= "//*[@id=\"html-body\"]/div[2]/header/div[1]/div/ul/li[2]/span\n")
    WebElement arrowButton; //Arrow on the upright button

    @FindBy (xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")
    WebElement myAccountButton; //From the upper right arrow

    @FindBy (xpath = "//*[@id=\"html-body\"]/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[2]/a")
    WebElement wishListButton; //From the upper right arrow

    @FindBy (xpath = "//*[@id=\"html-body\"]/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
    WebElement signOutButton; //From the upper right arrow

    @FindBy (linkText = "Log into the administrator panel")
    WebElement adminLoginPage;

    //    @FindBy (linkText = "/html/body/div[2]/main/div[3]/div/div[2]/div[2]/p[5]/span/a/strong")
//    WebElement adminLoginPage;
//----------------------------------------------------------------------------------------------------------------------
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void whatsNewButton(){
        click(whatsNewButton);
    }

    public void arrowButton(){
        click(arrowButton);
    }

    public void createAccountButton() {
        click(createAccountButton);
    }


    public void myAccount(){
        arrowButton();
        click(myAccountButton);
    }

    public void adminLoginPage() {
        click(adminLoginPage);
    }

    public void HomePageButton() {
        click(homeScreenButton);
    }

}

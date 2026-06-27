package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminCustomerPage extends BasePage {

    @FindBy(id = "fulltext")
    WebElement searchUserField;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/button")
    WebElement searchUserButton;

    @FindBy (xpath = "//*[contains(@class, 'action-accept')]")
    WebElement okButton;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/a")
    WebElement adminMenuButton;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/ul/li[2]/a")
    WebElement adminSignOutButton;

    @FindBy (xpath = "//*[@id=\"container\"]/div/div[2]/div[2]/div[1]/div/div/ul/li[1]/span")
    WebElement deleteButton;

    @FindBy (xpath = "/html/body/div[2]/main/div[2]/div/div/div/div[4]/table/tbody/tr[2]/td[1]/label/input")
    WebElement checkButton;

    @FindBy (xpath = "//*[@id=\"container\"]/div/div[2]/div[2]/div[1]/div/button")
    WebElement actionsButton;

    public AdminCustomerPage(WebDriver driver) {
        super(driver);
    }

    public void getMyUser(String email) {
        type(searchUserField , email );
        click(searchUserButton);
        click(checkButton);
        click(actionsButton);
        click(deleteButton);
        click(okButton);
    }

    public void signout() {
        click(adminMenuButton);
        click(adminSignOutButton);
    }
}

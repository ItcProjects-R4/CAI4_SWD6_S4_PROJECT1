package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a[1]")
    WebElement editButton; //”Edit” Button (contact information)

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[1]/a/span")
    WebElement manageAddressButton;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a[2]")
    WebElement changePasswordButton;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    public void manageAddress(){
        click(manageAddressButton);
    }

    public void clickEditContactInfo() {
        click(editButton);
    }

    public void clickChangePassword() {
        click(changePasswordButton);
    }


}

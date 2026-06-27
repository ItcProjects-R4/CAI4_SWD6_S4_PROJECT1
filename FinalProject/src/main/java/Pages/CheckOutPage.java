package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input")
    WebElement checkButton; //shipping method button

    @FindBy (xpath = "//*[@id=\"shipping-method-buttons-container\"]/div/button")
    WebElement nextButton; //"Next" Button

    public void productCheckOut(){
        click(checkButton);
        click(nextButton);
    }
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
}

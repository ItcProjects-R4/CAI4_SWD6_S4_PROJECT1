package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentMethodPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")
    WebElement placeOrder; //"Place order" Button

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div/div/a")
    WebElement continueShopping; //"Continue Shopping" Button

    public void placeOrder(){
        click(placeOrder);
        click(continueShopping);
    }
    public PaymentMethodPage(WebDriver driver) {
        super(driver);
    }
}

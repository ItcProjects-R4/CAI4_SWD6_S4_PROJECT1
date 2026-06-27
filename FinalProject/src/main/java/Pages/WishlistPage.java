package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WishlistPage extends BasePage {

    @FindBy (xpath = "/html/body/div[2]/main/div[2]/div[1]/form/div[1]/ol/li[1]/div/a/span/span")
    WebElement product3;

    @FindBy (xpath = "/html/body/div[2]/main/div[2]/div[1]/form/div[1]/ol/li[1]/div/div[3]/div[2]/fieldset/div[2]/div/button" )
    WebElement addtocart; //add to cart button for product 3

    @FindBy (xpath = "/html/body/div[2]/main/div[2]/div[1]/form/div[1]/ol/li[2]/div/a")
    WebElement product4;



    @FindBy (xpath ="/html/body/div[2]/main/div[2]/div[1]/form/div[1]/ol/li[2]/div/div[3]/div[3]/a[2]")
    WebElement remove ; // remove button for product 4


    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        hoverElement(driver , product3);
        click(addtocart);
    }

    public void removeFromWishlist() {
        hoverElement(driver,product4);
        click(remove);
    }
}

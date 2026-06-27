package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductDetailsPage extends BasePage {

    @FindBy (xpath = "//*[contains (@class, 'towishlist')]")
    WebElement toWishlist;

    @FindBy(id = "option-label-size-144-item-171")
    public WebElement product1Size; //product 1 size selection from product details

    @FindBy(id = "option-label-size-144-item-171")
    public WebElement product2Size; //product 1 size selection from product details

    @FindBy (id = "option-label-color-93-item-49")
    public WebElement product1Color; //product 1 color selection from product details

    @FindBy (id = "option-label-color-93-item-50")
    public WebElement product2Color; //product 1 color selection from product details

    @FindBy (id = "product-addtocart-button")
    public WebElement product1AddToCart; //product 1 add to cart button from product details

    @FindBy(className = "minicart-wrapper")
    public WebElement cartIconButton; //cart icon button from product details

    @FindBy (id = "top-cart-btn-checkout")
    public WebElement product1Checkout; //product 1 checkout button from product details

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[3]/div[4]/form/div[1]/div/div/div[1]/div/div[4]")
    public WebElement size31; //size31 option of Fiona_Fitness_Short product

    @FindBy (xpath = "/html/body/div[2]/main/div[2]/div/div[3]/div[4]/form/div[1]/div/div/div[2]/div/div[3]")
    public WebElement colored; //red color option of Fiona_Fitness_Short product

    @FindBy (xpath = "/html/body/div[2]/main/div[2]/div[1]/form/div[1]/ol/li[1]")
    WebElement clickProduct;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void chooseProductDetails() {
        click(clickProduct);
        click(product1AddToCart);
    }

    public void clickWishlist() throws InterruptedException {
        click(toWishlist);
    }

    public void productDetails(){

        click(product1AddToCart);
    }

    public void product2Details(){
        click(product1AddToCart);
    }

}

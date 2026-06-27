package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WhatsNewPage extends BasePage{

    public WhatsNewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/a/span/span")
    WebElement product1;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/a/span/span")
    WebElement product2;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/a/span/span")
    WebElement product3;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/a/span/span")
    WebElement product4;

    // action.moveToElement(product1).click().perform();
    //  action.moveToElement(product2).click().perform();

    public void chooseProduct1(){
        click(product1);
    }

    public void chooseProduct2(){
        click(product2);
    }

    public void chooseProduct3(){
        click(product3);
    }

    public void chooseProduct4(){
        click(product4);
    }
}

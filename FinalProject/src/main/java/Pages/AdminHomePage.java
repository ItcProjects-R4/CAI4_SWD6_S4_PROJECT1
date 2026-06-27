package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage extends BasePage{

    @FindBy(xpath = "//*[@id=\"menu-magento-customer-customer\"]/a")
    WebElement customerButton;

    @FindBy(xpath = "//li[contains(@class,'item-customer-manage')]//span[text()='All Customers']")
    WebElement allCustomersButton;

    public AdminHomePage(WebDriver driver) {
        super(driver);
    }

    public void getUser(){
        click(customerButton);
        click(allCustomersButton);
    }
}

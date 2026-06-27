package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewAddressPage extends BasePage {
    public AddNewAddressPage(WebDriver driver) {
        super(driver);
    }
//----------------------------------------------------------------------------------------------------------------------
    @FindBy (id = "firstname")
    WebElement editAddressFirstName;

    @FindBy (id = "lastname")
    WebElement editAddressLastName;

    @FindBy (id = "company")
    WebElement companyField;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[5]/div[1]/button")
    WebElement addNewAddressButton;

    @FindBy (id = "street_1")
    WebElement street1Field;

    @FindBy (id = "street_2")
    WebElement street2Field;

    @FindBy (id = "telephone")
    WebElement PhoneNumberField;

    @FindBy (id = "city")
    WebElement cityField;

    @FindBy (id = "zip")
    WebElement zipCodedField;

    @FindBy (id = "country")
    WebElement countryButton;

    @FindBy (xpath = "/html/body/div[2]/main/div[2]/div[1]/form/fieldset[2]/div[2]/div/select/option[68]")
    WebElement CountryEgypt;

    @FindBy (id = "region")
    WebElement StateProvince;

    @FindBy (xpath = "//*[@id=\"form-validate\"]/div/div[1]/button")
    WebElement saveChangesButton;
//----------------------------------------------------------------------------------------------------------------------

    public void changeAddress(String firstName , String lastName , String company , String phoneNumber , String street1 , String street2 , String state , String city , String zipCode) throws InterruptedException { //Passed
        click(addNewAddressButton);
        type(editAddressFirstName, firstName);
        type(editAddressLastName , lastName);
        type(companyField , company);
        type(PhoneNumberField , phoneNumber);
        type(street1Field , street1);
        type(street2Field , street2);
        click(countryButton);
        click(CountryEgypt);
        type(StateProvince , state);
        type(cityField , city);
        type(zipCodedField , zipCode);
        click(saveChangesButton);
        Thread.sleep(2000);
    }
}

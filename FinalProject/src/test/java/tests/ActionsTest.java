package tests;
import Pages.*;
import org.testng.annotations.Test;
public class ActionsTest extends BaseTest {
//----------------------------------------------------------------------------------------------------------------------
    public void Login(String email , String  password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logIn(email , password);
    }

    public void CreateAccount(String firstname , String lastname , String email , String password , String passwordConfirmation){
        HomePage homePage = new HomePage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        homePage.createAccountButton();
        createAccountPage.createAccount(firstname , lastname , email , password , passwordConfirmation);
    }
//-------------------------------------------------Mohamed Hafez--------------------------------------------------------
    @Test
    public void AddToCart() throws InterruptedException {

        Login("peterparker0o0@gmail.com", "Peterparker0o0");
        HomePage homePage = new HomePage(driver);
        WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage(driver);

        homePage.whatsNewButton();
        whatsNewPage.chooseProduct1();
        productDetailsPage.productDetails();
        Thread.sleep(2000);
        productDetailsPage.click(productDetailsPage.cartIconButton);
        productDetailsPage.click(productDetailsPage.product1Checkout);
        checkOutPage.productCheckOut();
        paymentMethodPage.placeOrder();
    }

    @Test
    public void editAddress() throws InterruptedException {

        Login("peterparker0o0@gmail.com", "Peterparker0o0");
        HomePage homePage = new HomePage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddNewAddressPage addNewAddressPage = new AddNewAddressPage(driver);

        homePage.myAccount();
        myAccountPage.manageAddress();
        addNewAddressPage.changeAddress("Mohamed" , "Hafez" , "DEPI" , "01111721454" , "Abdeen" , "alsayda" , "cairo" , "cairo" , "11511");
    }
//----------------------------------------------------Rahma Osama-------------------------------------------------------
    @Test
    public void EditUserAccountInfo_Email_Name()  {

        CreateAccount("Rahma","Osama" , "rahma292@gmail.com" , "Rahma111#" , "Rahma111#");
        String email = "rahma292@gmail.com";
        HomePage homePage = new HomePage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        EditAcccountInfoPage editPage = new EditAcccountInfoPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AdminHomePage adminHomePage = new AdminHomePage(driver);
        AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
        AdminCustomerPage adminCustomerPage = new AdminCustomerPage(driver);

        homePage.myAccount();
        myAccountPage.clickEditContactInfo();
        String newEmail = "rahma2929@gmail.com";
        String currentPass = "Rahma111#";
        editPage.updateAccountData("Rahmaa", "Osama", newEmail, currentPass);
        loginPage.logIn(newEmail, currentPass);

        homePage.HomePageButton();
        homePage.adminLoginPage();
        adminLoginPage.AdminLogin();
        adminHomePage.getUser();
        adminCustomerPage.getMyUser(newEmail);
    }

    @Test
    public void ChangePassword() {

        String email = "Test223@gmail.com";
        String pass1 = "Rahma222#";
        String pass2 = "Test_123";

        // Try login with first password
        try {
            Login(email, pass1);

            HomePage homePage = new HomePage(driver);
            MyAccountPage myAccountPage = new MyAccountPage(driver);
            EditAcccountInfoPage editPage = new EditAcccountInfoPage(driver);
            homePage.myAccount();
            myAccountPage.clickChangePassword();
            editPage.changePassword(pass1, pass2);
            System.out.println("Password changed from pass1 to pass2");

        } catch (Exception e) {

            // If first login fails, try second password
            Login(email, pass2);

            HomePage homePage = new HomePage(driver);
            MyAccountPage myAccountPage = new MyAccountPage(driver);
            EditAcccountInfoPage editPage = new EditAcccountInfoPage(driver);

            homePage.myAccount();
            myAccountPage.clickChangePassword();

            editPage.changePassword(pass2, pass1);

            System.out.println("Password changed from pass2 to pass1");
        }
    }
//------------------------------------------------Marwan Mohamed--------------------------------------------------------
    @Test
    public void WishlistPage() throws InterruptedException {

        Login("peterparker0o0@gmail.com", "Peterparker0o0");
        HomePage homePage = new HomePage(driver);
        WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);

        homePage.whatsNewButton();
        whatsNewPage.chooseProduct3();
        productDetailsPage.clickWishlist();

        homePage.whatsNewButton();
        whatsNewPage.chooseProduct4();
        productDetailsPage.clickWishlist();

        wishlistPage.removeFromWishlist();
        wishlistPage.addToCart();
    }

    @Test
    public void CreateNewAccount() {
        HomePage homePage = new HomePage(driver);
        AdminHomePage adminHomePage = new AdminHomePage(driver);
        AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
        AdminCustomerPage adminCustomerPage = new AdminCustomerPage(driver);

        CreateAccount("user" , "example" , "user@example.com" , "Pass_key1@" , "Pass_key1@");
        homePage.HomePageButton();
        homePage.adminLoginPage();
        adminLoginPage.AdminLogin();
        adminHomePage.getUser();
        adminCustomerPage.getMyUser("user@example.com");
    }
}


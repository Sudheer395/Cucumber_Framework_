package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Stepdefinition.homePageStepDefinition;
 
public class Login {
 
    public static WebDriver driver;
    
    public Login(WebDriver driver) {
    	 this.driver = driver;
    	 PageFactory.initElements(driver, this);
    }
 
    @FindBy(xpath = "//span[contains(@class,'user-profile-icon')]")
    WebElement userUserProfile;
    
    @FindBy(xpath = "//a[contains(@class,'login-link auth')]")
    WebElement loginLink;
 
    @FindBy(xpath = "(//input[contains(@class,'email required')])[2]")
    WebElement usernameField;
 
    @FindBy(xpath = "(//input[contains(@type,'password')])[2]")
    WebElement passwordField;
 
    @FindBy(xpath = "//input[contains(@value,'Log In')]")
    WebElement loginButton;
    
    @FindBy(xpath = "//a[contains(@href,'profile')]")
    WebElement profileElement;
 
    @FindBy(xpath = "//h1[contains(@class,'account_header')]")
    WebElement accountHeader;
    
    @FindBy(xpath = "//a[contains(@href,'orders')]")
    WebElement orderElement;
 
    @FindBy(xpath = "//h1[contains(text(),'Your Orders')]")
    WebElement orderHeader;
    
    @FindBy(xpath = "//a[text()='Vouchers']")
    WebElement voucherElement;
 
    @FindBy(xpath = "//h3[contains(text(),'Your Vouchers')]")
    WebElement voucherHeader;
    
    @FindBy(xpath = "//a[contains(@id,'logout')]")
    WebElement logOut;

	public void login(String username, String password) throws InterruptedException {
		Thread.sleep(2000);
		userUserProfile.click();
		Thread.sleep(2000);
		loginLink.click();
		Thread.sleep(6000);
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
		System.out.println("User successfully logged in");
	}

	public void validateProfile() throws InterruptedException {
		userUserProfile.click();
		Thread.sleep(3000);
		profileElement.click();
		Assert.assertTrue("Profile page is not loaded",accountHeader.getText().equalsIgnoreCase("My Account"));
		Thread.sleep(3000);
	}

	public void validateOrder() throws InterruptedException {
		userUserProfile.click();
		Thread.sleep(2000);
		orderElement.click();
		Assert.assertTrue("Orders page is not loaded",orderHeader.getText().equalsIgnoreCase("Your Orders With Us"));
		Thread.sleep(3000);
	}
	
	public void validateVoucher() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
		userUserProfile.click();
		Thread.sleep(2000);
        voucherElement.click();
		Assert.assertTrue("Voucher page is not loaded",voucherHeader.getText().equalsIgnoreCase("Your Vouchers"));
		Thread.sleep(3000);
	}

	public void logOut() throws InterruptedException {
		userUserProfile.click();
		Thread.sleep(2000);
        logOut.click();
		System.out.println("User successfuly logged out");
	}
    
}
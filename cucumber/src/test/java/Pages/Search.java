package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Stepdefinition.homePageStepDefinition;
 
public class Search {
 
    public static WebDriver driver;
    
    public Search(WebDriver driver) {
    	 this.driver = driver;
    	 PageFactory.initElements(driver, this);
    }
 
    @FindBy(xpath = "//input[contains(@id,'search')]")
    WebElement searchBar;
    
    @FindBy(xpath = "//button[contains(@id,'search_button')]")
    WebElement searchButton;
    
    @FindBy(xpath = "(//span[@itemprop='name'])[1]")
    WebElement header;
    
    @FindBy(xpath = "//div[@class='prodtitle row']//h1")
    WebElement title;
//    
//    @FindBy(xpath = "//div[@id='shortlist-badge']")
//    WebElement verifyWhitelist;
    
  
    
	public void searchText() throws InterruptedException {
		Thread.sleep(2000);
		searchBar.sendKeys("Double cot bed");
		searchButton.click();
		System.out.println("search success");
		
	}
	
	public void header() throws InterruptedException {
		Thread.sleep(2000);
		header.click();
//		System.out.println(title.getText());
		driver.navigate().back();
		
    }
//
//	public void wishlist() throws InterruptedException {
//		wishlist.click();
//		verifyWhitelist.click();
//		Thread.sleep(2000);
//		header.getText();
//	}
    
}
package Stepdefinition;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Framework.BaseClass;
import Framework.SiteReusable;
import Pages.HomePage;
import Pages.Search;
import Utilities.ReadExcel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class SearchPageStepdefinition {
	
	public static WebDriver driver;
	
	public SearchPageStepdefinition(homePageStepDefinition baseClass) throws IOException {
		   driver = baseClass.driver;
	 }

   Search text;
   
   SiteReusable objSiteReusable;

   @And("user search the text double cot bed")
   public void user_search_the_text_doublecotbed() throws InterruptedException {
	   text = new Search(driver);
	   text.searchText();
   }

   @And("user clicks on the first product")
   public void user_clicks_on_the_first_product() throws InterruptedException {
	   text = new Search(driver);
	   text.header();
   }
   
//   @And("user add the product to wishlist and verify in the wishlist")
//   public void user_add_the_product_to_wishlist() throws InterruptedException {
//	   text = new Search(driver);
//	   text.wishlist();
//   }

}
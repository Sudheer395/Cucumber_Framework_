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
import Pages.SeatingAddtoCart;
import Pages.Stores;
import Pages.TvUnits;
import Utilities.ReadExcel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class TvAndSeatingStepDefinition {
	
	public static WebDriver driver;
	
	public TvAndSeatingStepDefinition(homePageStepDefinition baseClass) throws IOException {
		   driver = baseClass.driver;
	 }
	TvUnits TvIcon;
	SeatingAddtoCart seating;
	

	@Then("user clicks on TvUnit icon and checks and uncheck on exclude out of stock")
	public void user_clicks_on_tv_unit_icon_and_checks_and_uncheck_on_exclude_out_of_stock() throws InterruptedException {
		TvIcon = new TvUnits(driver);
		TvIcon.TvUnits();
	}




   @And("user clicks on seating icon")
   public void user_clicks_on_seating_icon() throws InterruptedException {
	   seating = new SeatingAddtoCart(driver);
	   seating.seating();
   }
   
   @And("user clicks on Lounge Chairs")
   public void user_clicks_on_Lounge_icon() throws InterruptedException {
	   seating = new SeatingAddtoCart(driver);
	   seating.Lounge();
   }
   
//   
//   @And("user clicks on recommended price")
//   public void user_clicks_on_recommended_price() throws InterruptedException {
//	   seating = new SeatingAddtoCart(driver);
//	   seating.price();
//   }
   

   
}
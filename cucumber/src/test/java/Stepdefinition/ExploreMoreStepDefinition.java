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
import Pages.Giftcard;
import Pages.HomePage;
import Pages.ReferAndEarn;
import Pages.Search;
import Utilities.ReadExcel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class ExploreMoreStepDefinition {
	
	public static WebDriver driver;
	
	public ExploreMoreStepDefinition(homePageStepDefinition baseClass) throws IOException {
		   driver = baseClass.driver;
	 }

   Giftcard giftOption;
   ReferAndEarn ReferOpt;
   
   SiteReusable objSiteReusable;

   @Then("user clicks on Gift card in Explore more Section")
   public void  user_clicks_on_Gift_card_in_Explore_more_Section() throws InterruptedException {
	   giftOption = new Giftcard(driver);
	   giftOption.gift_card();
   }
   
   @Then("user clicks on Refer and Earn in Explore more Section")
   public void user_clicks_on_Refer_and_Earn_in_Explore_more_Section() throws InterruptedException {
	   ReferOpt = new ReferAndEarn(driver);
	   ReferOpt.referAndEarn();
   } 

}
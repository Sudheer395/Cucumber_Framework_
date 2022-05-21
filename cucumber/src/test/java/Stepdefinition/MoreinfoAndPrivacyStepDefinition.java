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
import Pages.MoreInfo;
import Pages.PrivacyPolicy;
import Pages.Search;
import Pages.SeatingAddtoCart;
import Pages.Stores;
import Pages.TvUnits;
import Utilities.ReadExcel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class MoreinfoAndPrivacyStepDefinition {
	
	public static WebDriver driver;
	
	public MoreinfoAndPrivacyStepDefinition(homePageStepDefinition baseClass) throws IOException {
		   driver = baseClass.driver;
	 }
	MoreInfo Minfo;
	PrivacyPolicy PP;

   @And("user prints the more info text")
   public void user_print_on_moreinfo() throws InterruptedException {
	   Minfo = new MoreInfo(driver);
	   Minfo.more_Info();
   }
   
   @And("user clicks on privacy policy and user prints the content")
   public void user_clicks_on_privacyPolicy() throws InterruptedException {
	   PP = new PrivacyPolicy(driver);
	   PP.privacy_policy();
   }
   

   
}
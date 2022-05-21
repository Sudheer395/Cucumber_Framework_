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
import Pages.Stores;
import Utilities.ReadExcel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StoresStepDefinition {
	
	public static WebDriver driver;
	
	public StoresStepDefinition(homePageStepDefinition baseClass) throws IOException {
		   driver = baseClass.driver;
	 }
	
   Stores store;
   SiteReusable objSiteReusable;

   @And("user clicks on stores")
   public void user_clicks_on_stores() throws InterruptedException {
	   store = new Stores(driver);
	   store.stores();
   }

   
}
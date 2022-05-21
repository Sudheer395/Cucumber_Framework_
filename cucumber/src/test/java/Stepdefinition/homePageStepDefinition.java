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
import Pages.Login;
import Pages.Search;
import Utilities.ReadExcel;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.deser.Deserializers.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homePageStepDefinition {
	
   public static WebDriver driver;
   
   public homePageStepDefinition(BaseClass baseClass) throws IOException {
	   driver = baseClass.setup();
   }

   HomePage objHomePage;
   Giftcard gift;
   
   SiteReusable objSiteReusable;
   
   @Given("User lands into site")
   public void user_lands_into_site() {
	   objHomePage = new HomePage(driver);
	   objHomePage.validateHomePage();
     
   }

   @Then("validate page is loaded")
   public void validate_page_is_loaded() {
	   objHomePage = new HomePage(driver);
	   boolean flag = objHomePage.checkPageIsLoaded();
	   Assert.assertTrue(flag);
   }

   @Then("validate header elements")
   public void validate_header_elements(io.cucumber.datatable.DataTable dataTable) throws IOException, InterruptedException {
	   ReadExcel objReadExcel = new ReadExcel();
       Map<String,String> data= new HashMap<String,String>();
       data = objReadExcel.readDataTableAsMaps(dataTable);
       Map<String,String> excelData =  objReadExcel.loadExcelData();
       String expected_header = excelData.get(data.get("TID1"));
       
       objHomePage = new HomePage(driver);
       objHomePage.checkHomePageHeaderElements(expected_header);
   }

   @Then("validate footer elements")
   public void validate_footer_elements(io.cucumber.datatable.DataTable dataTable) throws IOException, InterruptedException {
	   ReadExcel objReadExcel = new ReadExcel();
       Map<String,String> data= new HashMap<String,String>();
       data = objReadExcel.readDataTableAsMaps(dataTable);
       Map<String,String> excelData =  objReadExcel.loadExcelData();
       String expected_footer = excelData.get(data.get("TID2"));
       
       objHomePage = new HomePage(driver);
       objHomePage.checkHomePageFooterElements(expected_footer);
   }

   @Then("Additional Information")
   public void additional_information(io.cucumber.datatable.DataTable dataTable) throws IOException {
	   ReadExcel objReadExcel = new ReadExcel();
       Map<String,String> data= new HashMap<String,String>();
       data = objReadExcel.readDataTableAsMaps(dataTable);
       Map<String,String> excelData =  objReadExcel.loadExcelData();
       String expected_Information = excelData.get(data.get("TID3"));
       
       objHomePage = new HomePage(driver);
       objHomePage.checkHomePageInformationElements(expected_Information);
   }

   @Then("Validate video call and chat icons")
   public void validate_video_call_and_chat_icons() throws InterruptedException {
	   objHomePage = new HomePage(driver);
	   objHomePage.validateCallAndChatIcons();
   }
   
  

   @Then("Close the browser")
   public void close_the_browser() {
	   objSiteReusable = new SiteReusable(driver);
	   objSiteReusable.close(); 
   }
   
  

   
}
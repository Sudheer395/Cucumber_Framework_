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
import Pages.Login;
import Utilities.ReadExcel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefintion {
	
	public static WebDriver driver;
	
	public LoginPageStepDefintion(homePageStepDefinition baseClass) throws IOException {
		   driver = baseClass.driver;
	 }

   Login objLogin;
   
   SiteReusable objSiteReusable;

   @Given("user logs into the account")
   public void user_logs_into_the_account(io.cucumber.datatable.DataTable dataTable) throws IOException, InterruptedException {
	   ReadExcel objReadExcel = new ReadExcel();
       Map<String,String> data= new HashMap<String,String>();
       data = objReadExcel.readDataTableAsMaps(dataTable);
       Map<String,String> excelData =  objReadExcel.loadExcelData();
       String username = excelData.get(data.get("Username"));
       String password = excelData.get(data.get("Password"));
       
       objLogin = new Login(driver);
       objLogin.login(username, password);
   }

   @Then("Hover on login and validate Profile")
   public void hover_on_login_and_validate_profile() throws InterruptedException {
	   objLogin = new Login(driver);
	   objLogin.validateProfile();
   }

   @Then("Hover on login and validate Order")
   public void hover_on_login_and_validate_order() throws InterruptedException {
	   objLogin = new Login(driver);
	   objLogin.validateOrder();
   }

   @Then("Hover on login and validate Vouchers")
   public void hover_on_login_and_validate_vouchers() throws InterruptedException {
	   objLogin = new Login(driver);
	   objLogin.validateVoucher();
   }

   @Then("user clicks on logout")
   public void user_clicks_on_logout() throws InterruptedException {
	   objLogin = new Login(driver);
	   objLogin.logOut();
   }
}
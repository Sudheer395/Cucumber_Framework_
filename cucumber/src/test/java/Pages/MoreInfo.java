package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.screenshot;

public class MoreInfo {
	public static WebDriver driver;

	public MoreInfo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="( //ul[@class='col-md-6 no-padding bodytext'])[3]") WebElement infotext;


	public void more_Info() {
		Actions actions = new Actions(driver);
		actions.moveToElement(infotext).perform();
		System.out.println("================================");
		System.out.println(infotext.getText());
		screenshot.captureScreenshots(driver);
		System.out.println("================================");

	}
}
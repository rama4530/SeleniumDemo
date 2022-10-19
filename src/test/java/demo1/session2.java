package demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ReUsableMethods;

public class session2 extends BasePage implements Locators{
	
	@BeforeClass
	public void setUp() {
		initilize("chrome");
	}
	

	@Test(enabled=false)
	public void testCase01() {	
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		ReUsableMethods reuse=new ReUsableMethods(driver);
		reuse.click(addOrRemoveLink);
		String headerText=driver.findElement(addHeader).getText();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(headerText, "Add/Remove Elements");
		driver.findElement(addButton).click();
		boolean flag=driver.findElement(deleteButton).isDisplayed();
		softAssert.assertEquals(flag, true);
		softAssert.assertAll();
	}
	
	@Test
	public void testCase02() {	
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		ReUsableMethods reuse=new ReUsableMethods(driver);
		reuse.click(checkBox);
		boolean flag=driver.findElement(checkbox1).isSelected();
		if(!flag) {
			reuse.click(checkbox1);	
		}
		boolean flag1=driver.findElement(checkbox2).isSelected();
		if(flag1) {
			reuse.click(checkbox2);
		}
		
		
	}
	
	
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}

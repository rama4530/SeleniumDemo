package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v95.fetch.Fetch.GetResponseBodyResponse;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReUsableMethods {

	private WebDriver driver;

	public ReUsableMethods(WebDriver driver) {
		this.driver=driver;
	}

	public By getBy(LocatorType type,String locator) {
		By by = null;
		switch(type) {
		case ID:
			by=By.id(locator);
			break;
		case ClassName:
			by=By.className(locator);
			break;
		case name:
			by=By.name(locator);
			break;
		case xpath:
			by=By.xpath(locator);
			break;
		case cssSelector:
			by=By.cssSelector(locator);
			break;
		case link:
			by=By.linkText(locator);
			break;
		case partialLink:
			by=By.partialLinkText(locator);
			break;
		} 
		return by;
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void type(By locator,String input) {
		driver.findElement(locator).sendKeys(input);
	}
	

}

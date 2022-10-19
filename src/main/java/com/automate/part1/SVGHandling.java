package com.automate.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.getTitle();
		driver.manage().window().maximize();
		String locator="//*[local-name()=\"svg\"]//*[name()='g' and @class='highcharts-series-group']//*[name()='path' and @fill='#ED8C2B']";
		String locator1="//*[local-name()=\"svg\"]//*[name()='g' and contains(@class,'highcharts-label highcharts-tooltip')]//*[name()='text']//*";
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(locator))).perform();
		String text=driver.findElement(By.xpath(locator1)).getText();
		System.out.println(text);
		Assert.assertEquals("Total Interest: 50.2%", text)	;
		
		driver.close();
	}

}

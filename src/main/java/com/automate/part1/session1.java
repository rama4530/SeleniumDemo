package com.automate.part1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;





public class session1 {

	public static void main(String[] args) throws InterruptedException {

		String currentDir = System.getProperty("user.dir");
		String chromePath=currentDir+"/src/test/resources/drivers/chromedriver.exe";
		System.out.println(currentDir);
		System.setProperty("webdriver.chrome.driver", chromePath);

		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless", "--window-size=1920,1200","--ignore-certificate-errors");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		String currentTitle=driver.getTitle();
		String currentUrl=driver.getCurrentUrl();
		String getPageSource=driver.getPageSource();
		String currentWindowHandle=driver.getWindowHandle();
		System.out.println(currentTitle);
		System.out.println(currentUrl);
		//System.out.println(getPageSource);
		System.out.println(currentWindowHandle);
		String expectedTitle="Amazon.com. Spend less. Smile more.";
		try {
			Assert.assertEquals(currentTitle, expectedTitle);
		}catch(AssertionError e) {
			e.printStackTrace();

		}finally {
			driver.close();
		}

		driver.findElement(By.id("id value"));
		driver.findElement(By.className(" "));
		driver.findElement(By.name("login"));
		driver.findElement(By.tagName("div"));
		driver.findElement(By.linkText("Forgotten password?")).click();;
		
		
		/*driver.manage().timeouts().getImplicitWaitTimeout();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Wait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(70)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		 */
	}



	// firefox, edge, IE chromium browser
	/*
	 * SearchContext--->webdriver
	 * methods present in searchcontext are findelements and findelement
	 * 
	 */


}

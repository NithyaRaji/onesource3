package Map.Google;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GoogleSearch {

	WebDriver driver;
	@BeforeTest
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/Users/nithyar/Downloads/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);				

	}
	@Test
	public void test() throws InterruptedException, IOException {
		driver.findElement(By.xpath(".//*[@name=\"q\"]")).sendKeys("Selenium");
		driver.findElement(By.xpath(".//*[@name=\"q\"]")).sendKeys(Keys.RETURN);
		System.out.println("Searched for selenium");
		}



	@AfterTest
public void afterMethod() {
	
	driver.quit();
}

}
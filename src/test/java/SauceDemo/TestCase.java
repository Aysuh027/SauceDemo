package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	@Test
	public void LoginDemo() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://www.saucedemo.com/v1/";
		driver.get(url);
		
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//input[@name ='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value ='LOGIN']")).click();
		Thread.sleep(10000);
		driver.quit();
	}

}

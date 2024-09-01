package SauceDemo;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemo {
	@Test
	public void LoginDemoo() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://www.saucedemo.com/";
		driver.get(url);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name ='user-name']")).sendKeys("standard_user");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("secret_sauce");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value ='LOGIN']")).click();
		// String error_message = driver.findElement(By.tagName("h3")).getText();
		// System.out.println("Print the error_message :" + error_message);

		boolean logo = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
		System.out.println(logo);

		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='inventory_item_name'][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'<- Back')]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bike Light')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'<- Back')]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bolt T-Shirt')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'<- Back')]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Fleece Jacket')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'<- Back')]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Onesie')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'<- Back')]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Test.allTheThings() T-Shirt (Red)')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'<- Back')]")).click();
           
		driver.findElement(By.xpath("//div[@class=\"bm-burger-button\"]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@id='about_sidebar_link']")).click();
		driver.navigate().back();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}

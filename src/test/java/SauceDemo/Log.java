package SauceDemo;
import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log {
	@Test
	public void LoginDem() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://www.saucedemo.com/v1/";
		driver.get(url);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name ='user-name']")).sendKeys("standard_user");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("secret_sauce");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value ='LOGIN']")).click();
		// String error_message = driver.findElement(By.tagName("h3")).getText();
		// System.out.println("Print the error_message :" + error_message);

		

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[2]/div[3]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[3]/div[3]/button[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[4]/div[3]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[5]/div[3]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[6]/div[3]/button[1]")).click();
		Thread.sleep(1000);
		String ItemQuantity = driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).getText();
		System.out.println("The Number of Item in Cart is : " + ItemQuantity);
		
		Thread.sleep(1000);
		driver.quit();
		


}
}

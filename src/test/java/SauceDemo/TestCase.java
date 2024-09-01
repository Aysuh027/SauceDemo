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
		String url = "https://www.saucedemo.com/";
		driver.get(url);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name ='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value ='LOGIN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='inventory_item_name'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'<- Back')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'ADD TO CART')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'ADD TO CART')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();

		driver.findElement(By.xpath("//a[@class ='btn_action checkout_button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id ='first-name']")).sendKeys("Rahul");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id ='last-name']")).sendKeys("Singh");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id ='postal-code']")).sendKeys("201001");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
		driver.findElement(By.xpath("//a[@class ='btn_action cart_button']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class=\"bm-burger-button\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@id=\"inventory_sidebar_link\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[contains(text(),'ADD TO CART')])[2]")).click();

		String ItemQuantity = driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).getText();
		System.out.println("The Number of Item in Cart is : " + ItemQuantity);
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

package PractiseSite;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseDemo {
	WebDriver driver;
	@Test
	public void Log() {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		String url = "file:///D:/Automation%20Selinum/SauceDemo/src/main/java/Practice.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/']")).click();
	}

	@Test

	public void CheckBox() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "file:///D:/Automation%20Selinum/SauceDemo/src/main/java/Practice.html";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement CheckBoxElement = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		boolean isSelected = CheckBoxElement.isSelected();

		if (!isSelected == true) {
			CheckBoxElement.click();
		}
	}

	@Test

	public void RadioButton() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "file:///D:/Automation%20Selinum/SauceDemo/src/main/java/Practice.html";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement RadioButton = driver.findElement(By.xpath("//input[@value='radio1']"));
		boolean isSelected = RadioButton.isSelected();

		if (!isSelected == true) {
			RadioButton.click();
		}

	}

	@Test
	public void DropDown() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "file:///D:/Automation%20Selinum/SauceDemo/src/main/java/Practice.html";
		driver.get(url);
		driver.manage().window().maximize();

		Select selectbox = new Select(driver.findElement(By.id("dropdown-class-example")));

		selectbox.selectByValue("option3");
		Thread.sleep(3000);
		selectbox.selectByIndex(1);
	}

	@Test
	public void Alert() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "file:///D:/Automation%20Selinum/SauceDemo/src/main/java/Practice.html";
		driver.get(url);
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("Ayush Tiwari");
		driver.findElement(By.id("alertbtn")).click();

		Alert popup = driver.switchTo().alert();
		String message = popup.getText();
		System.out.println(message);

		Thread.sleep(2000);

		popup.accept();

		Thread.sleep(2000);
		driver.quit();
	}
   
	@Test
	public void Tab() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "file:///D:/Automation%20Selinum/SauceDemo/src/main/java/Practice.html";
		driver.get(url);
		driver.manage().window().maximize();

		// driver.findElement(By.id("openwindow")).click();
		driver.findElement(By.id("opentab")).click();
		Thread.sleep(3000);

		
	}
	@AfterMethod
	public void Quit() {
		driver.quit();
		System.out.println("Test Close");
	}

}

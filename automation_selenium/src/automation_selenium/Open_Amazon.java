package automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Amazon {
	
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Account & Lists")).click();
		driver.findElement(By.id("ap_email")).sendKeys("apreet580@gmmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Amn@1211");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		driver.quit();
		

	}

}

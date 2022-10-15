package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWaitImplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		//is applied to elements available on the webpage is also called global wait, dynamic wait
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("loginBtn"));
		username.sendKeys("mouni.upputuri@gmail.com");//it will be overridden by first wait method
		driver.manage().timeouts().implicitlyWait(00, TimeUnit.SECONDS);
	}

}

package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//id, name,xpath,css selector, link text, class name, link text, partial link text
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("mouni.upputuri@gmail.com");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("Mounika@1234");
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("mouni.upputuri@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Mounika@1234");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("mouni.upputuri@gmail.com");
		
		driver.findElement(By.className("login-email")).sendKeys("mouni.upputuri@gmail.com");
		driver.findElement(By.className("login-password")).sendKeys("Mounika@1234");
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.partialLinkText("Sign")).click();//not recommended because short cut names may have many elements
		
	}

}

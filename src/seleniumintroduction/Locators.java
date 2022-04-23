package seleniumintroduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:/selenium practice/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
	driver.findElement(By.id("email")).sendKeys("mouni.upputuri@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Mounika@12");
	//driver.findElement(By.name("commit")).click();
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println(title);
	System.out.println(driver.getCurrentUrl());
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	//to click on forgot link
	driver.findElement(By.linkText("Forgot Password")).click();
	//grabbing the text of forgot pwd
	 String gettext=driver.findElement(By.cssSelector("div p")).getText();
	 System.out.println(gettext);
	//forgot password and enter email id 
	driver.findElement(By.xpath("//div/input[@type='email']")).sendKeys("mounika.upputuri@gmail.com");
	driver.findElement(By.cssSelector("div input[name='commit']")).click();
	
	

	}

}

package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsmethods {

	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("loginBtn"));
		Actions a =new Actions(driver);
		a.sendKeys(username, "mouni.upputuri@gmail.com").build().perform();
		a.sendKeys(password, "Mounika@123").build().perform();
		a.click(login).build().perform();
		
	}

}

package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("loginBtn"));
		Actions a=new Actions(driver);
		a.sendKeys(username,"mouni.upputuri@gmail.com").build().perform();
		a.sendKeys(password, "Mounika@1234").build().perform();
		a.click(login).build().perform();
		//input[@id='username' and @type='email']
		//input[@id='username']
		//*[@class='form-control private-form__control login-email']
		//*[contains(@class, 'form-control private-form__control login-email')]
		//*[@id='username' and contains(@class, 'form-control private-form__control login-email')
		//i18n-string[contains(text(),'Privacy Policy')]
		//i18n-string[text()='Privacy Policy']
		//button[starts-with(@id,'loginBtn')]
		
		
		

	}

}

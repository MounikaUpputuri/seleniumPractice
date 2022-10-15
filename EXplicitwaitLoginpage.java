package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EXplicitwaitLoginpage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		System.out.println(driver.getTitle());
		By email=By.id("username");
		By password=By.id("password");
		By login=By.id("loginBtn");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		//is applied to specific element it is not global wait but it applies to url and titles also
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(email));
		WebElement emailid=driver.findElement(email);
		emailid.sendKeys("Mounika");
		WebElement password1=driver.findElement(password);
		password1.sendKeys("hello");
		WebElement loginbtn=driver.findElement(login);
		loginbtn.click();
		
		
		
		
//		WebElement username=driver.findElement(By.id("username"));
//		WebElement password=driver.findElement(By.id("password"));
//		WebElement login=driver.findElement(By.id("loginBtn"));
//		username.sendKeys("mouni.upputuri@gmail.com");
	}

}

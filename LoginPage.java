package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		
		//page objects
		By emailid=By.id("username");
		By password=By.id("password");
		By login=By.id("loginBtn");
		
		Util u=new Util(driver);
//		u.getelement(emailid).sendKeys("Mouni.upputuri@gmail.com");
//		u.getelement(password).sendKeys("Mounika@123");
//		u.getelement(login).click();
		u.waitforelement(emailid, 20);
		u.dosendkeys(emailid, "Moni");
		u.dosendkeys(password, "password"); 
		u.doclick(login);
		String title=u.waitfortitle("HubSpot Login", 20);
		System.out.println(title);
		
		
	}

}

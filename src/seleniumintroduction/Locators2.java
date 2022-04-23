package seleniumintroduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/selenium practice/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String name="Mounika";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getpassword(driver);
		System.out.println(password);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(3000);
		String logintext=driver.findElement(By.tagName("p")).getText();
		System.out.println(logintext);
					

	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Reset Login']")).click();
		String passwordtext=driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordarray=passwordtext.split("'");
		//rahulshettyacademy' to Login
		String password=passwordarray[1].split("'")[0];
		return password;
		//Please use temporary password 'rahulshettyacademy' to Login.
        // String[] passwordArray2 = passwordArray[1].split("'");
		// passwordArray2[0]
		//0th index - Please use temporary password
		//1st index - rahulshettyacademy' to Login.
     	//0th index - rahulshettyacademy
		//1st index - to Login.
		
		
		
		
		
		
	}
	
	

}

package seleniumsessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		getscreenshot(driver, "loginpage");
		
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("loginBtn"));
		
		username.sendKeys("mounika");
		password.sendKeys("password");
		login.click();
		
		getscreenshotelement(username, "username");
		getscreenshotelement(password, "password");
		getscreenshotelement(login, "login");		
		
		
	}
	public static void getscreenshot(WebDriver driver, String filename)
	{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile,new File("./target/screenshots"+filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void getscreenshotelement(WebElement element, String filename)
	{
		File srcfile=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile,new File("./target/screenshots"+filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClasses {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//open the browser
		
		driver.get("https://www.google.com");//enter url
		
		driver.findElement(By.id("W0wltc")).click();//to accept the privacy settings
		
		String title=driver.getTitle();	//get title of the URL
		
		//validation point
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		System.out.println(driver.getCurrentUrl());	
		
		//System.out.println(driver.getPageSource());
		driver.quit();
		//driver.close();
		//System.out.println(driver.getTitle());//session ID is null, using webdriver after calling quit().

	}

}

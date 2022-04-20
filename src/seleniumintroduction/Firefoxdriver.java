package seleniumintroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdriver {

	
		public static void main(String[] args) {
			// invoking the browser
			//WebDriver is the Selenium library of code containing the FindBys and Clicks and SendKeys code. ChromeDriver is a library of code that controls the Chrome Browser
			System.setProperty("webdriver.gecko.driver", "D:\\selenium practice\\geckodriver-v0.31.0\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("https://www.rahulshettyacademy.com/");
			String title=driver.getTitle();
			System.out.println(title);
			String currenturl=driver.getCurrentUrl();
			System.out.println(currenturl);
			//driver.close();

	}

}

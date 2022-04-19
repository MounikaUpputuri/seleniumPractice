package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumintroduction {

	public static void main(String[] args) {
		// invoking the browser
		//WebDriver is the Selenium library of code containing the FindBys and Clicks and SendKeys code. ChromeDriver is a library of code that controls the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:/selenium practice/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.close();

	}

}

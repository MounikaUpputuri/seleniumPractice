package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.findElement(By.id("accept-choices")).click();
		webtableelements(driver, 2);
		
	}
	public static void webtableelements(WebDriver driver,int row) {
		int row1=driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
		System.out.println(row1);
		//*[@id="customers"]/tbody/tr[2]/td[1]
		String beforexpath="//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath="]/td[1]";
		for(int row11=2;row11<row11+1;row11++) {
			String actualxpath=beforexpath+row11+afterxpath;
			String value=driver.findElement(By.xpath(actualxpath)).getText();
			System.out.println(value);
		}
	}
	

}

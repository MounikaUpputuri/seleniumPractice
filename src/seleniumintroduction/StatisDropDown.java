package seleniumintroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StatisDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/selenium practice/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(4000);
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdownlist = new Select(staticdropdown);
		dropdownlist.selectByIndex(3);
		System.out.println(dropdownlist.getFirstSelectedOption().getText());
		dropdownlist.selectByVisibleText("INR");
		System.out.println(dropdownlist.getFirstSelectedOption().getText());
		dropdownlist.selectByValue("AED");
		System.out.println(dropdownlist.getFirstSelectedOption().getText());
		
		
		
		
				

	}

}

package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement course=driver.findElement(By.id("course"));
		WebElement ide=driver.findElement(By.id("ide"));
		dropdown(course);
		dropdown(ide);
		
	}
	/**
	 * this method is used to get all the values from dropdown
	 * @param element
	 */
	public static ArrayList<String> dropdown(WebElement element) {
		Select select=new Select(element);
		List<WebElement>dropdownlist=select.getOptions();
		System.out.println(dropdownlist.size());
		ArrayList<String> ar=new ArrayList<String>();
		for(int i=0;i<dropdownlist.size();i++)
		{
			String text=dropdownlist.get(i).getText();
			ar.add(text);
		}
		
		return ar;
	}

}

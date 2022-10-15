package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement course=driver.findElement(By.id("course"));
		WebElement ide=driver.findElement(By.id("ide"));
		Select select=new Select(course);
		select.selectByValue("java");
		//select.deselectAll();
		//select.deselectByIndex(1);
		System.out.println(select.isMultiple());
		
//		Select select1=new Select(ide);
//		select1.selectByVisibleText("NetBeans");
		
		
//		selectvaluefromdropdown(ide, "Eclipse");
//		selectvaluefromdropdown(ide, "NetBeans");
//		selectvaluefromdropdownlist(course, 2);
		
	}
	/**
	 * this is used to select invidual value
	 * @param ide
	 * @param value
	 */
	public static void selectvaluefromdropdown(WebElement ide, String value)
	{
		Select select=new Select(ide);
		select.selectByVisibleText(value);	
		select.selectByIndex(0);
	}
	/**
	 * this method is used to select based on the index
	 * @param course
	 * @param value
	 */
	public static void selectvaluefromdropdownlist(WebElement course, int value )
	{
		Select select=new Select(course);
		//select.selectByVisibleText(null);	
		select.selectByIndex(value);
	}
}

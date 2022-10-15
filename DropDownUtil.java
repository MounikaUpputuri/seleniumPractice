package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {
	
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
	/**
	 * this method is used to get all the values from dropdown
	 * @param element
	 * @return 
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
	
	/**
	 * This method is used to select dropdwon values from the dropdrown without select method
	 * @param driver
	 * @param locator
	 * @param Value
	 */
	
	public static void dropdownwithoutselect(WebDriver driver,String locator, String Value)
	{
		List<WebElement> course=driver.findElements(By.xpath("//*[@id='course']/option"));
		System.out.println(course.size());
		for(int i=0;i<course.size();i++)
		{
			String text=course.get(i).getText();
			System.out.println(text);
			if(text.equals("Java")) 
			{
				course.get(i).click();
				break;
			}
		}
	}
	/**
	 * 
	 * @param element
	 * @param driver
	 * @return 
	 */
	public static  ArrayList<String> getelements(WebElement element, WebDriver driver) {
		WebElement context=driver.findElement(By.className("context-menu-one"));
		Actions a =new Actions(driver);
		a.contextClick(context).build().perform();
		List<WebElement> text=driver.findElements(By.xpath("//ul/li[contains(@class, 'context-menu-item')]"));
		ArrayList<String> ar=new ArrayList<String>();
		
		for(int i=0;i<text.size();i++)
		{
			String contexts=text.get(i).getText();
			System.out.println(contexts);
			ar.add(contexts);
			}
		return ar;
	}
}

package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownsWithoutSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		String locator="//*[@id='course']/option";
		DropDownUtil.dropdownwithoutselect(driver,locator , "Java");
//		List<WebElement> course=driver.findElements(By.xpath("//*[@id='course']/option"));
//		System.out.println(course.size());
//		for(int i=0;i<course.size();i++)
//		{
//			String text=course.get(i).getText();
//			System.out.println(text);
//			if(text.equals("Java")) 
//			{
//				course.get(i).click();
//				break;
//			}
//		}
		
		
	}

}

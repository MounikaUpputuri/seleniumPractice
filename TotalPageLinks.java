package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("total number of links is "+list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();
			if(!text.equals("")) 
			{
			System.out.println(text);
			}
		}
		
	}

}

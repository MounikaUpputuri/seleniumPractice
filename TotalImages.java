package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		for(int i=0;i<images.size();i++)
		{
			String url=images.get(i).getAttribute("src");
			System.out.println(url);
		}
		driver.close();
		
	}

}

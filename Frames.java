package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/");
		List<WebElement> frames=driver.findElements(By.tagName("frame"));
		System.out.println(frames.size());
		
		//WebElement framelemnet=driver.findElement(By.name("main"));
		//driver.switchTo().frame(framelemnet);
		//driver.switchTo().frame("main");//by name or id fomr html
		driver.switchTo().frame(2);
		String text=driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
 
	}

}

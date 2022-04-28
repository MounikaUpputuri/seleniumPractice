package seleniumintroduction;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scopeofweblinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/selenium practice/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//total count of web page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//footer count
		WebElement footercount=driver.findElement(By.id("gf-BIG"));
		System.out.println(footercount.findElements(By.tagName("a")).size());
		//column links
		WebElement columnlink=footercount.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int count=columnlink.findElements(By.tagName("a")).size();
		for(int i=1;i<count;i++) 
		{
			String clickontab=Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnlink.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
			Thread.sleep(5000);
		}
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it =abc.iterator();
		while(it.hasNext()) 
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}

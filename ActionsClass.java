package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://mrbool.com/course/");
		Actions a=new Actions(driver);
		WebElement link=driver.findElement(By.className("menulink"));
		a.moveToElement(link).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();
		driver.navigate().refresh();
		driver.close();

	}

}

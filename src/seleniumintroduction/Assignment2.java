package seleniumintroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/selenium practice/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys("Mounika");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mouni.upputuri@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Mounika@123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement list=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown= new Select(list);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("08/08/2018");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert alert-success alert-dismissible')]")).getText());
		
		
		
		
	}

}

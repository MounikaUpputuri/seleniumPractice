package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUp {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String>handles=driver.getWindowHandles();
//		Iterator<String>it=handles.iterator();
//		String ParentId=it.next();
//		System.out.println("Parent id is"+ParentId);
//		String childid=it.next();
//		System.out.println("child window id is "+childid);
//		driver.switchTo().window(childid);
//		System.out.println(driver.getTitle());
//		driver.close();
//		driver.switchTo().window(ParentId);
//		System.out.println(driver.getTitle());
//		driver.close();
//		System.out.println("-------------------");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		String ParentId=it.next();
		System.out.println("Parent id is"+ParentId);
		String childid=it.next();
		System.out.println("child window id is "+childid);
		String childid1=it.next();
		System.out.println("child window id is "+childid1);
		driver.switchTo().window(childid);
		driver.close();
		driver.switchTo().window(childid1);
		driver.close();
		driver.switchTo().window(ParentId);
		driver.close();
		
		
		
		
		
		
		
		
	}

}

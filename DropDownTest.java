package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement course=driver.findElement(By.id("course"));
		WebElement ide=driver.findElement(By.id("ide"));
		ArrayList<String>courselist=DropDownUtil.dropdown(course);
		System.out.println(courselist);
		ArrayList<String>idelist=DropDownUtil.dropdown(ide);
		System.out.println(idelist);
		

	}

}

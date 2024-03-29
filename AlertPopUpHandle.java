package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct text");
		}
		else {
			System.out.println("Inavlid Text");
		}
		alert.accept();
		alert.dismiss();
		
	}

}

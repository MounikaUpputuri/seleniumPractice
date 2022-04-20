package seleniumintroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\selenium practice\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.rahulshettyacademy.com/");

	}

}

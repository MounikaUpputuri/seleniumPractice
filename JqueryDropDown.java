package seleniumsessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		//SelectChoiceValues(driver, "choice 3","choice 2 2","choice 2 3");
		SelectChoiceValues(driver, "all");
		
			}
public static void SelectChoiceValues(WebDriver driver, String ... value) {
		List<WebElement> choicelist = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		System.out.println(choicelist.size());
		if(value[0].equalsIgnoreCase("all")) {
		for (int i = 0; i < choicelist.size(); i++) {
			System.out.println(choicelist.get(i).getText());
			String text=choicelist.get(i).getText();
			for(int k=0;k<value.length;k++) {
				if(text.equals(value[k])) {
				choicelist.get(i).click();
				break;
			}
			}
		}	
		}
		//to select all the value
		for(int all=0;all<choicelist.size();all++)
		{
			choicelist.get(all).click();
		}
		
	}

}

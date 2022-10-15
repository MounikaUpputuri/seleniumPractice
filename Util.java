package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	
	WebDriver driver;
	public Util(WebDriver driver)
	{
		this.driver=driver;
	}
	/**
	 * this method is used to create webelement on the basis of locator
	 * @param locator
	 * @return
	 */
	public  WebElement getelement(By locator) {
		WebElement element=null;
		try {
			element=driver.findElement( locator);
		}catch(Exception e){
			System.out.println("some exception is coming");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return element;
	}
	
	public void doclick(By locator) {
		try {
		getelement(locator).click();
		}catch(Exception e) {
			System.out.println("some exception is comin");
			System.out.println(e.getMessage());
		}
	}
	public void dosendkeys(By locator, String value) {
		try {
		getelement(locator).sendKeys(value);
		}catch (Exception e) {
			System.out.println("some exception is coming");
			System.out.println(e.getMessage());
		}
		
	}
	public void waitforelement(By locator, int timeout ) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	public String waitfortitle(String title, int timeout ) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return title;
	}
	
	
	
	
	
	
	

}

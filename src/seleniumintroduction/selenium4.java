/*
 * package seleniumintroduction;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * public class selenium4 {
 * 
 * public static <nameEditBox> void main(String[] args) {
 * System.setProperty("webdriver.chrome.driver",
 * "D:/selenium practice/chromedriver_win32/chromedriver.exe"); WebDriver driver
 * = new ChromeDriver();
 * driver.get("https://rahulshettyacademy.com/angularpractice/");
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "/Users/rahulshetty/Documents/chromedriver");
 * 
 * driver.get("https://rahulshettyacademy.com/angularpractice/");
 * 
 * WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
 * System.out.println(driver.findElement(((nameEditBox)
 * with(By.tagName("label"))).above(nameEditBox)).getText()); WebElement
 * dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
 * driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
 * WebElement iceCreamLabel =driver.findElement(By.
 * xpath("//label[text()='Check me out if you Love IceCreams!']"));
 * 
 * driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click()
 * ;
 * 
 * 
 * 
 * WebElement rdb = driver.findElement(By.id("inlineRadio1"));
 * 
 * 
 * 
 * System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb
 * )).getText());
 * 
 * 
 * }
 * 
 * private static By with(By tagName) { // TODO Auto-generated method stub
 * return null; }
 * 
 * }
 */
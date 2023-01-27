package synchronisation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitUsingMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		By email=By.id("email");
		WaitForElement(driver,email,20).sendKeys("pune");
		By email1=By.id("pass123");
		WaitForElement(driver,email1,20).sendKeys("Mumbai");
		}
public static WebElement WaitForElement(WebDriver driver,By Locator,int timeout) 
{
	WebDriverWait MyWait=new WebDriverWait(driver, Duration.ofSeconds(timeout)) ;
	MyWait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	return driver.findElement(Locator);
}
}

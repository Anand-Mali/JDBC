package synchronisation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebDriverWait driver1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = driver1.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		element.sendKeys("BABABABABAB");
		// Thread.sleep(2000);
		WebDriverWait driver2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element1 = driver2.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		element1.sendKeys("PRACHIPRACHIPRACHI");
		driver.quit();

	}

}

package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Rushikesh");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("Patil");
		WebElement login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		js.executeScript("arguments[0].click()", login);
		Thread.sleep(3000);
		driver.quit();

	}

}

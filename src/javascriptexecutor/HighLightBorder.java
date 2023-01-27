package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightBorder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement input=driver.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].style.border='10px solid Red'", element);
		js.executeScript("arguments[0].style.border='10px solid black'", element);
		js.executeScript("arguments[0].style.border='10px solid yellow'", input);

	}

}

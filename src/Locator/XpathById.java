package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathById {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("KOMAL");
		driver.findElement(By.id("pass")).sendKeys("KOMU!@$%");
		//driver.findElement(By.id("u_0_5_at")).click();
		driver.findElement(By.xpath("//button[contains(@id,\"u_0_5_at\")]")).click();
	}

}

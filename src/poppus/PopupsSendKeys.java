package poppus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Rushikesh");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		

	}

}

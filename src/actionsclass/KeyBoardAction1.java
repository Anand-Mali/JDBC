package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement input1 = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement input2 = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		input1.sendKeys("Rushikesh");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.keyDown(input1,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(3000);
		action.keyDown(input2,Keys.CONTROL).sendKeys("v").build().perform();
		}

}

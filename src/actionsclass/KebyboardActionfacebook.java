package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KebyboardActionfacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("//input[@name=\"email\"]"));
		username.sendKeys("RushikeshTupe");
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a");//ctrl+a for selecting
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("c");//ctrl+c presses the c key for copy
		act.keyUp(Keys.CONTROL).build().perform();//release the c key
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).build().perform();//presses the tab key
		act.keyDown(Keys.CONTROL).sendKeys("v");//presses the v key
		act.keyUp(Keys.CONTROL).build().perform();//releases the v key

	}

}

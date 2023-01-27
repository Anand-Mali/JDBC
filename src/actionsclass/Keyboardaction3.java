package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		WebElement input1=driver.findElement(By.id("email"));
		WebElement input2=driver.findElement(By.id("pass"));
		
		Thread.sleep(3000);
		input1.sendKeys("This is my first java program");

		Actions act = new Actions(driver);

		Thread.sleep(2000);

		act.keyDown(Keys.CONTROL).sendKeys("a");//ctrl+a for selecting
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("c");//ctrl+c presses the c key for copy
		act.keyUp(Keys.CONTROL).build().perform();//release the c key
		act.keyDown(Keys.TAB).build().perform();//presses the tab key
		act.keyDown(Keys.CONTROL).sendKeys("v");//presses the v key
		act.keyUp(Keys.CONTROL).build().perform();//releases the v key
		
		System.out.println(input1.getAttribute("value"));
		System.out.println(input2.getAttribute("value"));

		//compare text
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("Correct text");
		}
		else {
			System.out.println("incorrect copied");
		}
	}

}

package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		String text=driver.findElement(By.id("result")).getText();
		System.out.println(text);
		
		action.sendKeys(Keys.DELETE).build().perform();
		String text1=driver.findElement(By.id("result")).getText();
		System.out.println(text1);
		
		action.sendKeys(Keys.ENTER).build().perform();
		String text2=driver.findElement(By.id("result")).getText();
		System.out.println(text2);
		
		action.sendKeys(Keys.TAB).build().perform();
		String text3=driver.findElement(By.id("result")).getText();
		System.out.println(text3);
		driver.quit();
		

	}

}

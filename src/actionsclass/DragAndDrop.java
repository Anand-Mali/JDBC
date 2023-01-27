package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.id("box1"));
		WebElement target=driver.findElement(By.id("box101"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.dragAndDrop(source, target).build().perform();
		Thread.sleep(5000);
		driver.quit();
		

	}

}

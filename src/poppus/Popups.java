package poppus;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String BaseURL = "https://demoqa.com/browser-windows";
		driver.get(BaseURL);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(6000);
		driver.manage().window().maximize();
		String parentwindow = driver.getWindowHandle();// current window
		Set<String> ChildWindows = driver.getWindowHandles();// all new window
		for (String childwindow : ChildWindows) {
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.manage().window().maximize();
				Thread.sleep(2000);

				String text = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(text);
				Thread.sleep(2000);
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		String text1 = driver.findElement(By.xpath("//div[text()='Browser Windows']")).getText();
		System.out.println(text1);
		driver.quit();

	}

}

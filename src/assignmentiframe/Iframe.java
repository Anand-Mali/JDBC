package assignmentiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		String text=driver.findElement(By.xpath("//h1[text()=\"This is a sample page\"]")).getText();
		System.out.println(text);
		}
}

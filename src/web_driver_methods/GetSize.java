package web_driver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		System.out.println(driver.manage().window().getSize());
		Dimension size=new Dimension(700, 800);
		driver.manage().window().setSize(size);
		Thread.sleep(4000);
		System.out.println(driver.manage().window().getSize());
		driver.quit();
		
	}

}

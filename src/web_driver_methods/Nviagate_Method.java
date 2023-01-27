package web_driver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nviagate_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(6000);
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(7000);
		driver.quit();
	}

}

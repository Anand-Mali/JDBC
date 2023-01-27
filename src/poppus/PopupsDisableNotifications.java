package poppus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupsDisableNotifications {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(2000);
		driver.close();

	}

}

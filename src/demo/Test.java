package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.com/");
		
		//System.setProperty("webdriver.gecko.driver", "G:\\Installer\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
//		System.setProperty("webdriver.edge.driver", "G:\\Installer\\msedgedriver.exe");
//		WebDriver driver2 = new EdgeDriver();
//		driver2.get("https://www.amazon.com/");
		
//		System.setProperty("webdriver.ie.driver", "G:\\Installer\\IEDriverServer.exe");
//		WebDriver driver3 = new InternetExplorerDriver();
//		driver3.get("https://www.google.com/");
//		driver3.manage().window().maximize();
		//Thread.sleep(3000);
		//driver3.close();//this closes the particular tab in browser
		//driver.quit();//this closes all the tabs in the browser
		

	}

}

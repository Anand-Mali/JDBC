package web_driver_methods;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		//Dimension Size=new Dimension(700, 800);
		Point p=new Point(200, 300);
		Thread.sleep(3000);
		driver.manage().window().setPosition(p);
		Thread.sleep(6000);
		driver.quit();
			}
}

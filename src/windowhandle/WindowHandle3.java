package windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 		String BaseURL = "https://demoqa.com/browser-windows";
				driver.get(BaseURL);
				driver.findElement(By.id("windowButton")).click();
		Thread.sleep(6000);
		driver.manage().window().maximize();
			  	String ParentWindow = driver.getWindowHandle(); // Current window
	  			Set<String>ChildWindows=driver.getWindowHandles(); //all new window
				for(String childWindow : ChildWindows) {
						if(!ParentWindow.equalsIgnoreCase(childWindow)) {
								driver.switchTo().window(childWindow);
				Thread.sleep(3000);
				String Text=driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(Text);
				driver.close();
						}
				}
	}
}

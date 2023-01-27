package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
 
		String BaseURL = "https://www.w3schools.com/";
		
		driver.get(BaseURL);
		
		driver.findElement(By.id("search2")).sendKeys("Selenium");//20
		//13
		driver.findElement(By.id("learntocode_searchbtn")).click();
		
		driver.quit();
		
		
		/*WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.id("search2")).sendKeys("selenium");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("learntocode_searchbtn132")).click();
		driver.quit();*/

	}

}

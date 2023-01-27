package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Gaurav");//xpath by name
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("ABCDEFG");//xpath by attributes
		//driver.findElement(By.xpath("")).sendKeys("$#%@^#&#");
		driver.findElement(By.xpath("//input[contains(@data-testid,\"royal_pass\")]")).sendKeys("%$^&%*#*#");
		//driver.findElement(By.tagName("input"))
		//xpath by conatains
	driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();//by id
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class=\"_9lsa\"]")).click();//xpath by attributes
	//driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();//xpath by text
	driver.findElement(By.linkText("Create New Account")).click();
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com/");

	}

}

package Locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.facebook.com");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Rushikesh");//xpath by attribute
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("$%#@%%%");
		driver.findElement(By.xpath("//button[text()=\"Log in\"]   ")).click();//xpath by text
	    driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
		driver.navigate().to("https:\\\\www.facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();//xpath by text
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("KajalPrachi");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234@#$%%");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()=\"Show\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=\"Hide\"]")).click();
		Thread.sleep(2000);

	}

}

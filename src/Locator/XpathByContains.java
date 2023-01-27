package Locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.instagram.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@type,\"text\")]")).sendKeys("rajbhau");//xpath by contains by attribute
		driver.findElement(By.xpath("//input[contains(@name,\"password\")]")).sendKeys("bhau1234");//xpath contains by attrtibute
		driver.findElement(By.xpath("//span[contains(text(),\"Sign up\")]")).click();//xpath contains by text
		driver.findElement(By.xpath("//a[text()=\"Forgot password?\"]")).click();//xpath by text

	}

}

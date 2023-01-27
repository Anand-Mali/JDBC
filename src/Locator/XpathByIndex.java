package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@class=\"nav-a  \"][5]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@class=\"a-dynamic-image sl-sobe-carousel-sub-card-img\"]")).click();
		 
   
		

	}

}

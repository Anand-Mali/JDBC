package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//1
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone14");
		Thread.sleep(2000);
		
		//2
		 WebElement Text= driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));
	       System.out.println(Text.getText());
		
		//3
		WebElement Link1=driver.findElement(By.xpath("//a[@class=\"nav-asd  \"]"));
		System.out.println(Link1);
		
		Link1.click();
		Thread.sleep(3000);
		driver.quit();

	}

}

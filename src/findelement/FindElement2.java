package findelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
//List<WebElement> SearchBox=driver.findElements(By.id("twotabsearchtextbox"));
//SearchBox
		List<WebElement> text = driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));

		for (WebElement Ele : text) {
			System.out.println(Ele.getText());
		}
		//3
		List<WebElement>Links1=driver.findElements(By.xpath("//a[@class=\"nav-aas  \"]"));
	    System.out.println(Links1.size());
	    
	    driver.quit(); 
	}

}

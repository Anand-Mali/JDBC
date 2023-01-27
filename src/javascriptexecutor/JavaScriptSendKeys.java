package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//first way
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		js.executeScript("document.getElementById('email').value='Rushikesh';");
		js.executeScript("document.getElementById('pass').value='patil';");
		js.executeScript("arguments[0].click()", login);
		
		//seconf way
		WebElement input1=driver.findElement(By.xpath("//input[@name=\"email\"]"));
		WebElement input2=driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		js.executeScript("arguments[0].value='Rushikesh';", input1);
		js.executeScript("arguments[0].value='Rushikesh';", input2);
		js.executeScript("arguments[0].click()", login);
		Thread.sleep(3000);
		driver.quit();
	}

}

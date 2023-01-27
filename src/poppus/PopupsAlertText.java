package poppus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsAlertText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Thread.sleep(3000);
		String text="I am a JS prompt";
		Alert text1=driver.switchTo().alert();
		String popupsmsg=text1.getText();
		System.out.println("AlertMeassage:"+popupsmsg);
		if(text.equals(popupsmsg))
		{
			System.out.println("Correct text");
					}
		else
		{
			System.out.println("Incorrect text");
		}
		Thread.sleep(2000);
		
		text1.sendKeys("Automation");
		text1.accept();
		
		Boolean b=driver.findElement(By.id("result")).isEnabled();
		System.out.println(b);
		
		
		
		

	}

}

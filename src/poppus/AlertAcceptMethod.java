package poppus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAcceptMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		//driver.findElement(By.xpath("//icon[@class=\"contextual-sign-in-modal__modal-dismiss-icon lazy-loaded\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		boolean result=driver.findElement(By.id("result")).isDisplayed();
		System.out.println(result);

	}

}

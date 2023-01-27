package poppus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsGetTextCongo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");noalertpresentexception
		//driver.get("https://username:password@the-internet.herokuapp.com/basic_auth");noalertpresentexception
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		//driver.switchTo().alert().sendKeys("admin");//noalertpresentexception
		Thread.sleep(3000);
		String text=driver.findElement(By.xpath("   //p[contains(text(),'Congratulations!')]   ")).getText();
		System.out.println(text);
		}
}

package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeClass3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		WebElement outerframe=driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Rushikesh");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();
		driver.findElement(By.id("email")).sendKeys("rushi77@gmail.com");

	}

}

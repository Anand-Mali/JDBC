package poppus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("G:\\Installer\\TestCases.xlsx");
		Thread.sleep(3000);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);
		boolean b = driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed();
		System.out.println(b);
		Thread.sleep(3000);
		driver.quit();

	}

}

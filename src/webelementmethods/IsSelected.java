package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//boolean b = driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected();
		//System.out.println(b);
		driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
		boolean b1 = driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).isSelected();
		System.out.println(b1);

	}

}

package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]")).sendKeys("Rushikesh");
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Tupe");
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//select[@id=\"yearbox\"]")).click();
		driver.findElement(By.xpath("//option[text()='1917']")).click();
		driver.findElement(By.xpath("//select[@placeholder=\"Month\"]")).click();
		driver.findElement(By.xpath("//option[text()='March']")).click();
		driver.findElement(By.xpath("//select[@id=\"daybox\"]")).click();
		driver.findElement(By.xpath("//option[text()='15']")).click();
		driver.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("!@#$%^&*(");
		
		
	}

}

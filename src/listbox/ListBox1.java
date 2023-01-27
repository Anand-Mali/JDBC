package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]")).sendKeys("Rushikesh");
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Tupe");
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();
		
		//select class method 1)selectbyvisible text
		WebElement a=driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		WebElement b=driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
		WebElement c=driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		
		//create object of select class
		Select select1=new Select(a);
		select1.selectByVisibleText("1917");
		
		Select select2=new Select(b);
		select2.selectByVisibleText("March");
		
		Select select3=new Select(c);
		select3.selectByVisibleText("15");
		
		//2)select by index  3)select by value

	}

}

package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]")).sendKeys("Rushikesh");
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Tupe");
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();
		
		WebElement a=driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		WebElement b=driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
		WebElement c=driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		
		String DOB="1996/March/22";
		String Date[]=DOB.split("/");
		listbox(a,Date[0]);
		listbox(b,Date[1]);
		listbox(c,Date[2]);
		
//	listbox(a,"1917");//how to call static method //methodname();  classname.methodname();
//	listbox(b,"March");
//	listbox(c,"15");
	}
	public static void listbox(WebElement element,String value)
	{
		Select select4=new Select(element);
		select4.selectByValue(value);
	}

}

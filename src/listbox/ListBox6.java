package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox6 {

	public static void main(String[] args) throws InterruptedException {
		// Step 1
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(5000);

		List<WebElement> City = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));

		System.out.println("Totla Count :" + City.size());
		Thread.sleep(5000);

		for(int i=0;i<City.size();i++) {

		 System.out.println(City.get(i).getText());
		 City.get(i).getText();
		 if(City.get(i).getText().equals("Swargate, Pune"))
		 {
			 System.out.println();
			 System.out.println("Selected City==="+City.get(i).getText());
			 City.get(i).click();
			 break;
		 }
 }
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		Thread.sleep(5000);
		List<WebElement> DestCity=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		System.out.println("Total City"+DestCity.size());
		Thread.sleep(3000);
		
		for(int i=0;i<DestCity.size();i++)
		{
			System.out.println(DestCity.get(i).getText());
			DestCity.get(i).getText();
			if(DestCity.get(i).getText().equals("Thane West, Mumbai"))
			{
				System.out.println();
				System.out.println("selected destcity==="+DestCity.get(i).getText());
				DestCity.get(i).click();
				break;
		
			}
		}
		driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("search_btn")).click();
	}
}

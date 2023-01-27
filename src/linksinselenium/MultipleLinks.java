package linksinselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();

		//click on link
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Coupons")).click();
		
		//get all the links on webpage 
		List<WebElement> AllLinks=driver.findElements(By.tagName("a"));
		System.out.println("All links on webpage are : "+AllLinks.size());
		
//			for(WebElement link:AllLinks)
//			{
//				System.out.println(link.getText());
//				System.out.println(link.getAttribute("href"));
//			}
			for(int i=0;i<AllLinks.size();i++)
			{
				System.out.println(AllLinks.get(i).getText());
				System.out.println(AllLinks.get(i).getAttribute("href"));
			}
		Thread.sleep(2000);
		driver.quit();
	}

}

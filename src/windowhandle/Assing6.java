package windowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assing6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String parentID = driver.getWindowHandle();//get parentID
		System.out.println("ParentWindow-->>" + parentID);// ID of parent
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[1]")).click();//click on linkedin link
		Thread.sleep(3000);
		driver.switchTo().window(parentID);//switch to parent
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[2]")).click();// click on facebook link
		Thread.sleep(3000);
		driver.switchTo().window(parentID);//switch to parent
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[3]")).click();// click on twitter link
		Thread.sleep(3000);
		driver.switchTo().window(parentID);//switch to parent
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[4]")).click();// click on youtube link
		Thread.sleep(3000);
		Set<String> ID = driver.getWindowHandles();//getting all open windows ID
		ArrayList<String> list = new ArrayList<String>(ID);
		System.out.println("LinkedIn-->>" + list.get(1));
		System.out.println("facebook-->>" + list.get(2));
		System.out.println("twitter-->>" + list.get(3));
		System.out.println("YouTube-->>" + list.get(4));
		Thread.sleep(2000);
		
		if(driver.switchTo().window(list.get(0)).getTitle().contains(parentID))
		{
			System.out.println(parentID);
		}//hover to facebook
		Thread.sleep(2000);

	}

}

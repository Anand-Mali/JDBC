package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();

		Thread.sleep(3000);

		Set<String> WindowID = driver.getWindowHandles();

		Iterator<String> it = WindowID.iterator();

		String ParentWindow = it.next();

		System.out.println("ParentWindow -->" + ParentWindow);

		String ChildWindow = it.next();

		driver.switchTo().window(ChildWindow);
		System.out.println("ChildWindow -->" + ChildWindow);
		Thread.sleep(3000);
		String Title = driver.getTitle();
		System.out.println(Title);

		driver.switchTo().window(ParentWindow);
		System.out.println(Title);
		Thread.sleep(3000);
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		Thread.sleep(3000);

		driver.switchTo().window(ChildWindow);

		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("Rahul");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name=\"action_submitForm\"]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}

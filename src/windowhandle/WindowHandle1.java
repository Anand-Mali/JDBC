package windowhandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> Window = driver.getWindowHandles();
		System.out.println(Window);

		Iterator<String> it = Window.iterator();

		String parentwindow = it.next();
		System.out.println("parentwindow :" + parentwindow);

		String childwindow = it.next();
		System.out.println("childwindow :" + childwindow);

		// second way
		ArrayList<String> WinList = new ArrayList<String>(Window);

		String parentwindow1 = WinList.get(0);
		System.out.println("parentwindow1 :" + parentwindow1);
		String childwindow1 = WinList.get(1);
		System.out.println("childwindow1 :" + childwindow1);
		
        driver.switchTo().window(childwindow1);
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("PrachiKajal@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}

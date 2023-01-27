package windowhandlesassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[1]")).click();// click on linkedin link
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[2]")).click();// click on facebook link
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[3]")).click();// click on twitter link
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[4]")).click();// click on youtube link
		Thread.sleep(3000);
		Set<String> Window = driver.getWindowHandles();
		List<String> Listofwindowhandle = new ArrayList<>(Window);
		if (ValidateWindowbytitle("LinkedIn", Listofwindowhandle)) {
			System.out.println(driver.getTitle());
		}
	}
public static boolean ValidateWindowbytitle(String WindowTitle, List<String> Listofwindowhandle)
{
		for (String handleID : Listofwindowhandle) {
			String title = driver.switchTo().window(handleID).getTitle();
			if (title.contains(WindowTitle)) {
				System.out.println("LinkedIn window");
				return true;
			}
					}
		return false;
	}
}

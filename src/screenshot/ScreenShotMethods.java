package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotMethods {
	static WebDriver driver;
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "G:/Installer/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		ScreenShotMethods.TakesScreenShot("Redbus");
		ScreenShotMethods.TakesScreenShot("facebook");
		ScreenShotMethods.TakesScreenShot("java");
		ScreenShotMethods.TakesScreenShot("Selenium");
		
			}
	public static void TakesScreenShot(String Element) throws IOException
	{
		WebElement driver1=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		File Source=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		String Image=RandomString.make(3);
		String Imagename="Redbus";
		File dest=new File("G:\\Testing\\SeleniumAutomation\\screenshot\\"+Image+""+Imagename+".jpg");
		FileHandler.copy(Source, dest);
		
	}
}

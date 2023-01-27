package assignmentscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotThreeTimes {
static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:/Installer/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		ScreenShotThreeTimes.TakeScreenShot("zerodha1");
		ScreenShotThreeTimes.TakeScreenShot("zerodha2");
		ScreenShotThreeTimes.TakeScreenShot("zerodha3");
		
	}
public static void TakeScreenShot(String element) throws IOException
{
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//to take screenshot
	String Imagename=RandomString.make(5);
	String Image="zerodha";
	File dest=new File("G:\\Testing\\SeleniumAutomation\\screenshot1\\"+Image+""+Imagename+".jpg");
	FileHandler.copy(source,dest);
	}
}

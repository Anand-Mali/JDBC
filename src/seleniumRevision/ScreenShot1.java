package seleniumRevision;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot1 {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		ScreenShot1.ThreeTimesScreenShot("Rushi");
		ScreenShot1.ThreeTimesScreenShot("Rushi1");
		ScreenShot1.ThreeTimesScreenShot("Rushi2");
			}
	public static void ThreeTimesScreenShot(String element) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String image=RandomString.make(5);
		String Image1="Rushi";
		File destination=new File("C:\\Users\\rushi\\Desktop\\Screenshot\\"+Image1+""+image+".jpg");
		FileHandler.copy(source, destination);
	}

}

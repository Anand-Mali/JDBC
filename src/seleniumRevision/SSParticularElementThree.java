package seleniumRevision;

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

public class SSParticularElementThree {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:/Installer/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		SSParticularElementThree.Rushi("zerodha1");
		SSParticularElementThree.Rushi("zerodha2");
		SSParticularElementThree.Rushi("zerodha3");
		
		
	}
	public static void Rushi(String element) throws IOException
	{
		WebElement element1=driver.findElement(By.xpath("//h2[text()='Login to Kite']"));
		File source=((TakesScreenshot)element1).getScreenshotAs(OutputType.FILE);
		String Random=RandomString.make(2);
		String Image="zerodha";
		File Dest=new File("G:\\Testing\\SeleniumAutomation\\screenshot\\"+Image+""+Random+".jpg");
		FileHandler.copy(source, Dest);
		
	}
}

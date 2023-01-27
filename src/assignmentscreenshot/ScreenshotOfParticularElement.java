package assignmentscreenshot;

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

public class ScreenshotOfParticularElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:/Installer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//h2[text()='Login to Kite']"));
		File source=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		String Random=RandomString.make(2);
		String Image="zerodha";
		File Dest=new File("G:\\Testing\\SeleniumAutomation\\screenshot\\"+Image+""+Random+".jpg");
		FileHandler.copy(source, Dest);
		driver.quit();

	}

}

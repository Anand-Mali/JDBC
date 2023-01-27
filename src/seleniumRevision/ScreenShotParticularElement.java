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

public class ScreenShotParticularElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement element=driver.findElement(By.id("nav-logo-sprites"));
		File source=(File) ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\rushi\\Desktop\\Screenshot\\meet1.jpg");
		FileHandler.copy(source, dest);
		driver.close();
		

	}

}

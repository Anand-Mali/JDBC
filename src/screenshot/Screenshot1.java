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

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:/Installer/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.name("login"));
		
		File source=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);//to take screenshot
		
		String Imagename=RandomString.make(5);
		
		String Image="facebook";
		
		File dest=new File("G:\\Testing\\SeleniumAutomation\\screenshot\\"+Image+""+Imagename+".jpg");
		
		FileHandler.copy(source,dest);
		
		driver.quit();

	}

}

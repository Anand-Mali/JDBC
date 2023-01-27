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

public class RedBusScreenShot {

	

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//div[@class=\"tac promotion-header main-header-family gtm-offer-code\"]"));
		
		File Source=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);

		String Imagename=RandomString.make(5);
		String Image="Redbus";
		File Dest=new File("C:\\Users\\rushi\\Videos\\Screenshot\\"+Image+""+Imagename+".jpg");
		FileHandler.copy(Source, Dest);
		driver.quit();

	}

}

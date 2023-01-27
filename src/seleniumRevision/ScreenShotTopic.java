package seleniumRevision;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotTopic {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationtestings.com/how-handle-dropdown-without-select-selenium/");
		driver.manage().window().maximize();
		File rushi=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Rushi=new File("C:\\Users\\rushi\\Desktop\\Screenshot\\meet.jpg");
		FileHandler.copy(rushi, Rushi);
		driver.close();

	}

}

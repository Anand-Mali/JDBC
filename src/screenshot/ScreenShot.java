package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:/Installer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// to take screenshot

		File dest = new File("C:\\Users\\rushi\\Videos\\Screenshot\\facebook.jpg");//to store the ss

		FileHandler.copy(source, dest);

	}

}

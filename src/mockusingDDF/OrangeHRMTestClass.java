package mockusingDDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		FileInputStream File=new FileInputStream("G:\\Book11.xlsx");
		Sheet Sh=WorkbookFactory.create(File).getSheet("Sheet1");
		OrangeHRMLoginPage OL=new OrangeHRMLoginPage(driver);
		String username=Sh.getRow(1).getCell(0).getStringCellValue();
		OL.UserName(username);
		
		String password=Sh.getRow(1).getCell(1).getStringCellValue();
		OL.PassWord(password);
		OL.login();
		Thread.sleep(3000);
		driver.quit();
		

	}

}

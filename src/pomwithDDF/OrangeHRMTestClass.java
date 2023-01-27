package pomwithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
		
		FileInputStream File = new FileInputStream("G:\\Book11.xlsx");
		Sheet Sh = WorkbookFactory.create(File).getSheet("Sheet1");
		OrangeHRMLoginPage OL=new OrangeHRMLoginPage(driver);
		String name=Sh.getRow(1).getCell(0).getStringCellValue();
		OL.username1(name);
		
		String passwd=Sh.getRow(1).getCell(1).getStringCellValue();
		OL.password1(passwd);
		OL.loginbutton1();
		Thread.sleep(3000);
		OrangeHRMDashboard OD=new OrangeHRMDashboard(driver);
		String uname11=Sh.getRow(1).getCell(2).getStringCellValue();
		OD.Uname(uname11);
		OD.action();
		
		

	}

}

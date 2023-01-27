package framework;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example_with_DDF {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		// Enter Username
		FileInputStream File = new FileInputStream("G:\\Book11.xlsx");
		Sheet Sh = WorkbookFactory.create(File).getSheet("Sheet1");
		String Username = Sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
		// Enter passowrd
		String Passowrd = Sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Passowrd);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String Name = Sh.getRow(1).getCell(2).getStringCellValue();
		String Username1 = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		System.out.println(Username1);
		if (Name.equals(Username1)) {
			System.out.println("Correct user");
		} else {
			System.out.println("incorrect user");
		}
		driver.quit();
	}

}

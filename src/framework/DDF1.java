package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		FileInputStream file=new FileInputStream("G:\\Book11.xlsx");
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet1");
		String username=Sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		String password=Sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String name=Sh.getRow(1).getCell(2).getStringCellValue();
		String Username = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		System.out.println(Username);
		if(name.equals(Username))
		{
			System.out.println("correct username");
		}
		else
		{
			System.out.println("incorrect username");
		}

	}

}

package pom_without_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrnageHRMbaseclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Create obj of the OrnageHRM_Loginpage class
		
		OrangeHRMLoginpage OL = new OrangeHRMLoginpage(driver); 
		
		OL.username1();
		OL.password1();
		OL.loginbutton1();
		
		
		Thread.sleep(4000);
		
		
		OrangeHRMdashboard OD=new OrangeHRMdashboard(driver);
		OD.Uname1();
		OD.action1();
		
		Thread.sleep(4000);

		
		OrangeHRmMyInfo OI=new OrangeHRmMyInfo(driver);
		OI.MyInfo();
		OI.personaldetails();
		OI.FirstName();
		
		

	}

}

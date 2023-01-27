package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1="
				+ "s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9301240%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gc"
				+ "lid=CjwKCAiA9qKbBhAzEiwAS4yeDYIC5qfGCSF_Fp76VAWGvAMDUheSamg_QtdvMtceoPAcl9JgjZfTIBoCkngQAvD_BwE");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Rushikesh");
driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Tupe");
	}

}

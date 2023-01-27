package poppus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupsalertmsg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
        driver.findElement(By.id("login1")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        Thread.sleep(2000);
        Alert popup=driver.switchTo().alert();
        System.out.println(popup.getText());
        String text=popup.getText();
        if(text.equals("Please enter your password"))
        {
        	System.out.println("correct alert msg");
        }
        else
        {
        	System.out.println("Incorrect alert msg");
        }
        popup.accept();
        Thread.sleep(2000);
        driver.quit();
	}

}

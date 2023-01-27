package web_driver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_Url {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		if(URL.equals("https://www.facebook.com/"))
		{
			System.out.println("correct url");
		}
		else
		{
			System.out.println("incorrect url");
		}
	}

}

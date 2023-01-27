package web_driver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String Title = driver.getTitle();
		System.out.println(Title);
		String ExpectedTitle = "Amazon.com. Spend less. Smile more.";
		if (Title.equals(ExpectedTitle)) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect tile");
		}
	}

}

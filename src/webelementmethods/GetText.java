package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String ExpectedResults = "Register";
		Thread.sleep(2000);

		String text = driver.findElement(By.xpath("//h2[text()=\"Register\"]")).getText();
		System.out.println(text);
		if (text.equals(ExpectedResults)) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");
		}
		Thread.sleep(3000);
		driver.quit();

	}

}

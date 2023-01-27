package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(
				By.xpath("//a[@role=\"button\" and @class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Rushikesh");

		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Tupe");

		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("123456789");

		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("@#$%");
		// Step 1.
		WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));

		// how will you get the size
		Select select1 = new Select(Day);
		List<WebElement> Listday = select1.getOptions();
		System.out.println("Size =" + Listday.size());

		// how will u print the values from list
		for (int i = 0; i < Listday.size(); i++) {
			String DayValues = Listday.get(i).getText();
			System.out.println(DayValues);

			// how will you get the specific values from the dropdown or list
			if (DayValues.equals("15")) {
				Listday.get(i).click();
			}
		}
		// select month
		Select select2 = new Select(Month);
		List<WebElement> MonthList = select2.getOptions();
		System.out.println("Size of the months is:" + MonthList.size());

		for (int i = 0; i < MonthList.size(); i++) {
			String MonthValue = MonthList.get(i).getText();
			System.out.println(MonthValue);

			if (MonthValue.equals("Jan")) {
				MonthList.get(i).click();
			}
		}

		// select year
		Select select3 = new Select(Year);
		List<WebElement> YearList = select3.getOptions();
		System.out.println("size of the year is:" + YearList.size());

		for (int i = 0; i < YearList.size(); i++) {
			String YearValue = YearList.get(i).getText();
			System.out.println(YearValue);

			if (YearValue.equals("2009")) {
				YearList.get(i).click();
			}
		}
	}
}

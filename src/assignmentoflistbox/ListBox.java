package assignmentoflistbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:/Installer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement skills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		Select select1 = new Select(skills);
		List<WebElement> ListSkills = select1.getOptions();
		System.out.println("Skills size===>>>>" + ListSkills.size());// size of skills 78
		Thread.sleep(2000);

		for (int i = 0; i < ListSkills.size(); i++) {
			String skillvalues = ListSkills.get(i).getText();
			System.out.println(skillvalues);// all values from skills get printed on console

			if (ListSkills.get(i).getText().equals("APIs")) { // ListSkills.get(i).click();
				System.out.println();
				System.out.println("Skills selected values from dropdown:" + ListSkills.get(i).getText());
				ListSkills.get(i).click();

				// continue;
			}

		}

		WebElement Year = driver.findElement(By.xpath("//select[@placeholder=\"Year\"]"));
		WebElement Month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		WebElement Day = driver.findElement(By.xpath("//select[@placeholder=\"Day\"]"));

		Select select = new Select(Year);
		List<WebElement> yearlist = select.getOptions();
		Thread.sleep(1000);
		System.out.println("year list ===>>>>" + yearlist.size());

		for (int i = 0; i < yearlist.size(); i++) {
			// yearlist.get(i).getText();
			System.out.println(yearlist.get(i).getText());
			if (yearlist.get(i).getText().equals("1923")) {
				yearlist.get(i).click();
				System.out.println("selected value from yearlist: " + yearlist.get(i).getText());

			}
		}
		System.out.println();
		Select select2 = new Select(Month);
		List<WebElement> monthlist = select2.getOptions();
		Thread.sleep(1000);
		System.out.println("size of the months is===>>" + monthlist.size());

		for (int i = 0; i < monthlist.size(); i++) {
			System.out.println(monthlist.get(i).getText());
			if (monthlist.get(i).getText().equals("June")) {
				monthlist.get(i).click();
				System.out.println("selected value from monthlist: " + monthlist.get(i).getText());
			}
		}
		System.out.println();
		Select select3 = new Select(Day);
		List<WebElement> daylist = select3.getOptions();
		Thread.sleep(1000);
		System.out.println("Size of the daylist is====>>>>>" + daylist.size());
		for (int i = 1; i < daylist.size(); i++) {
			daylist.get(i).getText();
			System.out.println(daylist.get(i).getText());

			if (daylist.get(i).getText().equals("8")) {
				daylist.get(i).click();
				System.out.println("selected value from daylist:" + daylist.get(i).getText());

			}
		}
		driver.quit();

	}

}

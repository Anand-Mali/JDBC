package webtables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables123 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Example = driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));

		Js.executeScript("arguments[0].scrollIntoView();", Example);

		// First Way
		// How Many rows in the table
		int Row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();

		System.out.println("Total no of rows are :" + Row);

		List<WebElement> Row1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));

		System.out.println("Total no of rows are :" + Row1.size());

		// How many col in the tables
		int Col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();

		System.out.println("Totla no of col are :" + Col);
		List<WebElement> Col1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println("Totla no of col are :" + Col1.size());

		// Retrieve the specific row/col data

		String Data = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[3]")).getText();
		System.out.println(Data);

		String Data1 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[3]/td[2]")).getText();
		System.out.println(Data1);

		// Retrieve all the from table

		for (int i = 2; i <= Row; i++) { // Outerloop

			for (int J = 1; J <= Col; J++) {

				String actualValue = driver
						.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + J + "]"))
						.getText();

				if (actualValue.equals("Canada")) {

					System.out.println(actualValue);
					System.out.println("Row No :" + i + " :" + "Col No :" + J);
					break;
					
				}
			}
			System.out.println();

		}
		driver.quit();

	}

}

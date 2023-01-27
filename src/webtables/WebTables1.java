package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.xpath("//h3[text()='Example']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		//first way calulate rows from the table
		int rowsize=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("Rows size"+rowsize);
		
		List<WebElement> RowSize=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println("Total size of row: "+RowSize.size());
		
		int colsize=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("Col size :"+colsize);
		
		List<WebElement> cellsize=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println("Total size of col :"+cellsize.size());
		
		//particular data from the table
		String data=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[3]")).getText();
		System.out.println(data);
		
		String Data=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[3]/td[2]")).getText();
		System.out.println(Data);

		
		//get all table data from table
		for(int i=2;i<=rowsize;i++) 
		{
			for(int J=1;J<=colsize;J++)
			{
				String Data2=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+J+"]")).getText();
				System.out.print(Data2+"|");
			}
			System.out.println();
		}
		driver.quit();
	}

}

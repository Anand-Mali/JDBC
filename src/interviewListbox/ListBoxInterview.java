package interviewListbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxInterview {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:/Installer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		
		
		Select select1=new Select(element1);
		List<WebElement> alllistvalues=select1.getOptions();
		System.out.println(alllistvalues.size());
		for(int i=0;i<alllistvalues.size();i++)
		{
			alllistvalues.get(i).getText();
			System.out.println(alllistvalues.get(i).getText());
		}
		


	}

}

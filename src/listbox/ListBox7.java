package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox7 {

		static WebDriver driver;
		 
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "G:/Installer/chromedriver.exe");

		    driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.facebook.com/");

			driver.findElement(
					By.xpath("//a[@role=\"button\" and @class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();

			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Ketan");

			driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patil");

			driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("123456789");

			driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("@#$%");
			//step 1
			String day="//select[@id=\"day\"]//option";  
			String month="//select[@id=\"month\"]//option";
			String year="//select[@id=\"year\"]//option";
			
			String DOB="15-May-2020";
			String date[]=DOB.split("-");
			selectdropdown(day,date[0]);
			selectdropdown(month,date[1]);
			selectdropdown(year,date[2]);

	}
      public static void selectdropdown(String element,String value)
      {
    	  List<WebElement> V1=driver.findElements(By.xpath(element));
    	  System.out.println(V1.size());
    	  for(int i=0;i<V1.size();i++)
    	  {
    		  if(V1.get(i).getText().equals(value)) {
    		  V1.get(i).click();
    		  break;
    	  }
    	  }
      }
}
    	  
    
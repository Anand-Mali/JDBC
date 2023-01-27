package linksinselenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksOnFlipkart {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("Links on flipkart are :" +link.size());
		
		int brokenlink=0;
		for(WebElement Link:link)
		{
			String url=Link.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}
			URL links=new URL(url);
			HttpURLConnection httpcode=(HttpURLConnection)links.openConnection();
					httpcode.connect();
					if(httpcode.getResponseCode()>=400)
					{
						System.out.println(httpcode.getResponseCode()+"  "+url+"is"+":broken link");
						brokenlink++;
					}
					else
					{
						System.out.println(httpcode.getResponseCode()+"  "+url+"is"+":valid link");

					}
		}
	System.out.println("Total broken links are: " +brokenlink);
	}
}

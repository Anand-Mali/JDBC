package linksinselenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinksGoogle {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		//get all links on webpage
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Links on webpage are: "+links.size());
		
		int brokenlinks=0;
		for(WebElement link:links)//datatype refvar:arrayname
		{
			String url=link.getAttribute("href");
			if(url==null ||url.isEmpty())
			{
				System.out.println("url is empty");
				continue;
			}
			URL link1=new URL(url);
			HttpURLConnection httpcode=(HttpURLConnection)link1.openConnection();
			 httpcode.connect();
			 if(httpcode.getResponseCode()>=400)
			 {
				 System.out.println(httpcode.getResponseCode()+"---->>"+url+"is ---->>"+":Broken link");
				 brokenlinks++;
			 }
			 else
			 {
				 System.out.println(httpcode.getResponseCode()+"---->>"+url+"is ---->>"+":Valid link");
				 
			 }
					}
		System.out.println("No of broken links :" +brokenlinks);
		//driver.quit();
	}
}

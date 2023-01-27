package windowhandlesassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		Thread.sleep(3000);
		
		String FirstWindow = driver.getWindowHandle();// get first window handle
		System.out.println("first window handle-->>" + FirstWindow);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']")).click();
		Set<String> WindowhandleID = driver.getWindowHandles();// get all open window ID
		List<String> Listofwindowhandle = new ArrayList<>(WindowhandleID);//holding all window in a list
		System.out.println("total window handle number--" +Listofwindowhandle.size());//total count of window handle 
		driver.switchTo().window(Listofwindowhandle.get(1));//switching to second window 
		Thread.sleep(2000);
		
		String CurrentWindowHandle=driver.getWindowHandle();
		System.out.println("CurrentWindowHandle--this is second window handle" +CurrentWindowHandle);//we get the second window handle
		boolean logo=driver.findElement(By.xpath("//i[@class=\"fa fa-logo\"]")).isDisplayed();//verified the upper side logo on first window
		System.out.println(logo);
		Thread.sleep(3000);
		
		driver.switchTo().window(FirstWindow);//swtiching to first window
		System.out.println("CurrentWindowHandle--This will be first window handle"+FirstWindow);
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.xpath("//button[@id=\"runbtn\"]"));
		System.out.println("Contains run text--" +element.getText().contains("Run"));//check the run button contains text RUN

		/*
		 driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
				Thread.sleep(2000);
				
				// 2.Get the current window’s handle and write to the console window. It must be the first window handle.

				String windowID = driver.getWindowHandle();
				System.out.println("First WindowID - "+windowID);
				
				// 3.Locate the “Visit W3Schools.com!” link and click it.

				driver.switchTo().frame("iframeResult");
				driver.findElement(By.xpath("//a[contains(text(),'Visit W3Schools.com!')]")).click();
				
				// 4.Get all window handles and hold them in a list.

				Set<String> AllwindowID = driver.getWindowHandles();
				ArrayList<String>allwindow = new ArrayList<String>(AllwindowID);
				
				String First_WindowID = allwindow.get(0);
				System.out.println("First WindowID - "+First_WindowID);
				
				String Second_WindowID = allwindow.get(1);
				System.out.println("Second WindowID - "+Second_WindowID);
				
				// 5.Write to total window handle number to the console. It must be 2.
				System.out.println("No. of Window -: "+allwindow.size());
				
				// 6.Switch t0 the second window.
				driver.switchTo().window(Second_WindowID);
				
				
				// 7.Get the current window’s handle and write to the console window. It must be a second window handle.
				System.out.println("Second WindowID - "+driver.getWindowHandle());
				
				// 8.Check the upper left side logo in the second window.
				driver.findElement(By.xpath("//i[@class=\"fa fa-logo\"]")).isDisplayed();
				
				// 9.Go back (Switch) to the first window.
				driver.switchTo().window(First_WindowID);
				
				// 10.Get the current window’s handle and write to the console window. It must be the first window handle.
				System.out.println("First WindowID - "+driver.getWindowHandle());
				
				// 11.Check the See Run Button Text. It must contain “Run >” text.
				
				String run = driver.findElement(By.xpath("//button[contains(text(),'Run ❯')]")).getText();
				System.out.println("Text - "+run);
		  */
	}

}

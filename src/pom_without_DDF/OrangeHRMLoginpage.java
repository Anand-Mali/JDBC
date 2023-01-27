package pom_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginpage {

	//Step 1:.Data member should be declared globally with access level private/public
	@FindBy(xpath = "//input[@name=\"username\"]")
	public WebElement Username;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement Loginbutton;
	

	//step 2:Initialize within a constructor with access level public using pagefactory
		public OrangeHRMLoginpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//step 3
		public void username1()
		{
			Username.sendKeys("Admin");
		}
		
		public void password1()
		{
			Password.sendKeys("admin123");
		}
		
		public void loginbutton1()
		{
			Loginbutton.click();
		}
		
		
		
		
}

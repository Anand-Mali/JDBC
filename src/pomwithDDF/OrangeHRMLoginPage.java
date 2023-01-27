package pomwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {

		@FindBy(xpath = "//input[@name=\"username\"]")
		private WebElement Username;
		
		@FindBy(xpath = "//input[@name=\"password\"]")
		private WebElement Password;
		
		@FindBy(xpath = "//button[@type=\"submit\"]")
		private WebElement Loginbutton;
		
			public OrangeHRMLoginPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			//step 3
			public void username1(String username)
			{
				Username.sendKeys(username);
			}
			
			public void password1(String password)
			{
				Password.sendKeys(password);
			}
			
			public void loginbutton1()
			{
				Loginbutton.click();
			}
}

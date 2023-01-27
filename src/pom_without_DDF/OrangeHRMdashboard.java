package pom_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMdashboard {

	
		@FindBy(xpath="//p[@class=\"oxd-userdropdown-name\"]")
		public WebElement UName;
		
		@FindBy(xpath="//div[@class=\"orangehrm-dashboard-widget-name\"]")
		public WebElement action;

		public OrangeHRMdashboard(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void Uname1()
		{
			String Text = UName.getText();
			System.out.println(Text);
			if(Text.equals("Ahmed Abdalkader"))
			{
				System.out.println("correct");
			}
			else
			{
				System.out.println("incorrect");
			}
		}
		
		public void action1()
		{
			boolean actions=action.isDisplayed();
			System.out.println(actions);
		}
}

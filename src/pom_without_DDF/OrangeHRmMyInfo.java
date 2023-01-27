package pom_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRmMyInfo {

	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[6]")
	public WebElement myinfo;
	
	@FindBy(xpath="//h6[@class=\"oxd-text oxd-text--h6 orangehrm-main-title\"]")
	public WebElement persoanldetails;
	
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	public WebElement firstname;
	
	public OrangeHRmMyInfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void MyInfo()
	{
		myinfo.click();
	}
	public void personaldetails()
	{
		boolean pd=persoanldetails.isDisplayed();
		System.out.println(pd);
	}
	public void FirstName()
	{
		firstname.sendKeys("orange");
	}

}

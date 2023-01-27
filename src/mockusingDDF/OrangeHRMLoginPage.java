package mockusingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage 
{
@FindBy(xpath="//input[@name=\"username\"]")
public WebElement username ;

@FindBy(xpath="//input[@name=\"password\"]")
public WebElement password ;

@FindBy(xpath="//button[@type=\"submit\"]")
public WebElement loginbutton ;

public OrangeHRMLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}

public void UserName(String user)
{
	username.sendKeys(user);
	}
public void PassWord(String pass)
{
	password.sendKeys(pass);
	}
public void login()
{
	loginbutton.click();
	}


}

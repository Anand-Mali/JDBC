package pomwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMDashboard
{
@FindBy(xpath="//p[@class=\"oxd-userdropdown-name\"]")
public WebElement Uname ;

@FindBy(xpath="(//p[@class=\"oxd-text oxd-text--p\"])[4]")
public WebElement myaction ;


public OrangeHRMDashboard(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void Uname(String UNAME)
{
	String text=Uname.getText();
	System.out.println(text);
	if(text.equals(UNAME))
	{
		System.out.println("correct username");
	}
	else
	{
		System.out.println("incorrect username");
	}
	}
public void action()
{
	myaction.click();
	}
}

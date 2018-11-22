package testngpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;

	@FindBy(name="username")
	WebElement user;
	
	@FindBy(name="password")
	WebElement  pass;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement  loginbtn;
	
	
	
	public  loginpage ( WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void typeUsername( String userid)
	{
		user.sendKeys(userid);
	}
	public void typePassword(String pwdid)
	{
		pass.sendKeys(pwdid);
	}
	public void loginButton()
	{
		loginbtn.click();
	}
	
}

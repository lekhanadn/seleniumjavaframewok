package testngpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup {
WebDriver driver;
	
	@FindBy(name="first_name")
	WebElement  firstname;
	
	@FindBy(name="surname")
	WebElement  lastname;
	
	@FindBy(name="email")
	WebElement  mail;

	@FindBy(name="email_confirm")
	WebElement conformmail;
	
	@FindBy(name="username")
	WebElement user;
	
	@FindBy(name="password")
	WebElement password;
	
	/*@FindBy(name="passwordconfirm")
	WebElement conformpassword;*/
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
	
	@FindBy(xpath="//button[@id='submitButton']")
	WebElement submitbt;
	
	
	public signup( WebDriver driver)
	{
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void  typefname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void  typeLastname(String lname)
	{
		 lastname.sendKeys(lname);
	}
	
	public void  typeemail(String email )
	{
		mail.sendKeys(email);
	}
	
	public void  typeconmail(String retypemail)
	{
		conformmail.sendKeys(retypemail);
	}
	
	public void  typeuser(String uid)
	{
		user.sendKeys(uid);
	}
	public void  typepassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void selectchk( )
	{
		checkbox.click();
	}
	
	public void submibtn()
	{
		submitbt.click();
	}
	}



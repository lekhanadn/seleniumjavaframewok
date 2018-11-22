package testngpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class freecrmpage {
	WebDriver driver;
	By username= By.name("username");
	By password=By.name("password");
	By loginbtn=By.xpath("//input[@type='submit']");
	
	
	public freecrmpage( WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void typeUsername( String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	public void typePassWord( String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clikonButton()
	{
		driver.findElement(loginbtn).click();
	}
	
	
	
	

}

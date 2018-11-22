package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isselected {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/register/");
	WebElement chkbox=	driver.findElement(By.name("agreeTerms"));
	chkbox.click();
	chkbox.click();
	
	if(chkbox.isSelected())
	{
		System.out.println("checkbox is selected");
	}
	else 
	{
		System.out.println("checkbox is not selected");
	}
}
}

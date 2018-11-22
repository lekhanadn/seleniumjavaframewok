package popuphandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert {
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		 Alert alert=driver.switchTo().alert();
			Thread.sleep(3000);
		String text=alert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		alert.accept();
		
	}
}

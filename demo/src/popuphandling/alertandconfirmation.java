package popuphandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertandconfirmation {
	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();*/
		
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cusid")).sendKeys("5625252");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(3000);
	Alert alert=driver.switchTo().alert();
	alert.dismiss();
	
	//alert.accept();
	/*Thread.sleep(5000);
	driver.switchTo().alert();
	alert.accept();
	System.out.println(driver.getTitle());*/
	
		
	}
}

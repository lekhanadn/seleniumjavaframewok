package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveraction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.istqb.in/");
		System.out.println("beofre  using mouseover:"+driver.getTitle());
	WebElement ele=	driver.findElement(By.linkText("AGILE EXT"));
	
		
	Actions action=new Actions(driver);
	action.moveToElement(ele).perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("PROCEDURE")).click();
	Thread.sleep(3000);
	System.out.println("after using mouseover:"+driver.getTitle());

	}

}

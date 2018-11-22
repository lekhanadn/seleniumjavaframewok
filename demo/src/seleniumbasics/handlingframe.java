package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingframe {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("Ravi12345");
		driver.findElement(By.name("password")).sendKeys("Ravi@12345");
		driver.findElement(By.cssSelector("input.btn")).sendKeys(Keys.RETURN);
		
		List<WebElement> list=driver.findElements(By.tagName("frame"));
		int count=list.size();
		
		System.out.println(count);
		driver.switchTo().frame("mainpanel");		
		driver.findElement(By.xpath("//a[@title='Companies']")).click();

	}
}

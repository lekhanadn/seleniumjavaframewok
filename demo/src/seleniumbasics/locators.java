package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		 /*String title=driver.getTitle();
		 System.out.println(title);
		 
		 Thread.sleep(5000);
		 driver.navigate().to("https://www.facebook.com/");
		 System.out.println(driver.getTitle());
		 driver.navigate().back();
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().forward();
		 System.out.println(driver.getTitle());
		 
		 //1.id
		//driver.findElement(By.id("firstname")).sendKeys("tom");
		//2.name
		 * 
		 */
		WebElement ele=driver.findElement(By.name("firstname"));
		ele.sendKeys("hello");
		//ele.clear();
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		//ele.sendKeys(Keys.DELETE);
		
		Thread.sleep(5000);
		//ele.sendKeys("hi");
		 WebElement last=driver.findElement(By.id("lastname"));
		 
		 last.sendKeys(Keys.CONTROL+"v");
		 
		Thread.sleep(5000);
		//3.xpath
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("bangalore");
		
		//4.linktext
		//driver.findElement(By.linkText("Sign in")).click();
		//5.partial linktext

		//driver.findElement(By.partialLinkText("Want to register ")).click();
		
		
		//6.classname
		//driver.findElement(By.className("ButtonNormal")).click();
		//7.cssSelector
		
		
		//driver.findElement(By.cssSelector("#SECRET_ANSWER")).sendKeys("hello");
		
		//driver.findElement(By.cssSelector("#PASSWORD")).sendKeys("heloo");
		Thread.sleep(5000);
		//8.tagname
		
		List<WebElement>list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		driver.close();

	}


}

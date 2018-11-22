package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class contextlink {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL+"t");
		driver.get("http://www.istqb.in/");
		Actions act=new Actions(driver);
		WebElement link=driver.findElement(By.linkText("About"));
		act.contextClick(link).perform();
		Thread.sleep(3000);
		act.sendKeys("w").perform();
		//driver.close();
		
		
		
	}
}

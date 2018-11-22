package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class resizeable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/resizable/");
		
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
	 WebElement element=	driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));

	action.clickAndHold(element).moveByOffset(50,20).release().perform();
	
	}

}

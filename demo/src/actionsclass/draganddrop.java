package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		 WebElement source=driver.findElement(By.id("draggable"));
		 WebElement target= driver.findElement(By.id("droppable"));
		 Actions action=new Actions(driver);
		
		// action.doubleClick();
		 
		 action.dragAndDrop(source, target).perform();
		 
		 //2. method
		 action.clickAndHold(source).moveToElement(target).perform();
		 	
		 

	}

}

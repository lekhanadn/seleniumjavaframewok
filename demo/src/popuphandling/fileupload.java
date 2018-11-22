package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload {
public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://the-internet.herokuapp.com//upload");
driver.findElement(By.name("file")).sendKeys("C:\\Users\\Venu\\Desktop\\testdata1.xlsx");
	
driver.findElement(By.xpath("//input[@value='Upload']")).click();
	}
	
}

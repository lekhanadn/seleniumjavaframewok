package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileuploadusingautoit {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
				
				driver.get("https://the-internet.herokuapp.com/upload");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='file']")).click();
				Runtime.getRuntime().exec("C:\\Users\\Venu\\Desktop\\autoit\\fileupload.exe");
				

			}

}

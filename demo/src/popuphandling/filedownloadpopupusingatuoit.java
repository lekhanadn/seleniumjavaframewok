package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class filedownloadpopupusingatuoit {
public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		
		driver.findElement(By.linkText("3.14.0")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Venu\\Desktop\\autoit\\filedownload.exe");
		
}
}

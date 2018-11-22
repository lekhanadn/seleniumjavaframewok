package popuphandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class authenticationpopup {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//https://username:password@url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		//driver.get("https://the-internet.herokuapp.com/basic_auth");
	}


}

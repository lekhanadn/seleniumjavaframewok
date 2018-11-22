package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class s1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
	    driver.get("https://projects.eclipse.org/releases/oxygen");
	driver.close();

}
}
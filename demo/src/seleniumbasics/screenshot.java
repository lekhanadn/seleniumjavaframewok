package seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\eclipse workspace\\demo\\screenshot/google.png"));
	
	}

}

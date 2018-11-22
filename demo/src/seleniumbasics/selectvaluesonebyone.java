package seleniumbasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectvaluesonebyone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");

		WebElement element=driver.findElement(By.id("state"));
		Select sel=new Select(element);
			List<WebElement> alloptions=sel.getOptions();
			ArrayList<String> alltext=new ArrayList<String>();
			 int count=alloptions.size();
			 System.out.println(count);
			 for(int i=0;i<count;i++)
			 {
				 if(i==2)
				 sel.selectByIndex(i);
				// Thread.sleep(5000);
				String text= alloptions.get(i).getText();
				//sel.selectByVisibleText();
				alltext.add(text);
				//System.out.println("all the values in dropdown: "+   text);
			 }
			 Collections.sort(alltext);
			 for(String s: alltext)
			 {
				 System.out.println(s);
			 }
driver.close();


	}
}

package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			driver.get("https://www.freecrm.com");
			
			
			//1.absolute xpath
			driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]")).sendKeys("hello");
			 
			
			//2.Relative Xpath    
			//driver.findElement(By.xpath("//input[@class='form-control' or @name='password' ]")).sendKeys("hello");
			
			//3. xpath by attaribute
			
			
			//driver.findElement(By.xpath("//input[@class='form-control' or @name='password' ]")).sendKeys("hello");
			
			
			//4. xpath by text
			
			//driver.findElement(By.xpath("//a[text()='Features']")).click();
			
			//5.xpath by contains
			
			//driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]")).click();
			
			
			//6.group index
			
			//driver.findElement(By.xpath("(//a)[4]")).click();
			
			//7.Using contains to handle dynamic values 
			//driver.findElement(By.xpath("//a[conatins(@id ,test_)]"));
			
			//8. to handle dynamic value using starts with
			
			//driver.findElement(By.xpath("//a[starts-with(@id,'test_')]"));
			
			//9. to handle dynamic value using ends with
			
			//driver.findElement(By.xpath("//a[ends-with(@id,_ABC)]"));
			
			
			

	}

}

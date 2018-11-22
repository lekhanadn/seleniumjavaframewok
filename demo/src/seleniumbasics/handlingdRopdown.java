package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingdRopdown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","E:\\eclipse workspace\\demo\\driver\\geckodriver.exe");

		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=257740484756760&extra_1=s%7Cc%7C256741341323%7Ce%7Cfacebook%7C&placement=&creative=256741341323&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D9062032%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAw5_fBRCSARIsAGodhk_PSJrCKpfKn9NJzJLKYsSzoZmtPc2aqe0g0QqnLF_pEisaKC8-WGgaApU-EALw_wcB");

		WebElement element=driver.findElement(By.id("month"));
		Select sel=new Select(element);
		//sel.selectByIndex(4);
		//sel.selectByValue("2");
		sel.selectByVisibleText("May");
		
		Thread.sleep(5000);
		driver.close();
}
}
package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
//		driver.findElement(By.id("autosuggest")).sendKeys("India");
//		Thread.sleep(2000);
//		driver.findElement(By.className("search_options_menucontentbg")).click();
//		driver.findElement(By.linkText("Special Assistance")).click();
		
		driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).click();
		
		driver.findElement(By.partialLinkText("Special")).click();
		
		driver.findElement(By.tagName("a")).click();

	}

}

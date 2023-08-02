package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingTheScopeOfWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//1.trying to print all the links in the entire web page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.Print only the links of the footer page
		//Now we need to scope the WebDriver only before the footer page
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3. to find links within columns in footer page
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//To click on every link present in columnsDriver
		List<WebElement> columDriverLinks = columnDriver.findElements(By.tagName("a"));
		
		//here it navigates to next page 
		for(int i=1; i<columDriverLinks.size(); i++) {
			
			String clickontab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columDriverLinks.get(i).sendKeys(clickontab);
			
			
		}
	}

}

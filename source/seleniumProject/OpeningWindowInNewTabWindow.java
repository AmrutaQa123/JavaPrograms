package seleniumProject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningWindowInNewTabWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		//If we want to open in new tab
		driver.switchTo().newWindow(WindowType.TAB); //for opening new tab
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		String currentWindow = itr.next();
		String newWindow = itr.next();
		driver.switchTo().window(newWindow);
		driver.get("https://www.udemy.com/home/my-courses/learning/");
		
        String linkText = driver.findElements(By.cssSelector("a[href*='/course-dashboard-redirect/?course_id']")).get(0).getText();
        
        driver.switchTo().window(currentWindow);
        driver.findElement(By.name("name")).sendKeys(linkText);
		
	}

}

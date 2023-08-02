package seleniumProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	    
//		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
//		
//		driver.findElement(By.xpath("//a[text()= 'Click Here']")).click();
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> itr = windows.iterator();
//		String parentID = itr.next();
//		String childID = itr.next();
//		driver.switchTo().window(childID);
//		
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
//		Thread.sleep(2000);
//		
//		driver.switchTo().window(parentID);
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
//		Thread.sleep(2000);

		
		
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//Click on blinking text to navigate to child window
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		
		//To navigate from parent window to child window by using getWindowHandles() method
		Set<String> windows = driver.getWindowHandles(); //[ParentId, ChildId]
		Iterator<String> itr = windows.iterator();
		String parentId = itr.next();
		String childId = itr.next();
		driver.switchTo().window(childId);
		Thread.sleep(2000);
	    
		 //to print the title of the next window page
	    driver.getTitle();
	    
	    //	driver.close();  closes only the present window 
	    driver.quit(); // closes all the windows
	    
	}

}

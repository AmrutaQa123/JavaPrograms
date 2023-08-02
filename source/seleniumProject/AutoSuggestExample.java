package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
//		driver.findElement(By.id("autocomplete")).sendKeys("India");
//		
//		List<WebElement> options = driver.findElements(By.id("ui-id-1"));
//		
//		for(WebElement option : options){
//			if(option.getText().equalsIgnoreCase("India")) {
//				//To just hover on India
//				Thread.sleep(2000);
//				a.moveToElement(option).build().perform();	
//	            break;
//			}
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.id("autocomplete")).getText();
		
		//This example is performed in this way
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");

	    Thread.sleep(2000);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
		

	}

}

package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//To scroll on complete webpage
		js.executeScript("window.scrollBy(0,500)");
		
		//To scroll on single element(table) in webpage
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		//or we can also write above step as below
		//js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,500)");
		
		int sum = 0;
		List<WebElement> table = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		for(int i=0; i<table.size(); i++) {
			//System.out.println(table.get(i).getText());
			sum = sum + Integer.parseInt(table.get(i).getText());
		}
		System.out.println(sum);
		
		//To assert the total value from web page and our calculated sum
		driver.findElement(By.cssSelector(".totalAmount")).getText(); //this gives the locator of webpage total amount:296
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println(total);
		Assert.assertEquals(total, sum);

	}

}

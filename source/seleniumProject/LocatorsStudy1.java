package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStudy1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
//		System.out.println(driver.getCurrentUrl());
//		driver.findElement(By.id("inputUsername")).sendKeys("Amruta");
//		Thread.sleep(2000);
//		driver.findElement(By.name("inputPassword")).sendKeys("12345678");
//		Thread.sleep(2000);
//		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("amruta");
		//can also use below cssselector for username with attribute as ID
		driver.findElement(By.cssSelector("#inputUsername"));
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("12345678");
		//To validate the error message 
		System.out.println(driver.findElement(By.cssSelector("p.error")));
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("amruta");
		//To click on forgot password link 
		driver.findElement(By.linkText("Forgot your password?")).click();
		//we can use index if we dont have unique attribute
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("amruta@qa.com");
		//to clear the field
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		Thread.sleep(2000);
		driver.close();

	}

}

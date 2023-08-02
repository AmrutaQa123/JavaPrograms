package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Amruta");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234567");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//        driver.close();
		driver.get("https://www.facebook.com/signup");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ammu");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Hub");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("amr.hhhh@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("amr.hhhh@gmail.com");
	    Thread.sleep(2000);
	    driver.close();
	}

}

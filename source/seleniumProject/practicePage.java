package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practicePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Amruta");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ammruta@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select options = new Select(dropdown);
		options.selectByVisibleText("Female");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("04041997");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		Thread.sleep(2000);
		System.out.println("Success");
		driver.close();
	}

}

package seleniumProject;

import static org.testng.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class manuactonLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stage.manufacton.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// Login
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("material@qa.comp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[text()='log in']")).click();
		Thread.sleep(5000);


		// Navigating to requesting
		driver.findElement(By.xpath("//i[@class='icon-materialmanager is-size-1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button/span[text()='Sourcing']")).click();
		Thread.sleep(5000);

		// To uncheck all projects
		driver.findElement(By.xpath("//input[@class='o-chk__check o-chk__check--checked']")).click();
		// To search a project
		driver.findElement(
				By.xpath("//section[@class='modal-card-body has-background-white pr-0 pb-0']/div/div/p/input"))
				.sendKeys("selenium project");
		Thread.sleep(5000);
		// to select the projects
		driver.findElement(By.xpath("//input[@class='o-chk__check']")).click();
		Thread.sleep(5000);
		// To click on apply filter
		driver.findElement(By.xpath("//button[text()='Apply Filter']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button/i[@class='icon-addnew']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter name (3 or more characters)']")).sendKeys("Sourcing Order Created from selenium");
		
		driver.findElement(By.xpath("//input[@class='o-input o-input-iconspace-right']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("a[class*='o-dpck__table__cell o-dpck__table__cell--today']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Locations (Required)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li/span/span[text()='Banglore']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(""))
		
		
		driver.findElement(By.xpath("//i[@class='icon-addcatalog']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/button[text()=' Edit ']")).click();
		

//		//Selecting a project
//		driver.findElement(By.xpath("//span[@class='has-text-weight-bold']")).click();
//		Thread.sleep(5000);
//		
//		//checked-checkbox
//		WebElement checkedBox = driver.findElement(By.xpath("//input[@class='o-chk__check o-chk__check--checked']"));
//		
//		//unchecked-checkbox
//		WebElement uncheckedBox = driver.findElement(By.xpath("//input[@class='o-chk__check']"));
//		
//		if(checkedBox.isSelected()) {
//			uncheckedBox.click();
//			driver.findElement(By.xpath("//section[@class='modal-card-body has-background-white pr-0 pb-0']/div/div/p/input"))
//			.sendKeys("selenium project");
//			checkedBox.click();
//		}
//		else {
//			driver.findElement(By.xpath("//section[@class='modal-card-body has-background-white pr-0 pb-0']/div/div/p/input"))
//			.sendKeys("selenium project");
//			checkedBox.click();
//		}

//		//To uncheck all projects
//		driver.findElement(By.xpath("//input[@class='o-chk__check o-chk__check--checked']")).click();
//		//To search a project
//		driver.findElement(By.xpath("//section[@class='modal-card-body has-background-white pr-0 pb-0']/div/div/p/input"))
//		.sendKeys("selenium project");
//		Thread.sleep(5000);
//		//to select the projects 
//		driver.findElement(By.xpath("//input[@class='o-chk__check']")).click();
//		Thread.sleep(5000);
//		//To click on apply filter
//		driver.findElement(By.xpath("//button[text()='Apply Filter']")).click();
//		Thread.sleep(5000);

		// creating order
//		driver.findElement(By.xpath("//i[@class='icon-addnew']")).click();
//		Thread.sleep(5000);
//	    driver.findElement(By.xpath("//span[text()='Create Prefab Package']")).click();
//		Thread.sleep(5000);
////		driver.findElement(By.xpath("//input[@placeholder='Enter name (3 or more characters)']")).sendKeys("Created from selenium");
////		Thread.sleep(5000);
//		WebElement as = driver.findElement(By.xpath("(//div[@class='field-body'])[2]"));
//		as.click();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//li[@class='multiselect__element']/span/span[text()='akansha ']")).click();
//		Thread.sleep(5000);

		// To select calender date
//		driver.findElement(By.xpath("//div[@class='o-ctrl-input']/input[@class='o-input o-input-iconspace-right']")).click();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//a[@class='o-dpck__table__cell o-dpck__table__cell--today o-dpck__table__cell--selectable o-dpck__table__cell--today']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//div[@class='secondary-date']/div/input[@class='o-input o-input-iconspace-right']")).click();
//		Thread.sleep(2000);

//		driver.findElement(By.xpath("//li[@class='multiselect__element']/span/span[text()='akansha ']")).click();
//		driver.close();

	}

}

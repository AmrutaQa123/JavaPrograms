package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//input[@id='ctl00_mainContent_txt_Fromdate']
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[@class='ui-datepicker-days-cell-over.ui-datepicker-today']")).click();
	}

}

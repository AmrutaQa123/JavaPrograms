package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//if u just want to click the dropdown
//		driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']")).click();
		//store it in a webelement
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		Thread.sleep(2000);
		
        //Creating an object for select class
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		Thread.sleep(2000);
		dropdown.selectByValue("AED");
		Thread.sleep(2000);
		dropdown.selectByVisibleText("USD");
		Thread.sleep(2000);
		
		System.out.println("Hello");
		driver.close();

	}

}

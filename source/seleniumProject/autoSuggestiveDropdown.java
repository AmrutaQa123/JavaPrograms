package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//click to select
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		
		//to find all the options matching with ind keyword
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		Thread.sleep(2000);
		
		//Looping to find one element
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("India")) {
				System.out.println(option.getText());
				option.click();
				break;
			}
		}
		
		//To check the checkboxes
		WebElement check = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
		if(check.isEnabled()) {
			check.click();
			Thread.sleep(5000);
		}
		else {
			System.out.println("Checkbox is checked");
		}
		System.out.println(check.isSelected());
		
		//To select radiobuttons
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}

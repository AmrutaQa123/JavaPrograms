package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticLoopingDropdown{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//To click on multi dropdown
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		//using while loop
//		int i=1;
//		while(i<5) {
//		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
//		i++;
//		}
		//we can also use for loop
		for(int i=1; i<5; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		Thread.sleep(2000);
		driver.close();

	}

}

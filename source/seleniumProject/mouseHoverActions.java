package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a = new Actions(driver);
		//to just hover over sign in
		a.moveToElement(move).build().perform();
		
		//to write capital letters
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
		.build().perform();
		
		//To copy the text which was typed eg: copy "hello"
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().sendKeys("hello").keyDown(Keys.SHIFT)
		.doubleClick().build().perform();
		
		//To right click on open inspect window
		a.moveToElement(move).contextClick().build().perform();

	}

}

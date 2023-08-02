package seleniumProject;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonInterviewGreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//instead of so big x-path we need to go for iterations and also here cucumber-1kg is a dynamic value 
//		driver.findElement(By.xpath("//div[@class='product']/following-sibling::div[2]/div[@class='product-image']/following-sibling::h4[text()='Cucumber - 1 Kg']/following-sibling::div[2]")).click();
		
		String [] selectedVegetables = {"Brocolli", "Cauliflower"};
		
		List<WebElement> names = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0; i<names.size(); i++)
		{
			String veggies = names.get(i).getText();
			
			List vegetables = Arrays.asList(selectedVegetables);
			if(vegetables.contains(veggies)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
			}
		}
	    driver.close();
	}

}

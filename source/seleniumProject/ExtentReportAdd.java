package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReportAdd {
	ExtentReports extent;
	@BeforeTest
	public void Configuaration() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Report");
		reporter.config().setDocumentTitle("documentTitle");
		
		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("tester", "Amruta");
	}
	
	
    @Test
	public void initialDemo() {
    	ExtentTest test = extent.createTest("Initial test");
		 System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com");
		 System.out.println(driver.getTitle());
//		 test.addScreenCaptureFromBase64String()
		 driver.close();
		 extent.flush();
	
	}

}

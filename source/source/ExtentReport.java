package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.sun.net.httpserver.Authenticator.Retry;

public class ExtentReport {
	static ExtentReports extent;
	
	@BeforeTest
	public static ExtentReports config() {
		//ExtentReports, ExtentSparkReporter
		String path = System.getProperty("user.dir" )+ "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		//To do some configuarations
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Amruta");
		return extent;
	}
	
    @Test(retryAnalyzer = Retry.class)
	public void initialDemo() {
    	 ExtentTest test = extent.createTest("Initial Demo");
		 System.setProperty("webdriver.chrome.driver", "/Users/ACCESS/Downloads/chromedriver_win32/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com");
		 System.out.println(driver.getTitle());
//		 test.addScreenCaptureFromBase64String()
		 driver.close();
		 
		 //forcefully failing the test
		 test.fail("results do no match");
	
		 extent.flush();
	}

}


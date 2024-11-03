package testCase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	public static WebDriver driver;
	public Logger logger;
	public Properties property;
	
	@BeforeClass
	@Parameters({"os","browser"})
	void setup(String os, String br) throws IOException {
		logger = LogManager.getLogger(this.getClass());
		FileReader fr = new FileReader("/CSPEXECUTION/src/test/resources/config.properties");
		Properties p = new Properties();
		p.load(fr);
		
		if(p.getProperty("execution_env").equalsIgnoreCase("remote")) {
			DesiredCapabilities capabilites = new DesiredCapabilities();
			capabilites.setBrowserName("chrome");
			capabilites.setPlatform(Platform.MAC);
		}
		switch(br.toLowerCase()) {
		case "chrome" : driver = new ChromeDriver(); break;
		case "firefox" : driver = new FirefoxDriver();break;
		case "Safari" : driver = new SafariDriver();break;
		}
		driver = new ChromeDriver();
		FileReader fc = new FileReader("/Users/nikhiljain/work/CSPEXECUTION/src/test/resources/config.properties");
		property = new Properties();
		property.load(fc);
		driver.get(property.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	
	@AfterClass
	void finish() {
		driver.quit();
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath="/Users/nikhiljain/work/CSPEXECUTION/report" +"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
	
	public void ExplicitWait(WebElement e , WebDriver driver) {
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		myWait.until(ExpectedConditions.visibilityOfElementLocated((By) e));
	}

}

 package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;
 	

public class BaseClass {

public static WebDriver driver;
public Logger logger;
public Properties p;


@BeforeClass(groups= {"Sanity","Regerssion","Master","DataDriven"})
@Parameters({"os","browser"})
public void setup(@Optional("windows") String os,
                  @Optional("chrome") String br) throws IOException
	{
		//Loading config.properties file 
		FileReader file =new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		logger= LogManager.getLogger(this.getClass());
		
		if (p.getProperty("excution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabalities= new DesiredCapabilities();
			
			//os
			if(os.equalsIgnoreCase("windows"))
			{
				capabalities.setPlatform(Platform.WIN11);
			}
			
			else if(os.equalsIgnoreCase("linux"))
			{
				capabalities.setPlatform(Platform.LINUX);
			}
			
			else if(os.equalsIgnoreCase("mac"))
			{
				capabalities.setPlatform(Platform.MAC);
			}
			
			else 
			{
				System.out.println("No matching Os..");
			    return;
			}
			
			//browser
			switch(br.toLowerCase())
			{
			case "chrome":capabalities.setBrowserName("chrome"); break;
			case "edge":capabalities.setBrowserName("MicrosoftEdge"); break;
			case "firefox":capabalities.setBrowserName("firefox"); break;
			default:System.out.println("No matching browser");
			
			}
			
			driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabalities);
		}
		
		
		
		if(p.getProperty("excution_env").equalsIgnoreCase("local"))
		{
		    switch(br.toLowerCase())
			{
			case "chrome": driver=new ChromeDriver(); break;
			case "edge" : driver=new EdgeDriver(); break;
			case "firefox": driver= new FirefoxDriver(); break;
			default: System.out.println("Invaild browser name...."); return;
			}
		    
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL")); // Reading ulr from properties file
        driver.manage().window().maximize(); 
	}
	
	@AfterClass(groups= {"Sanity","Regerssion","Master","DataDriven"})
	public void teardown ()
	{
		
		driver.quit();
		
	}
	
	public String randomString()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return generatedstring;		
	}


	public String randomNumber()
	{
		String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;		
	}

	
	public String randomAlphaNumberic()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(3);
		String generatednumber=RandomStringUtils.randomNumeric(4);
		return(generatedstring+"@"+generatednumber) ;		
	}

	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
	

	
}
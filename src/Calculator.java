//package src_Appium;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;


public class Calculator {
WebDriver driver;

@BeforeClass
public void setUp() throws MalformedURLException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("BROWSER_NAME", "Calculator");
	capabilities.setCapability("VERSION", "5.1"); 
	capabilities.setCapability("deviceName","ZX1B34CW4S");
	capabilities.setCapability("platformName","Android");
 
   
   capabilities.setCapability("appPackage", "com.android.calculator2");
// This package name of your app (you can get it from apk info app)
	capabilities.setCapability("appActivity","com.android.calculator2.Calculator"); // This is Launcher activity of your app (you can get it from apk info app)

//Create RemoteWebDriver instance and connect to the Appium server
//It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
}

@Test
public void testCal() throws Exception {
   //locate the Text on the calculator by using By.name()
   WebElement two=driver.findElement(By.name("2"));
   two.click();
   WebElement plus=driver.findElement(By.name("+"));
   plus.click();
   WebElement four=driver.findElement(By.name("4"));
   four.click();
   WebElement equalTo=driver.findElement(By.name("="));
   equalTo.click();
   //locate the edit box of the calculator by using By.tagName()
   //xpath("//android.widget.EditText[contains(@resource-id,'com.android.calculator2:id/formula']")
   //System.out.println("Edit text"+driver.findElement(By.xpath("android.widget.EditText[contains(@resource-id,'com.android.calculator2:id/formula')]")));
   System.out.println("Edit"+driver.findElement(By.name("6")).getText());
   //System.out.println("Edit text"+driver.findElement(By.tagName("EditText")));
   //WebElement results=driver.findElement(By.tagName("EditText"));
	//Check the calculated value on the edit box
   
//assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";

}

@AfterClass
public void teardown(){
	//close the app
	driver.quit();
}
}



/*
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;


public class Calculator {
WebDriver driver;

@BeforeClass
public void setUp() throws MalformedURLException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("BROWSER_NAME", "Android");
	capabilities.setCapability("VERSION", "4.4.2"); 
	capabilities.setCapability("deviceName","Emulator");
	capabilities.setCapability("platformName","Android");
 
   
   capabilities.setCapability("appPackage", "com.android.calculator2");
// This package name of your app (you can get it from apk info app)
	capabilities.setCapability("appActivity","com.android.calculator2.Calculator"); // This is Launcher activity of your app (you can get it from apk info app)
//Create RemoteWebDriver instance and connect to the Appium server
 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
}

@Test
public void testCal() throws Exception {
   //locate the Text on the calculator by using By.name()
   WebElement two=driver.findElement(By.name("2"));
   two.click();
   WebElement plus=driver.findElement(By.name("+"));
   plus.click();
   WebElement four=driver.findElement(By.name("4"));
   four.click();
   WebElement equalTo=driver.findElement(By.name("="));
   equalTo.click();
   //locate the edit box of the calculator by using By.tagName()
   WebElement results=driver.findElement(By.tagName("EditText"));
	//Check the calculated value on the edit box
assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";

}

@AfterClass
public void teardown(){
	//close the app
	driver.quit();
}
}




import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//Makemy Trip-fetching

public class Calculator {

	static WebDriver driver;
	
	@Test
	public void demo1(){
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
	//driver=new FirefoxDriver();
	driver.navigate().to("http://google.com");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//String class1=driver.findElement(By.xpath(".//*[@id='class_selector']")).getText();
	//WebElement we=driver.findElement(By.xpath(".//*[@id='class_selector']"));
	WebElement we=driver.findElement(By.id("lst-ib"));
		
	we.sendKeys("Rent in gandhinagar");
	we.sendKeys(Keys.ENTER);

String ExpectedURL=null;
	String pureURL=null;
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//pureURL=driver.findElement(By.xpath("//div/h3/a")).getAttribute("href");
	//System.out.println(" "+pureURL);
	ExpectedURL="http://propzonegandhinagar.in/";
	

	
for(int i=1;i<50;i++)
	{
	
	//System.out.println("");
	//pureURL=driver.findElement(By.xpath("html/body/div[5]/div[4]/div[9]/div[1]/div[3]/div/div[3]/div[2]/div/div/div/div/div/div[1]/div/div/div/div/cite")).getText();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//pureURL=driver.findElement(By.xpath("html/body/div[5]/div[4]/div[9]/div[1]/div[3]/div/div[3]/div[2]/div/div/div/div/div/div["+i+"]/div/div/div/div/cite")).getAttribute("href");
	pureURL=driver.findElement(By.xpath(".//*[@id='rso']/div/div["+i+"]/div/h3/a")).getAttribute("href");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("URL: "+pureURL);
	if(pureURL.contentEquals(ExpectedURL))
	{
		System.out.println("Found propzone at postion of "+i+":"+pureURL);	
		break;	
	}
		//pureURL=driver.findElement(arg0)
		if(i==10||i==20||i==30)
		{
			driver.findElement(By.linkText("Next"));
			
		}
		
		
	}
	
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//Applying boarder to the element
	  js.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "color: red; border: 5px solid red;"); 
	// js.executeScript("", arg1)
	  //js.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, ""); 
	
	List<WebElement> lists = we.findElements(By.tagName("option"));
    
	for(WebElement element: lists)  
    {
        String var2 = element.getText();
        System.out.println(var2);
    }
}

}
*/
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

public class element_Storing {

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
		
	we.sendKeys("Property in gandhinagar");
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
	
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	//pureURL=driver.findElement(By.xpath("html/body/div[5]/div[4]/div[9]/div[1]/div[3]/div/div[3]/div[2]/div/div/div/div/div/div["+i+"]/div/div/div/div/cite")).getAttribute("href");
	pureURL=driver.findElement(By.xpath(".//*[@id='rso']/div/div["+i+"]/div/h3/a")).getAttribute("href");
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	System.out.println("URL: "+pureURL);
	if(pureURL.contentEquals(ExpectedURL))
	{
		System.out.println("Found propzone at postion of "+i+":"+pureURL);	
		break;	
	}
		//pureURL=driver.findElement(arg0)
		if(i==10||i==20||i==29||i==39)
		{
			driver.findElement(By.linkText("Next"));
			
		}
		
		
	}
	
	
	
	/*JavascriptExecutor js = (JavascriptExecutor) driver;
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
*/}

}

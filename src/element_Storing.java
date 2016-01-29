import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Makemy Trip-fetching

public class element_Storing {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	driver=new FirefoxDriver();
	driver.navigate().to("http://www.makemytrip.com/flights");
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//String class1=driver.findElement(By.xpath(".//*[@id='class_selector']")).getText();
	
	
	WebElement we=driver.findElement(By.xpath(".//*[@id='class_selector']"));
	
	
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

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Makemy Trip-fetching

public class element_Storing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ClearTrip Registration
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://www.makemytrip.com/flights");
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//String class1=driver.findElement(By.xpath(".//*[@id='class_selector']")).getText();
	WebElement we=driver.findElement(By.xpath(".//*[@id='class_selector']"));
	List<WebElement> lists = we.findElements(By.tagName("option"));
    for(WebElement element: lists)  
    {
        String var2 = element.getText();
        System.out.println(var2);
    }
		
		
		
		
	}

}

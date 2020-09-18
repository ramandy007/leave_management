import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class AprovalPageTesting extends TestCase
{
	 private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe");
		  driver = new ChromeDriver();
			js = (JavascriptExecutor) driver;
			vars = new HashMap<String, Object>();
	    
	  }
	  @After
	  public void tearDown() 
	  {
		  driver.quit();
	   
	  }
	  @Test
	  public void test3() 
	  {
	    driver.get("https://ramandy007.github.io/leave_management/faculty/FacultyApproval.html");
	    driver.manage().window().setSize(new Dimension(789, 683));
	    driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(5) > .btn")).click();
	    driver.findElement(By.cssSelector("#myModal0 .fa")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(5) > .btn")).click();
	    driver.findElement(By.cssSelector("#myModal2 .fa")).click();
	  }
	
}

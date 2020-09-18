import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ChangePwTest extends TestCase 
{
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() 
{
System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe");
 driver = new ChromeDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@After
public void tearDown() {
 driver.quit();
}
@Test
public void test1() {
 driver.get("https://ramandy007.github.io/leave_management/faculty/ChangePW.html");
 driver.manage().window().setSize(new Dimension(789, 683));
 driver.findElement(By.id("currpw")).click();
 driver.findElement(By.id("currpw")).sendKeys("abcd");
 driver.findElement(By.id("pw")).click();
 driver.findElement(By.cssSelector(".btn-primary")).click();
 String ob=driver.switchTo().alert().getText();
 if(ob.equals("Both New Password And Re-Enter New Password Fields Cant Be Empty"))
 {
 driver.findElement(By.id("pw")).click();
 }
 driver.close();
}
}

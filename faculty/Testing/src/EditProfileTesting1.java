import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
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
public class EditProfileTesting1
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
public void tearDown() {
 driver.quit();
}
@Test
public void test5() throws InterruptedException {
 driver.get("https://ramandy007.github.io/leave_management/faculty/EditProfile.html");
 driver.manage().window().maximize();
 driver.findElement(By.id("email")).click();
 driver.findElement(By.id("email")).sendKeys("anupamasrikanthan@gmail");
 Thread.sleep(1000);
 driver.findElement(By.cssSelector(".container-fluid > .row")).click();
 driver.findElement(By.id("L_prof")).click();
 driver.findElement(By.id("L_prof")).sendKeys("AnupamaSrikanthan");
 Thread.sleep(1000);
 driver.findElement(By.id("a_o_r")).click();
 driver.findElement(By.id("a_o_r")).sendKeys("Machine Learning");
 Thread.sleep(1000);
 driver.findElement(By.id("a_o_r1")).click();
 driver.findElement(By.id("a_o_r1")).sendKeys("Internet Of Things");
 Thread.sleep(1000);
 driver.findElement(By.id("a_o_r2")).click();
 driver.findElement(By.id("a_o_r2")).sendKeys("Compiler Design");
 Thread.sleep(1000);
 driver.findElement(By.id("h_o_d")).click();
 driver.findElement(By.id("h_o_d")).sendKeys("B.Tech");
 Thread.sleep(1000);
 driver.findElement(By.id("P_P")).click();
 driver.findElement(By.id("P_P")).sendKeys("12");
 Thread.sleep(1000);
 driver.findElement(By.id("P_G")).click();
 driver.findElement(By.id("P_G")).sendKeys("2");
 Thread.sleep(1000);
 driver.findElement(By.cssSelector(".btn-primary")).click();
 assertThat(driver.switchTo().alert().getText(), is("Invalid Email Id"));
 Thread.sleep(2000);
}
}

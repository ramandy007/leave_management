// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
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
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class StudentLoginTestTest {
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
  public void studentLoginTest() {
    driver.get("https://ramandy007.github.io/leave_management/student/");
    driver.manage().window().setSize(new Dimension(1304, 768));
    driver.findElement(By.id("sb")).click();
    String msg = driver.switchTo().alert().getText();
    assertThat(msg, is("Empty UserName"));
    driver.findElement(By.cssSelector(".btn-default")).click();
    driver.findElement(By.name("un")).click();
    driver.findElement(By.name("un")).sendKeys("cb.en.u4cse17213");
    driver.findElement(By.name("pw")).click();
    driver.findElement(By.id("sb")).click();
    assertThat(driver.switchTo().alert().getText(), is("Empty Password"));
    driver.findElement(By.name("pw")).click();
    driver.findElement(By.name("pw")).sendKeys("hello");
    driver.findElement(By.id("sb")).click();
    assertThat(driver.switchTo().alert().getText(), is("Invalid Credentials"));
    driver.findElement(By.cssSelector(".row")).click();
    driver.findElement(By.name("pw")).sendKeys("balaji2k.");
    driver.findElement(By.id("sb")).click();
  }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
public class ApprovalTestingTest
{
    public static void main(String[] args) 
    {
        String tcun="cb.en.u4cse17213";
        String tcpw="balaji2k.";
        String at;
        System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://ramandy007.github.io/leave_management/faculty/FacultyApproval.html");
        driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(5) > .btn")).click();
	    driver.findElement(By.cssSelector("#myModal0 .fa")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(5) > .btn")).click();
	    driver.findElement(By.cssSelector("#myModal2 .fa")).click();
	  }
	
}

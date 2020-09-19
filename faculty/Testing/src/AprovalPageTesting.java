import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AprovalPageTesting
{
    public static void main(String[] args) throws InterruptedException
    {
       
            System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://ramandy007.github.io/leave_management/faculty/FacultyApproval.html");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//button[@onclick='DeleteRowFunctionA()']")).click();
    		Alert alert=driver.switchTo().alert();
    		if(alert.getText().equals("CONFIRMATION !! Click OK To Accept Pass !"))
    		{
    			System.out.println("Successful Test");
    		}
    		alert.dismiss();
    		driver.findElement(By.xpath("//button[@onclick='DeleteRowFunctionR()']")).click();
    		Alert alert1=driver.switchTo().alert();
    		if(alert.getText().equals("CONFIRMATION !! Click OK To Reject Pass !"))
    		{
    			System.out.println("Successful Test");
    		}
    		alert.dismiss();
            driver.close();
        }
 }


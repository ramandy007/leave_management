import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login_Testing
{
    public static void main(String[] args) throws InterruptedException
    {
        String tcun="cb.en.u4cse17213";
        String tcpw="balaji2k.";
        String at;
        System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://ramandy007.github.io/leave_management/faculty/");
        driver.manage().window().maximize();
        driver.findElement(By.id("un")).sendKeys(tcun);
        driver.findElement(By.id("pw")).sendKeys(tcpw);
        driver.findElement(By.id("sub")).click();
        at=driver.getTitle();
        String et="Faculty Dashboard";
        if(at.equalsIgnoreCase(et))
        {
            System.out.println("Sucessful Test");
            //Thread.sleep(1000);
            driver.close();
            System.exit(0);
        }
        else
        {
            System.out.println("Not A Sucessful Text");
        }
    }
}
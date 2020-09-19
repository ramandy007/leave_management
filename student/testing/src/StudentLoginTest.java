import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class StudentLoginTest
{
    public static void main(String[] args) throws InterruptedException
    {
        String tcun[]= {"","CB.EN.U4CSE17233","","CB.EN.U4CSE17207"};
        String tcpw[]= {"","","12345","12345678"};
        String exp[]= {"Empty UserName","Empty Password","Empty UserName","Invalid Credentials"};
        for(int i=0;i<tcun.length;i++)
        {
            System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://ramandy007.github.io/leave_management/student/");
            driver.manage().window().maximize();
            driver.findElement(By.id("un")).sendKeys(tcun[i]);
            driver.findElement(By.id("pw")).sendKeys(tcpw[i]);
            driver.findElement(By.id("sb")).click();
            Alert alert = driver.switchTo().alert();
            String alertMessage= alert.getText();
            if(alertMessage.equalsIgnoreCase(exp[i]))
            {
                System.out.println("Successful Test");
            }
            else
            {
                System.out.println("Not A Sucessful Text");
            }
            alert.accept();
            driver.close();
        }
        String un="cb.en.u4cse17213";
        String pw="balaji2k.";
        String at;
        System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://ramandy007.github.io/leave_management/student/");
        driver.manage().window().maximize();
        driver.findElement(By.id("un")).sendKeys(un);
        driver.findElement(By.id("pw")).sendKeys(pw);
        driver.findElement(By.id("sb")).click();
        at=driver.getTitle();
        String et="Student Dashboard";
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
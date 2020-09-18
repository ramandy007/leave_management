package Testing;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTestingAlerts 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String tcun[]= {"","CB.EN.U4CSE17233","","CB.EN.U4CSE17207"};
		String tcpw[]= {"","","12345","12345678"};
		String exp[]= {"Both Fields Are Empty","Password Field Is Empty","User Name Field Is Empty","Invalid Credentials"};
		for(int i=0;i<tcun.length;i++)
		{
			System.setProperty("webdriver.chrome.driver","src\\Testing\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://ramandy007.github.io/leave_management/faculty/login.html");
			driver.manage().window().maximize();
			driver.findElement(By.id("un")).sendKeys(tcun[i]);
			driver.findElement(By.id("pw")).sendKeys(tcpw[i]);
			driver.findElement(By.id("sb")).click();
			Alert alert = driver.switchTo().alert();
			String alertMessage= driver.switchTo().alert().getText();
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
	}
}

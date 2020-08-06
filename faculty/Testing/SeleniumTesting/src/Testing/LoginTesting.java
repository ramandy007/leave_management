package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTesting
{
	public static void main(String[] args) throws InterruptedException 
	{
		String tcun="cb.en.u4cse17213";
		String tcpw="balaji2k.";
		String at;
		System.setProperty("webdriver.chrome.driver","src\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ramandy007.github.io/leave_management/faculty/login.html");
		//driver.get("file:///E:/B%20Tech%20AMRITA/7th%20Semester/NCP/leave_management/faculty/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("un")).sendKeys(tcun);
		driver.findElement(By.id("pw")).sendKeys(tcpw);
		driver.findElement(By.id("sb")).click();
		at=driver.getTitle();
		String et="Faculty Dashboard";
		System.out.println(at);
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

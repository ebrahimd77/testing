package simpleCode;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Guru99createingNewCustomer {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:/divers/chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//opening guru99 site
		driver.get("https://demo.guru99.com/v4/");
		
		//login in guru99 app
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr385422");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("asuqEva");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		try
		{
			driver.findElement(By.xpath("//div[@id='dismiss-button']"))	.click();	
			}
		catch (Exception e) {
			// TODO: handle exception
		}
		//creating new customer
		
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("Ebrahim");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("01/06/1977");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys("Kukatpally");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")).sendKeys("Telangana");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")).sendKeys("500072");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")).sendKeys("9182066864");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")).sendKeys("ebrahimd77@gmail.com");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")).sendKeys("madIha@786");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
	}
	

}

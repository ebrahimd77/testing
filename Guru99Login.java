package simpleCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Login {
	
	public static void main(String[]args) {

	System.setProperty("webdriver.chrome.driver","E:/divers/chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/v4/");

}

}
package simpleCode;


import java.io.FileInputStream;

import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingLoginAndNewCustByExtenalData {
	
	

	

		public static void main(String[] args) throws Throwable {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","E:/divers/chromedriver.exe");

			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize(); 

			   String Excelpath= "C:\\Users\\IBBU\\Downloads\\Agile367\\TestData\\guru99testdata.xlsx";
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			System.out.println(Excelpath);
			//Create an object of FileInputStream Class to 
			FileInputStream inputstream= new FileInputStream(Excelpath);
			
			//Creating workbook instance refers to.xls
			XSSFWorkbook book = new XSSFWorkbook(inputstream);
			
			// get sheet with given name
			XSSFSheet sheet= book.getSheet("LoginSheet");
			//System.out.println("sheet");
			
			// get row from specified sheet
			 XSSFRow row =  sheet.getRow(1);
			XSSFCell cellUserName= row.getCell(0);
			String UserName = cellUserName.getStringCellValue();
			
			XSSFCell cellPassword= row.getCell(1);
			String password = cellPassword.getStringCellValue();
		
					
			//opening guru99 site
			driver.get("https://demo.guru99.com/v4/");
				
			
			//login in guru99 app by Using data from Excel file
			driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(UserName); 
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
					
			try
			{
				driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();	
				}
			catch (Exception e) {
				
			}
			String Locotorspath="C:\\Users\\IBBU\\Downloads\\Agile367\\ObjectRepoProperties\\Guru99File.properties";
			FileInputStream fin = new FileInputStream(Locotorspath);
			Properties prop = new Properties();
			prop.load(fin);
			
			Thread.sleep(10000);
			try
			{
				 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
				  }
			catch (Exception e) {
				
			}
			//Creating New Customer page by Using data from Properties file
			                                    
			   String newCust=prop.getProperty("new_customer_link");
			   System.out.println("newCust : "+newCust);
			   driver.findElement(By.xpath(newCust)).click();
			   Thread.sleep(10000);
				try
				{
					 driver.findElement(By.xpath("//*[@id='dismiss-button']")).click();
					  }
				catch (Exception e) {
					
				}
			   String Custname=prop.getProperty("CustomerName_TextBox");
			   driver.findElement(By.xpath(Custname)).sendKeys("Ebrahim");
			   String CustMbtn=prop.getProperty("GenderRadio_Mbtn");
			   driver.findElement(By.xpath(CustMbtn)).click();
			   String CustFbtn=prop.getProperty("GenderRadio_Fbtn");
			   driver.findElement(By.xpath(CustFbtn)).click();
			   String CustDOB=prop.getProperty("DOB_cust");
			   driver.findElement(By.xpath(CustDOB)).sendKeys("01/06/1977");
			   String CustAdd=prop.getProperty("Add_cust");
			   driver.findElement(By.xpath(CustAdd)).sendKeys("Kukatpally");
			   String CustCity=prop.getProperty("City_cust");
			   driver.findElement(By.xpath(CustCity)).sendKeys("Hyderabad");
			   String CityPin=prop.getProperty("City_pin");
			   driver.findElement(By.xpath(CityPin)).sendKeys("500072");
			   String CustTelNo=prop.getProperty("TelePhNO_cust");
			   driver.findElement(By.xpath(CustTelNo)).sendKeys("9182066864");
			   String CustEmail=prop.getProperty("email_cust");
			   driver.findElement(By.xpath(CustEmail)).sendKeys("ebrahimd77@gmail.com");
			   String CustEmailPwd=prop.getProperty("emailPwd_cust");
			   driver.findElement(By.xpath(CustEmailPwd)).sendKeys("madIha@786");
			   String CustSubbtn=prop.getProperty("SubBtn");
			   driver.findElement(By.xpath(CustSubbtn)).click();
			   
			   
			   
		}

	}




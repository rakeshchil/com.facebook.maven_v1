package com.facebook.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.facebook.utilities.Readconfig;

public class Baseclass {
	//static readconfig;
	Readconfig readconfig = new Readconfig();	
	public String baseurl1 =   readconfig.getapplicationurl();
	public String firstname3 = readconfig.getfirstname();
	public String lastname3 =  readconfig.getlastname();
	public String newpassw3 =  readconfig.getnewpassword();
	public String day3 =	   readconfig.getdates();
	public String month3 = 	   readconfig.getmonths();
	public String year3 = 	   readconfig.getyearrr();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup( String br) {
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
		driver = new ChromeDriver();}
		//logger.info("browser is opened");
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getfirefoxpath());
			driver = new FirefoxDriver();
		}
		
	}
	
	/*@AfterClass
	public void teardown() {
		driver.quit();
		//logger.info("browser is closed");
	}
	*/

}

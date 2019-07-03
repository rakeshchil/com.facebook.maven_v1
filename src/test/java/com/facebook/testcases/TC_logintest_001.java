package com.facebook.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.facebook.pageobjects.Loginpage;

public class TC_logintest_001 extends Baseclass {
	@Test
	public void setup1() {
		driver.get(baseurl1);
		//driver.manage().window().maximize();
		Loginpage obj = new Loginpage(driver);
		obj.firstname1(firstname3);
		//Baseclass.firstname3;
		obj.lastname1(lastname3);
		obj.newpassword1(newpassw3);
		obj.date1(day3);
		//obj.setmonth(month3);
		//obj.setyear(year3);
		
	}

}

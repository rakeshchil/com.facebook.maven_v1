package com.facebook.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginpage {
	WebDriver driver;
	Select ts;
	
	@FindBy(name="firstname")
	WebElement firstname;
	
	@FindBy(how=How.NAME , using="lastname")
	WebElement lastname;
	
	@FindBy(id="u_0_x")
	WebElement newpassword;
	
	@FindBy(id="day")
	WebElement date;
	
	@FindBy(id = "month")
	WebElement month1;
	
	@FindBy(id = "year")
	WebElement year1;
	
	public Loginpage(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void firstname1(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void lastname1(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void newpassword1(String nname) {
		newpassword.sendKeys(nname);
	}
	
	public void date1(String ds) {
		ts = new Select(date);
		ts.selectByVisibleText(ds);
		}
	
	public void setmonth(String mon) {
		ts = new Select(month1);
		ts.selectByVisibleText(mon);
	}
	
	public void setyear(String yea) {
		ts = new Select(year1);
		ts.selectByValue(yea);
	}
	
	

}

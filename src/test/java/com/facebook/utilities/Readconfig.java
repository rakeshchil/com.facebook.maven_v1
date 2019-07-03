package com.facebook.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class Readconfig {
	Properties pro;
	public Readconfig() {
		File src= new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro =  new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getapplicationurl() {
		String url =pro.getProperty("baseurl");
		return url;
	}
	
	public String getfirstname() {
		String fname = pro.getProperty("firstnames");
		return fname;
	}
	
	public String getlastname() {
		String lname = pro.getProperty("lastnames");
		return lname;
	}
	
	public String getnewpassword() {
		String newpassw = pro.getProperty("newpasswords");
		return newpassw;
	}
	
	public String getdates() {
		String dateee= pro.getProperty("dates");
		return dateee;
	}
	
	public String getmonths() {
		String monthsss = pro.getProperty("months");
		return monthsss;
	}
	
	public String getyearrr() {
		String yearsss = pro.getProperty("years");
		return yearsss;
	}
	
	public String getchromepath() {
		String cpath = pro.getProperty("chromepath");
		return cpath;
	}
	
	public String getfirefoxpath() {
		String fpath = pro.getProperty("firefoxpath");
		return fpath;
	}
	
		
}


	

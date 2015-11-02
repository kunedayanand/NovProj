package com.sample.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class2 
{
	FirefoxDriver d;
	@BeforeMethod
	public void setup()
	{
		  d=new FirefoxDriver();
		  d.navigate().to("http://google.com");
		  
	}
    @Test
    public void test()
    {
    	d.findElement(By.linkText("Gmail")).click();
    }
}

package com.model;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class registerloginnew {
  
public WebDriver driver;
	

@Parameters({"firstname1","lastname1","mobile number","email1","address1","city1","state1","pin code","username11","password12","confirmpasswd"})
	@Test
  public void Registerpagesuccessful(String f,String a,String num,String eml,String addr,String city,String st,String code,String unm,String pwd,String cpwd ) {
		System.out.println("The main page is:");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(f);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(a);
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(num);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(eml);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(addr);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(st);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(code);
		
		
		driver.findElement(By.xpath("//select[@name='country']/option[108]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(unm);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(cpwd);
	
		driver.findElement(By.xpath("//input[@name='register']")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();
  }
 
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @Parameters({"url"})
  @BeforeTest
  public void beforeTest(String urlnm) {
	  
	  driver.get(urlnm);
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("The Data under before suite");
	  System.setProperty("webdriver.chrome.driver", "G:\\Mams lecture practicals\\selenium exes file and jar files\\chromedriver_win32 (1)\\chromedriver.exe"); 
	  driver=new ChromeDriver();
	   
  }

  @AfterSuite
  public void afterSuite() {
	  //driver.close();
  }
  }


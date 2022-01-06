package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HARSHITHA\\eclipse-workspace\\MywebTest\\src\\main\\resources\\drivers\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://demo.automationtesting.in/Register.html");
		    
		    WebElement element = driver.findElement(By.xpath("//Select[@id='Skills']"));
		    Select sel=new Select(element);
		    sel.selectByVisibleText("Android");

	}

}

package com.quaiso.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"u_0_f\"]"));
		element.sendKeys("Mohit");
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		select.selectByIndex(2);

	}

}

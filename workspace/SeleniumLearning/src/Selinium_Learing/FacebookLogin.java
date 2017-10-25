package Selinium_Learing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver");
WebDriver w =new ChromeDriver();

w.get("https://facebook.com");
WebElement email =w.findElement(By.id("email"));
WebElement password =w.findElement(By.id("pass"));
WebElement submit =w.findElement(By.xpath("//input[@value='Log In']"));
email.sendKeys("mohit.godara@gamil.com");
password.sendKeys("password");
submit.click();
//System.out.println(w.getTitle());
	}

}

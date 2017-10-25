package Selinium_Learing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class FirefoxProfle {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//FirefoxDriver//geckodriver");
		
		
		ProfilesIni allProfile = new ProfilesIni();
		FirefoxProfile prof =allProfile.getProfile("Selenium");
		WebDriver w = new FirefoxDriver(prof);
		w.get("https://facebook.com");
		WebElement email = w.findElement(By.id("email"));
		WebElement password = w.findElement(By.id("pass"));
		WebElement submit = w.findElement(By.xpath("//input[@value='Log In']"));
		email.sendKeys("mohit.godara@gamil.com");
		password.sendKeys("password");
		submit.click();
		// System.out.println(w.getTitle());
	}

}

package sp.SampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.saucedemo.com");
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		 //driver.close();
		
		//WebDriverManager.firefoxdriver().setup();
		/*WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.name("q")).sendKeys("Pooja");*/

	}

}

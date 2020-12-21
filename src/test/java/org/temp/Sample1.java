package org.temp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91958\\Documents\\Studydocs\\Selenium\\Practice3\\FirstMavenProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.xspdf.com/resolution/51736334.html");
	}
	
}

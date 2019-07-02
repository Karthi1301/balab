package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\indud\\eclipse-workspace\\Screen\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File s=tk.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		//dest
		File d=new File("C:\\Users\\indud\\eclipse-workspace\\Screen\\Scrennshot\\first.png");
		FileUtils.copyFile(s,d);
		
		
		
		
	}

}

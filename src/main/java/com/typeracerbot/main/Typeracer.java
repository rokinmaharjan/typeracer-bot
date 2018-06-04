package com.typeracerbot.main;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Typeracer {
	private static final String TYPERACE_URL = "http://play.typeracer.com/?rt=17gvf2bwvu";
	
	public static void main(String[] args) throws InterruptedException {
		Logger logger = Logger.getLogger("Typeracer");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to(TYPERACE_URL);
		driver.manage().window().maximize();

		try {
			driver.findElement(By.className("raceAgainLink")).click();
		} catch (WebDriverException e) {
			logger.info("Exception caught while clicking join race button. Exception: " + e.getMessage());
			driver.findElement(By.className("raceAgainLink-flashOn")).click();
		}

//		Thread.sleep(1000);
//		List<WebElement> texts = driver.findElements(By.cssSelector("div span[unselectable='on']"));

		String content = "Look man... I can't... I can't watch this. Pay the bills, station break. Break it down! Operators are standing by. Cubic zirconium necklace. You're soaking in it. And our fabulous swimsuit issue. When you've got a headache this big. Read the book. This is your brain on drugs. I've fallen and I can't get up!";
//		for (WebElement text : texts) {
//			content = content + text.getText().trim() + " ";
//		}

//		for (int i = 0; i < texts.size(); i++) {
//			if (i>3) {
//				content = " " + texts.get(i).getText();
//				continue;
//			}
//			
//			content += texts.get(i).getText();
//		}

		System.out.println(content);

		Thread.sleep(1000);
		driver.findElement(By.className("txtInput")).sendKeys(content);

		// driver.close();
	}

}

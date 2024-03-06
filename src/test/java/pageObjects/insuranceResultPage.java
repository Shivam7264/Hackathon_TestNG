package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;
import utilities.WriteData;

public class insuranceResultPage extends BasePage {
BaseClass base=new BaseClass();
	public insuranceResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Elements
		@FindBy(xpath = "//p[text()='Sort by']")
		WebElement sortBy;//driver.findElement(By.xpath("//summary/p")).click();
		
		@FindBy(xpath = "(//input[@name='sort'])[2]/..")
		WebElement lowToHigh;
		
		@FindBy(xpath = "//*[@class='quotesCard--insurerName']")//NAME OF INSURANCE COMPANY
		List<WebElement> companyName;

		@FindBy(xpath = "//*[@class='premiumPlanPrice']")//PRICE OF INSURANCE COMPANY
		List<WebElement> price;
			
		
		// Action Methods
		public void sorting() throws InterruptedException {
			Thread.sleep(5000);
//			Wait<WebDriver> wait = new FluentWait<>(driver)
//				    .withTimeout(Duration.ofSeconds(20))
//				    .pollingEvery(Duration.ofMillis(5000));
			// wait.until(ExpectedConditions.elementToBeClickable(sortBy));
			 base.clicker(sortBy);
			// wait.until(ExpectedConditions.elementToBeClickable(lowToHigh));
			 base.clicker(lowToHigh);
			
		}
		
		public void result() throws IOException {
		
			for(int i=0;i<3;i++) {
				// ANSI escape code for red color
		        String redColor = "\u001B[31m";
				 // ANSI escape code for green color
		        String greenColor = "\u001B[32m";
		        // ANSI escape code for reset color
		        String resetColor = "\u001B[0m";
				String name=companyName.get(i).getText();
				String cost=price.get(i).getText();
				System.out.println(redColor+name+": "+greenColor+cost+resetColor);
					}
			
					}
	}





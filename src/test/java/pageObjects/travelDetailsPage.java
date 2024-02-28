package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class travelDetailsPage extends BasePage {
BaseClass base =new BaseClass();
	public travelDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Elements
		@FindBy(xpath = "//*[@id=\"country\"]")
		WebElement inputCountry;
		@FindBy(xpath = "//*[@id=\"search-country\"]/ul/li[1]")
		WebElement suggestedCountry;
		
		@FindBy(xpath = "//*[@id=\"prequote-wrapper\"]/div[2]/div/div[2]/button")
		WebElement btnNext;
		
		
		@FindBy(xpath = "(//*[@placeholder='dd mmmm, yyyy'])[1]")
		WebElement calender;
		
		@FindBy(xpath = "(//span[text()='2'])[2]")
		WebElement startDate;
		
		@FindBy(xpath = "(//span[text()='10'])[2]")
		WebElement endDate;
		
		
		@FindBy(xpath = "//*[@id=\"traveller_2\"]")
		WebElement people;
		
		@FindBy(xpath = "(//*[@id=\"divarrow_undefined\"]/div)[1]")
		WebElement ageDrop1;
		@FindBy(xpath = "(//*[@id=\"divarrow_undefined\"]/div)[2]")
		WebElement ageDrop2;
		@FindBy(xpath = "//*[@id=\"optionBox_0_wrapper\"]/div[23]/input")
		WebElement age1;
		@FindBy(xpath = "//*[@id=\"optionBox_1_wrapper\"]/div[24]/input")
		WebElement age2;
		
		@FindBy(xpath = "//*[@id=\"ped_no\"]")
		WebElement medicalNo;
	
		@FindBy(xpath = "//*[@id=\"mobileNumber\"]")
		WebElement inputMobile;
		@FindBy(xpath = "//button[text()='View plans']")
		WebElement btnViewPlan;

		
		@FindBy(xpath = "//section[1]/details/ul/li[2]")
		WebElement lowToHigh;
		
		
		
		
		
		
		// Action Methods
		public void inputCountryName() {
			inputCountry.click();
			inputCountry.sendKeys("Germany");
		}
		public void clickCountry() {
			base.clicker(suggestedCountry);
		}
		public void clickNext() {
			base.clicker(btnNext);
		}
		
		public void selectDate() throws InterruptedException {
		
			base.clicker(calender);
			
			base.clicker(startDate);
			
			base.clicker(endDate);
			
			base.clicker(btnNext);
			
			
			
		}
		
		
	
		
		public void clickNext1() {
			base.clicker(btnNext);
		}
		public void selectPeople() {
			
			base.clicker(people);
		}
		public void selectAge1() {
			base.clicker(ageDrop1);
			base.clicker(age1);
		}
		public void selectAge2() {
			base.clicker(ageDrop2);
			base.clicker(age2);
		}
		public void medicalCondition() {
			base.clicker(medicalNo);
			base.clicker(btnNext);
		}
		public void mobileNumber() {
			base.clicker(inputMobile);
			inputMobile.sendKeys("9455080233");
			base.clicker(btnViewPlan);
		}
		
		
		

}

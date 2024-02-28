package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class homePage extends BasePage {
 BaseClass base=new BaseClass();
	public homePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	// Elements
	@FindBy(xpath = "//section/div[7]/a")//travel button
	WebElement travelInsurance;
	
	@FindBy(xpath = "//section/div[4]/a")//car button
	WebElement carInsurance;
	
	@FindBy(xpath = "//a[text()='Buying a new car? Click here']")//do not know no. button
	WebElement donotKnow;
	
	@FindBy(xpath = "//a[text()='Insurance Products ']")//insurance products . button
	WebElement healthInsurance;
	
	@FindBy(xpath = "//div[5]/div[2]/div/ul/li[2]//div[3]/ul/li//span")//health ins menu items list
	List<WebElement>  menuItems;
	
		
	// Action Methods
	public void clickTravel() {
		base.clicker(travelInsurance);
	}
	public void clickCar() {
		base.clicker(carInsurance);
	}
	public void noNumber() {
		base.clicker(donotKnow);
	}
	
	public void hoverHealth() throws IOException {
		Actions act=new Actions(driver);
		act.moveToElement(healthInsurance).perform();
		base.printList(menuItems);
	}

}

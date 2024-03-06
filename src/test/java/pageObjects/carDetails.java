package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class carDetails extends BasePage {
BaseClass base =new BaseClass();
	public carDetails(WebDriver driver) {
		super(driver);
	}
	
	
	
	


	@FindBy(xpath = "//*[@id='dvRTO']/div/ul/li[3]/span[1]")//city button
	WebElement city;
	
	@FindBy(xpath = "//span[normalize-space()='Mumbai']")//city button
	WebElement cityNew;

	@FindBy(xpath = "//*[@id=\"section3\"]/ul/li[2]/span")//city code button
	WebElement cityCode;
	
	@FindBy(xpath = "//li[text()='MH43']")//city code button
	WebElement cityCodeNew;

	@FindBy(xpath = "//b[text()='MARUTI']")//brand button
	WebElement brand;
	
	@FindBy(xpath = "//span[text()=\"KIA\"]")//brand button
	WebElement brandNew;

	@FindBy(xpath = "//b[text()='Brezza']")//model button
	WebElement model;
	
	@FindBy(xpath = "//li[text()=\"Carens\"]")//model button
	WebElement modelNew;

	@FindBy(xpath = "//*[@id=\"Petrol\"]")//fuel button
	WebElement fuelType;
	
	@FindBy(xpath = "//li[text()='Petrol']")//fuel button
	WebElement fuelTypeNew;

	@FindBy(xpath = "//b[text()='ZXi (1462 cc)']")//variant button
	WebElement variant;
	
	@FindBy(xpath = "//li[text()=\"Prestige 1.5 Petrol 7 STR (1497 cc)\"]")//variant button
	WebElement variantNew;


	@FindBy(xpath = "//*[@id=\"name\"]")//name box
	WebElement selectName;
	
	@FindBy(xpath = "//input[@tabindex=\"1\"]")//name box
	WebElement selectNameNew;

	@FindBy(xpath = "//*[@id=\"email\"]")//email box
	WebElement selectEmail;
	
	@FindBy(xpath = "//input[@tabindex=\"2\"]")//email box
	WebElement selectEmailNew;

	@FindBy(xpath = "//button[@name='next']")//view prices button
	WebElement btnViewPrices;
	
	@FindBy(xpath = "//button[text()=\"View Prices\"]")//view prices button
	WebElement btnViewPricesNew;
	
	@FindBy(xpath = "//*[@class=\"msg-error show\"]")//error msg button
	WebElement errorMsg;
	
	@FindBy(xpath = "//div[@class=\"errorMsg\"]")//error msg button
	WebElement errorMsgNew;

	public void chooseCity() {
		//base.clicker(city);
		base.clicker(cityNew);
		
	}
	
	public void chooseCityCode() {
		
		//base.clicker(cityCode);
		base.clicker(cityCodeNew);
	}
	public void chooseCarBrand() {
		
//		base.clicker(brand);
		base.clicker(brandNew);
	}
	public void chooseCarModel() {
		
//		base.clicker(model);
		base.clicker(modelNew);
	}
	public void selectFuelType() {
//		base.clicker(fuelType);
		base.clicker(fuelTypeNew);
	}
	public void chooseCarVariant() {
		
		//base.clicker(variant);
		base.clicker(variantNew);
	}
	public void fillDetails() {
//		selectName.sendKeys("xyx");
//		selectEmail.sendKeys("1234@ejdbeujb");
		selectNameNew.sendKeys("xyx");
		selectEmailNew.sendKeys("1234@ejdbeujb");
	
	}
	public String getErrorMsg(){
		// ANSI escape code for red color
        String redColor = "\u001B[31m";
        // ANSI escape code for reset color
        String resetColor = "\u001B[0m";
//		base.clicker(btnViewPrices);
        base.clicker(btnViewPricesNew);
//		System.out.println("Error Message :"+redColor+errorMsg.getText()+resetColor);
//        return errorMsg.getText();
        System.out.println("Error Message :"+redColor+errorMsgNew.getText()+resetColor);
        return errorMsgNew.getText();
	}
	
	
	
	
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class carDetails extends BasePage {
BaseClass base =new BaseClass();
	public carDetails(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath = "//*[@class=\"msg-error show\"]")//error msg button
	WebElement errorMsg;

	@FindBy(xpath = "//*[@id='dvRTO']/div/ul/li[3]/span[1]")//city button
	WebElement city;

	@FindBy(xpath = "//*[@id=\"section3\"]/ul/li[2]/span")//city code button
	WebElement cityCode;

	@FindBy(xpath = "//b[text()='MARUTI']")//brand button
	WebElement brand;

	@FindBy(xpath = "//b[text()='Brezza']")//model button
	WebElement model;

	@FindBy(xpath = "//*[@id=\"Petrol\"]")//fuel button
	WebElement fuelType;

	@FindBy(xpath = "//b[text()='ZXi (1462 cc)']")//variant button
	WebElement variant;


	@FindBy(xpath = "//*[@id=\"name\"]")//name box
	WebElement selectName;

	@FindBy(xpath = "//*[@id=\"email\"]")//email box
	WebElement selectEmail;

	@FindBy(xpath = "//button[@name='next']")//view prices button
	WebElement btnViewPrices;

	public void chooseCity() {
		base.clicker(city);
		
	}
	
	public void chooseCityCode() {
		
		base.clicker(cityCode);
	}
	public void chooseCarBrand() {
		
		base.clicker(brand);
	}
	public void chooseCarModel() {
		
		base.clicker(model);
	}
	public void selectFuelType() {
		base.clicker(fuelType);
	}
	public void chooseCarVariant() {
		
		base.clicker(variant);
	}
	public void fillDetails() {
		selectName.sendKeys("xyx");
		selectEmail.sendKeys("1234@ejdbeujb");
	
	}
	public String getErrorMsg(){
		// ANSI escape code for red color
        String redColor = "\u001B[31m";
        // ANSI escape code for reset color
        String resetColor = "\u001B[0m";
		base.clicker(btnViewPrices);
		System.out.println("Error Message :"+redColor+errorMsg.getText()+resetColor);
		return errorMsg.getText();
	}
	
	
	
	
}

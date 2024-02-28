package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.carDetails;
import pageObjects.homePage;

public class TC_03_HealthInsurance extends BaseClass {
	
	   
	   
	   @Test(priority=1,groups= {"sanity"})
	   public void verifyHealthList() throws IOException {
		   logger.info("verifying health menu list");
		   homePage hp=new homePage(driver);
		   System.out.println("navigated to home page");
		   hp.hoverHealth();
		   System.out.println("list printed on console");
		   
	   }
}

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
import pageObjects.homePage;
import pageObjects.insuranceResultPage;
import pageObjects.travelDetailsPage;

public class TC_01_TravelInsurance extends BaseClass{
	

	@Test(priority=1,groups= {"regression","master"})
  	public void setDestination() throws InterruptedException {
  		logger.info("filling traveller details");
  		insuranceResultPage rs=new insuranceResultPage(driver);
  		homePage hp=new homePage(driver);
  		travelDetailsPage tp=new travelDetailsPage(driver);
	 	hp.clickTravel();
	 	Thread.sleep(5000);
	 	tp.inputCountryName();
	 	tp.clickCountry();
		tp.clickNext();
  			}
	@Test(priority=2, dependsOnMethods= {"setDestination"})
  	public void setTripDate() throws InterruptedException {
  		travelDetailsPage tp=new travelDetailsPage(driver);
  		tp.selectDate();
	  
  	}
	@Test(priority=3, dependsOnMethods= {"setTripDate"})
  	public void setTravellersDetail() throws InterruptedException {
  		travelDetailsPage tp=new travelDetailsPage(driver);
  		tp.selectPeople();
		tp.selectAge1();
		Thread.sleep(5000);
		tp.selectAge2();
		tp.clickNext();
	  
  	}
	@Test(priority=4, dependsOnMethods= {"setTravellersDetail"})
  	public void setMedicalDFitness() {
  		travelDetailsPage tp=new travelDetailsPage(driver);
  		tp.medicalCondition();
	  
  	}
	
	@Test(priority=5, dependsOnMethods= {"setMedicalDFitness"})
  	public void setContactDetails() {		
  		travelDetailsPage tp=new travelDetailsPage(driver);
  		tp.mobileNumber();
		
  	}
	@Test(priority=6, dependsOnMethods= {"setContactDetails"})
  	public void showResult() throws InterruptedException {
		logger.info("printing insurance plans ");
  		insuranceResultPage rs=new insuranceResultPage(driver);
  		rs.sorting();
  	}

}

package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import factory.BaseClass;
import pageObjects.carDetails;
import pageObjects.homePage;

public class TC_02_CarInsurance extends BaseClass{
	@Test(priority=1,groups= {"master"})
	  public void navigatingCarInsurance() {
		  logger.info("verifying car insurance");
		   homePage hp=new homePage(driver);
		   carDetails cp=new carDetails(driver);
		   hp.clickCar();
		   cp.noNumber();
	  }
	@Test(priority=2,groups= {"master"},dependsOnMethods= {"navigatingCarInsurance"})
	  public void settingCarDetails() {
		  carDetails cp=new carDetails(driver);
		  cp.chooseCity();
	       cp.chooseCityCode();
	       cp.chooseCarBrand();
	       cp.chooseCarModel();
	       cp.selectFuelType();
	       cp.chooseCarVariant();
	  }
	@Test(priority=3,groups= {"master"},dependsOnMethods= {"settingCarDetails"})
	  public void verifyErrorMessage() {
		logger.info("verifying error message");
		  carDetails cp=new carDetails(driver);
		  cp.fillDetails();
		  String res=  cp.getErrorMsg();
			       try {
			     Assert.assertEquals(res, "Please enter a valid e-mail ID.");
			       }
			       catch(Exception e) {
			    	   System.out.println("failed");
			       }
	  }
	  
	   
}

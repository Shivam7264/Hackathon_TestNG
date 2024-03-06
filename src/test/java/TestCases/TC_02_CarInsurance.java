package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import factory.BaseClass;
import pageObjects.carDetails;
import pageObjects.homePage;

public class TC_02_CarInsurance extends BaseClass{
	@Test(priority=1,groups= {"regression","master"})
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
	@Test(priority=3,groups= {"regression"},dependsOnMethods= {"settingCarDetails"})
	  public void verifyErrorMessage() {
		  carDetails cp=new carDetails(driver);
		  cp.fillDetails();
		  String res=  cp.getErrorMsg();
			       try {
			     Assert.assertEquals(res, "Enter a valid email id");
			       }
			       catch(Exception e) {
			    	   System.out.println("failed");
			       }
	  }
	  
	   
}

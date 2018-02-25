package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;
public class TC002_CreateLeadTestCase extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLeadcase";
		testDescription="Create a lead and verify it";
		testNodes="Leads";
		category="Smoke";
		authors="Fahimas";
		browserName="chrome";
		dataSheetName="TC002";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String vName,String cmpName,String fName,String lName) 
	{
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCRMSFAlink()
		.clickLeadtabs()
		.EnterCompanyName(cmpName)
		.EnterFirstName(fName)
		.EnterLastName(lName)
		.clickCreateleadButton()
		.checkEnteredUsername(fName);
		
}
}
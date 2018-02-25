package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateleadPage extends ProjectMethods {
	public CreateleadPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID, using ="createLeadForm_companyName")
	private WebElement CompanyNameField;
	public CreateleadPage EnterCompanyName(String cmpName)
	{
		
		//WebElement CompanyNameField = locateElement("id", "createLeadForm_companyName");
		type(CompanyNameField, cmpName);
		return this;
	}
	@FindBy(how=How.ID,using ="createLeadForm_firstName")
	private WebElement FirstnameField;
	public CreateleadPage EnterFirstName(String fName) 
	{
		//WebElement FirstnameField = locateElement("id", "createLeadForm_firstName");
		type(FirstnameField, fName);
		return this;
	}
	@FindBy(how=How.ID,using = "createLeadForm_lastName")
	private WebElement LastnameField;
	public CreateleadPage EnterLastName(String lName)
	{
		//WebElement LastnameField = locateElement("id", "createLeadForm_lastName");
		type(LastnameField, lName);
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using = "smallSubmit")
	private WebElement clickButton;
	public ViewLeadPage clickCreateleadButton()
	{
		//WebElement clickButton = locateElement("class", "smallSubmit");
		click(clickButton);
		return new ViewLeadPage();
	}
}


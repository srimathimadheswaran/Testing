package org.tem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojofbsign extends Baseclassnew {
	// non parameterized constructor
	public Pojofbsign() {

		PageFactory.initElements(driver, this);

	}
	// private WebElement

	@FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	private WebElement create;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstname;

	@FindBy(xpath= "//input[@name='lastname']")
	private WebElement secondname;

	@FindBy(xpath= "(//input[@type='text'])[4]")
	private WebElement numoremail;
	
	@FindBy(xpath= "(//input[@type='text'])[5]")
	private WebElement renumoremail;

	@FindBy(id = "password_step_input")
	private WebElement password;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement sign;

	public WebElement getCreate() {
		return create;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSecondname() {
		return secondname;
	}

	public WebElement getNumoremail() {
		return numoremail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSign() {
		return sign;
	}

}

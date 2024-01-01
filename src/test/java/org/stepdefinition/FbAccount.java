package org.stepdefinition;

import org.tem.Baseclassnew;
import org.tem.Pojofbsign;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbAccount extends Baseclassnew {

	Pojofbsign p;

	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
		launchBrowser();
		windowMaximize();

	}

	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() {
		launchUrl("https://www.facebook.com/");

	}

	@When("To click the create new acount button")
	public void to_click_the_create_new_acount_button() {

		p = new Pojofbsign();
		clickBtn(p.getCreate());

	}

	@When("TO pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box() throws InterruptedException {

		Thread.sleep(3000);
		p = new Pojofbsign();
		passText("Srimathi", p.getFirstname());

	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() throws InterruptedException {
		Thread.sleep(3000);
		p = new Pojofbsign();
		passText("Madheswaran", p.getSecondname());

	}

	@When("To pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box() {
		p = new Pojofbsign();
		passText("srimathibijili@gmail.com", p.getNumoremail());

	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		p = new Pojofbsign();
		passText("Bijili", p.getPassword());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		closeEntireBrowser();
	}

}

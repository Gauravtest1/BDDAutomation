package testcases;

import org.openqa.selenium.WebDriver;

import assertion.ValidateURL;
import cucumber.annotation.en.*;
import searchpages.Carsearch;
import src.test.base.Baseclass;

public class Steps {
	WebDriver driver;
	Carsearch car;
	
	@Given("^User is on main page$")
	public void User_is_on_main_page() throws Throwable {
		Baseclass create= new Baseclass();
		driver=create.initiatebrowser();
	    }

	@When("^User clicks on car header$")
	public void User_clicks_on_car_header() throws Throwable {
		car= new Carsearch(driver);
		car.clickonheader();
	   
	}

	@When("^User enters pickup location$")
	public void User_enters_pickup_location() throws Throwable {
	   car.picklocation(" Delhi");
	}

	@When("^User enters drop location$")
	public void User_enters_drop_location() throws Throwable {
	    car.droplocation(" Bhopal");
	}

	@When("^User click on pickup date calendar$")
	public void User_click_on_pickup_date_calendar() throws Throwable {
	   car.openpickcalander();
	}

	@When("^User choose date for pickup$")
	public void User_choose_date_for_pickup() throws Throwable {
	   car.Choosepickdate();
	}

	@When("^User choose time for pickup$")
	public void User_choose_time_for_pickup() throws Throwable {
	    car.Choosepicktime();
	}

	@When("^User click on drop date calendar$")
	public void User_click_on_drop_date_calendar() throws Throwable {
	    car.opendropcalander();
	}

	@When("^User choose date for drop$")
	public void User_choose_date_for_drop() throws Throwable {
	    car.Choosedropdate();
	}

	@When("^User choose time for drop$")
	public void User_choose_time_for_drop() throws Throwable {
	    car.Choosedroptime();
	}

	@When("^User click on search button$")
	public void User_click_on_search_button() throws Throwable {
	    car.clickonsubmit();
	}

	@Then("^User logged in successfully$")
	public void User_logged_in_successfully() throws Throwable {
		Thread.sleep(10000);
		ValidateURL val= new ValidateURL();
		val.URL(driver, "Rental Cars and Car Rentals in from Orbitz");

	}

}

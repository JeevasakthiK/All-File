package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Book_Hotel;
import com.adactin.pom.Booked_Itinerary;
import com.adactin.pom.Booking_Confirm;
import com.adactin.pom.Login_Page;
import com.adactin.pom.Search_Hotel;
import com.adactin.pom.Select_Hotel;
import com.adactin.runner.Runner_Class;
import com.base.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {
	
	public static WebDriver driver = Runner_Class.driver;
	public static Login_Page login = new Login_Page(driver);
	public static Search_Hotel search = new Search_Hotel(driver);
	public static Select_Hotel select = new Select_Hotel(driver);
	public static Book_Hotel book = new Book_Hotel(driver);
	public static Booking_Confirm confirm = new Booking_Confirm(driver);
	public static Booked_Itinerary B_It = new Booked_Itinerary(driver);
	
	@Given("User Launch The Application")
	public void user_launch_the_application() {
		url(driver, "https://adactinhotelapp.com/");

	}

	@When("User Enter The Username In The Username Field")
	public void user_enter_the_username_in_the_username_field() {
		value(login.getUsername(), "jeevasakthi2404");

	}

	@When("User Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() {
		value(login.getPassword(), "jeev@2404");

	}

	@Then("User Click The Login button and its Redirects To The Search Hotel Page")
	public void user_click_the_login_button_and_its_redirects_to_the_search_hotel_page() {
		click(login.getLogin_btn());

	}

	@When("User Select The Location In The Location Dropdown")
	public void user_select_the_location_in_the_location_dropdown() {
		//click(search.getLocation());
		select_index(search.getLocation(), 6);

	}
	@When("User Select The Hotel In The Hotels Dropdown")
	public void user_select_the_hotel_in_the_hotels_dropdown() {
		select_index(search.getHotels(),2);

	}

	@When("User Select The Room Type In The Room Type Dropdown")
	public void user_select_the_room_type_in_the_room_type_dropdown() {
		//click(search.getRoom_Type());
		select_index(search.getRoom_Type(), 2);

	}

	@When("User Select The Number Of Rooms In The Number Of Rooms Dropdown")
	public void user_select_the_number_of_rooms_in_the_number_of_rooms_dropdown() {
		//click(search.getRoom_nos());
		select_index(search.getRoom_nos(), 2);

	}

	@When("User Enter The Check In Date In The Check In Date Field")
	public void user_enter_the_check_in_date_in_the_check_in_date_field() {
		click(search.getCheck_In());
	}

	@When("User Enter The Check Out Date In The Check Out Date Field")
	public void user_enter_the_check_out_date_in_the_check_out_date_field() {
		//click(search.getCheck_out());
		click(search.getCheck_out());

	}

	@When("User Select The Adults Per Room In The Adults Per Room Dropdown")
	public void user_select_the_adults_per_room_in_the_adults_per_room_dropdown() {
		//click(search.getAdult_Room());
		select_index(search.getAdult_Room(), 2);

	}

	@When("User Select The Children Per Room In The children Per Room Dropdown")
	public void user_select_the_children_per_room_in_the_children_per_room_dropdown() {
		//click(search.getChild_Room());
		select_index(search.getChild_Room(), 2);

	}

	@Then("User Click The Search button and its Redirects To The Select Hotel Page")
	public void user_click_the_search_button_and_its_redirects_to_the_select_hotel_page() {
		click(search.getSearch_btn());

	}

	@When("User Select The Radio button In The Select Column")
	public void user_select_the_radio_button_in_the_select_column() {
		click(select.getSelect_btn());

	}

	@Then("User Click The Continue button and its Redirect To The Book A Hotel Page")
	public void user_click_the_continue_button_and_its_redirect_to_the_book_a_hotel_page() {
		click(select.getContinue_btn());
	}

	@When("User Enter The First Name In The First Name Field")
	public void user_enter_the_first_name_in_the_first_name_field() {
		value(book.getFirst_Name(), "JEEVASAKTHI");

	}

	@When("User Enter The Last Name In The Last Name Field")
	public void user_enter_the_last_name_in_the_last_name_field() {
		value(book.getLast_Name(), "K");

	}

	@When("User Enter The Billing Address In The Billing Address Field")
	public void user_enter_the_billing_address_in_the_billing_address_field() {
		value(book.getAddress(), "Chennai,TamilNadu,India");

	}

	@When("User Enter The Credit Card Number In The Credit Card No Field")
	public void user_enter_the_credit_card_number_in_the_credit_card_no_field() {
		value(book.getCc_No(), "1111222233334444");

	}

	@When("User Select The Credit Card Type In The Credit Card Type Dropdown")
	public void user_select_the_credit_card_type_in_the_credit_card_type_dropdown() {
		select_index(book.getCc_Type(), 2);
	}

	@When("User Select The Expiry Month In The Select Month Dropdown")
	public void user_select_the_expiry_month_in_the_select_month_dropdown() {
		select_text(book.getExp_Month(), "April");

	}

	@When("User Select The Expiry Year In The Select Year Dropdown")
	public void user_select_the_expiry_year_in_the_select_year_dropdown() {
		select_value(book.getExp_Year(), "2022");

	}

	@When("User Enter The CVV Number In The CVV Number Field")
	public void user_enter_the_cvv_number_in_the_cvv_number_field() {
		value(book.getCvv_No(), "1234");

	}

	@Then("User Click The Book Now button and its Redirects To The Booking Confirmation Page")
	public void user_click_the_book_now_button_and_its_redirects_to_the_booking_confirmation_page() {
		click(book.getBook_Now());

	}

	@When("User Click The My Itinerary button and its Redirects To The Booked Itinerary Page")
	public void user_click_the_my_itinerary_button_and_its_redirects_to_the_booked_itinerary_page() {
		click(confirm.getMy_Itinerary());

	}
	/*@Then("User click Search Hotel button")
	public void user_click_search_hotel_() {
		click(confirm.getSearch_Hot());

	}*/

	@When("User Select The Check Box button In The Booked Itinerary Table")
	public void user_select_the_check_box_button_in_the_booked_itinerary_table() {

	}

	@When("User Click The Cancel Selected button")
	public void user_click_the_cancel_selected_button() {

	}

	@Then("User Click The Log Out button and Its Redirects To The Logged Out Page")
	public void user_click_the_log_out_button_and_its_redirects_to_the_logged_out_page() {

	}

}

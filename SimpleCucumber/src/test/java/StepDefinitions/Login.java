package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@Given ("Enter input condition")
	public void Enter_input_condition() {
		System.out.println("Bingo1");
	}
	
	@When ("I do action")
	public void I_do_action() {
		System.out.println("Bingo2");
	}
	
	@Then ("I get Result")
	public void I_get_Result() {
		System.out.println("Bingo3");
	}
	
	@Given ("I want to write a step with {string}")
	public void I_want_to_write_step(String name) {
		System.out.println("Write a step with -->"  + name);
	}
	
	@When ("I check for the {string} in step")
	public void check_for_the_value_in_step(String value) {
		System.out.println("check for the value -->"  + value);
	}
	
	@Then ("I verify the {string} in step")
	public void verify_the_status_in_step(String status) {
		System.out.println("Verify status -->" + status);
	}

}

package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import resourses.Client;

public class CreateAccountPage {

	public AccountPage setUpaccountFor(Client client) {
		// Gender
		$(By.xpath("//input[@id='id_gender1']")).click();
		// First name
		$(By.xpath("//input[@id='customer_firstname']")).clear();
		$(By.xpath("//input[@id='customer_firstname']")).sendKeys(client.getName());
		// Last name
		$(By.xpath("//input[@id='customer_lastname']")).clear();
		$(By.xpath("//input[@id='customer_lastname']")).sendKeys(client.getSurname());
		// Password
		$(By.xpath("//input[@id='passwd']")).clear();
		$(By.xpath("//input[@id='passwd']")).sendKeys(client.getPassword());
		// DOB
		$(By.xpath("//select[@id='days']")).selectOptionByValue("1");
		$(By.xpath("//select[@id='months']")).selectOptionByValue("1");
		$(By.xpath("//select[@id='years']")).selectOptionByValue("2000");

		// Newsletter
		$(By.xpath("//input[@id='newsletter']")).click();
		// Special offers
		$(By.xpath("//input[@id='optin']")).click();

		// Address

		// First name
		$(By.xpath("//input[@id='firstname']")).clear();
		$(By.xpath("//input[@id='firstname']")).sendKeys(client.getName());
		// Last name
		$(By.xpath("//input[@id='lastname']")).clear();
		$(By.xpath("//input[@id='lastname']")).sendKeys(client.getSurname());
		// Company
		$(By.xpath("//input[@id='company']")).clear();
		$(By.xpath("//input[@id='company']")).sendKeys(client.getCompany());
		// Address
		$(By.xpath("//input[@id='address1']")).clear();
		$(By.xpath("//input[@id='address1']")).sendKeys(client.getAddress());
		// City
		$(By.xpath("//input[@id='city']")).clear();
		$(By.xpath("//input[@id='city']")).sendKeys(client.getCity());
		// State
		$(By.xpath("//select[@id='id_state']")).selectOptionContainingText(client.getState());
		// Post Code
		$(By.xpath("//input[@id='postcode']")).clear();
		$(By.xpath("//input[@id='postcode']")).sendKeys(client.getPostcode());
		// Country
		$(By.xpath("//select[@id='id_country']")).selectOption("United States");
		// Additional info
		$(By.xpath("//textarea[@id='other']")).clear();
		$(By.xpath("//textarea[@id='other']")).sendKeys("No info");
		// Home phone
		$(By.xpath("//input[@id='phone']")).clear();
		$(By.xpath("//input[@id='phone']")).sendKeys("0831234567");
		// Mobile phone
		$(By.xpath("//input[@id='phone_mobile']")).clear();
		$(By.xpath("//input[@id='phone_mobile']")).sendKeys("0831234567");
		// Alias for address
		$(By.xpath("//input[@id='alias']")).clear();
		$(By.xpath("//input[@id='alias']")).sendKeys("0831234567");

		// Submit button
		$(By.xpath("//button[@id='submitAccount']")).click();
		;

		return new AccountPage();
	}

}

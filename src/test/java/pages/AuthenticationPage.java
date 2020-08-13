package pages;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

import resourses.Client;

public class AuthenticationPage {

	public CreateAccountPage createAccountFor(Client client) {
		// TODO Auto-generated method stub
		$(By.xpath("//input[@id='email_create']")).clear();
		$(By.xpath("//input[@id='email_create']")).sendKeys(client.getEmail());;

		$(By.xpath("//button[@id='SubmitCreate']")).click();
		return new CreateAccountPage();
	}
}

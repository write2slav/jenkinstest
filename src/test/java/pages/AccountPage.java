package pages;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

public class AccountPage {
	// <title xpath="1">My account - My Store</title>

	public PersonalInformationPage goToPersonalInfo() {
		$(By.xpath("//a[@title='Information']")).click();

		return new PersonalInformationPage();
	}

}

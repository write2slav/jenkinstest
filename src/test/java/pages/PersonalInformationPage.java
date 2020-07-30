package pages;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

public class PersonalInformationPage {

	public String getName() {
		// TODO Auto-generated method stub
		return $(By.xpath("//input[@id='firstname']")).getValue();
	}

}

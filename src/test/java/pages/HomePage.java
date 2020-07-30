package pages;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

import com.codeborne.selenide.Selenide;

public class HomePage {

	public HomePage open() {
		Selenide.open("http://automationpractice.com/index.php");
		return this;

	}

	public AuthenticationPage login() {

		$(By.xpath("//a[@class='login']")).click();

		return new AuthenticationPage();
	}

}

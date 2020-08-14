package pages;

import static com.codeborne.selenide.Selectors.byXpath;
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

	public TShirtsPage goToTShirtsPage(){
		$(byXpath("//div[@id=\"block_top_menu\"]/ul[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li/a[contains(text(),'T-s')]")).click();
		return new TShirtsPage();
	}
}

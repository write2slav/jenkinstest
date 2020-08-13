package selenide_tests;

import pages.HomePage;
import pages.PersonalInformationPage;
import resourses.Client;
import selenide_base_test.BaseTest;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Login extends BaseTest {

	HomePage homePage = new HomePage();

	@Test
	public void testTrue() {

		assertTrue(true);

	}

	// @Ignore
	@Test(dataProvider = "data-test-clients")
	public void registerClient(Client client) throws InterruptedException {

		PersonalInformationPage personalInfo = homePage.open().login().createAccountFor(client).setUpaccountFor(client)
				.goToPersonalInfo();

		assertThat(personalInfo.getName(), equalTo(client.getName()));

	}

	@Ignore
	@Test(dataProvider = "data-test-clients")
	public void test(Client client) {

		System.out.println(client.getEmail());
	}

	@DataProvider(name = "data-test-clients", parallel = true)
	public Object[][] getTestClients() {
		// Create a randomly generated email
		StringBuilder sb = new StringBuilder("@gmail.com");
		sb.insert(0, Integer.toString((int) (Math.random() * 100000)));
		String email = sb.toString();

		// Creating test clients
		Client clientOne = new Client.Builder().addEmail(email).addName("Joe").addSurname("Moe")
				.addPasword("qwertytest").build();

		Client clientTwo = new Client.Builder().addEmail(email).addName("Joe").addSurname("Moe")
				.addPasword("qwertytest").build();

		return new Object[][] { { clientOne }, { clientTwo } };
	}

}

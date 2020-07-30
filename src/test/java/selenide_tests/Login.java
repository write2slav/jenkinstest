package selenide_tests;

import pages.HomePage;
import pages.PersonalInformationPage;
import selenide_base_test.BaseTest;
import test.resources.utils.Client;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Login extends BaseTest {
	

	HomePage homePage =  new HomePage();

	@Test(dataProvider = "data-test-clients")
	public void registerClient(Client client) throws InterruptedException {


		PersonalInformationPage personalInfo =  homePage
			.open()
			.login()
			.createAccountFor(client)
			.setUpaccountFor(client)
			.goToPersonalInfo();
		
		assertThat(personalInfo.getName(),equalTo(client.getName()));
		

	}

	@Test(dataProvider = "data-test-clients")
	public void test(Client client) {

		System.out.println(client.getEmail());
	}
	
	@DataProvider(name ="data-test-clients", parallel = true)
	public Object[][] getTestClients(){
		// Creating test clients
		Client clientOne = new Client.Builder()
				.addEmail("test1q@gmail.com")
				.addName("Joe")
				.addSurname("Moe")
				.addPasword("qwertytest")
				.build();
		
		Client clientTwo = new Client.Builder()
				.addEmail("test2q@gmail.com")
				.addName("Joe")
				.addSurname("Moe")
				.addPasword("qwertytest")
				.build();
		
		return new Object[][] { { clientOne }, { clientTwo} };
	}

}

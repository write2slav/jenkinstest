package test.resources.utils;

import java.sql.Date;

public class Client {

	private String name;
	private String surname;
	private String password;
	private String email;

	// Default values
	private Date dob = new Date(962021188000l);
	private String company = "Test company";
	private String address = "Test address";
	private String city = "Miami";
	private String state = "Florida";
	private String postcode = "00000";
	private String country = "United States";
	private String homePhone = "0831867893";
	private String mobilePhone = "0831867893";
	private String addressAlias = "Test";
	private String additionalInfo = "Additional Info";

	public Client(String name, String surname, String password, String email) {
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.email = email;

	}

	// Getters
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Date getDob() {
		return dob;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getCompany() {
		return company;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getCountry() {
		return country;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public String getAddressAlias() {
		return addressAlias;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	// Builder class to build clients
	public static class Builder {

		private String name;
		private String surname;
		private String password;
		private String email;

		public Builder addName(String name) {
			this.name = name;
			return this;
		}

		public Builder addSurname(String surname) {
			this.surname = surname;
			return this;
		}

		public Builder addEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder addPasword(String password) {
			this.password = password;
			return this;
		}

		public Client build() {

			return new Client(name, surname, password, email);

		}

	}

}

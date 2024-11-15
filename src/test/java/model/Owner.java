package model;

public class Owner {
	
		String firstName;
		String lastName;
		String address;
		String city;
		String telephone;

		public Owner(String firstName, String lastName, String address,
				String city, String telephone) {

			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.telephone = telephone;
		}


		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getTelephone() {
			return telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
}

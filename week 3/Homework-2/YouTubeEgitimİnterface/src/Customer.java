
public class Customer {
	//burda özellikleri yazdım
	
	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı");
	}
	
	
	
	int Id;
	String FirstName;
	String LastName;
	
	String City;

	
	
	
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	

	}



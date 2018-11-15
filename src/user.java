public class user {
	private String Name;
	private int SSN;
	private String address;
	private long phone_number;
	
	// Getters
	public String getName() {
		return Name;
	}
	
	
	public int getSSN() {
		return SSN;
	}
	
	public String getAddress() {
		return address;
	}
	
	public long getPhnNum() {
		return phone_number;
	}
	
	// Setters
	public user(String Name, int social, String address, int phone) {
		this.Name = Name;
		SSN = social;
		this.address = address;
		phone_number = phone;
		return;
	}
	
	public void setName(String Name) {
		this.Name = Name;
		return;
	}
	
	public void setSSN(int social) {
		SSN = social;
		return;
	}
	
	public void setAddress(String address) {
		this.address = address;
		return;
	}
	
	public void setPhone(int phone) {
		phone_number = phone;
		return;
	}
}

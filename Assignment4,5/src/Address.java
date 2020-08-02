public class Address {
	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + "]";
	}
	
	private String addressLine;
	private String city;
	
	public Address(String addressline, String city ) {
		this.addressLine=addressline;
		this.city=city;
		
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address() {
		super();
	}
	public String getAddressDetails() {
		String str=addressLine+" ,"+city;
		return str;
	}
	

}
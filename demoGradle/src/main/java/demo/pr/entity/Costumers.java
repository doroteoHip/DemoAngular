package demo.pr.entity;



public class Costumers  {

	 private Integer customer_id;
	 private String  customer_name;
	 private String  address;
	 private String  city;
	 private String  state;
	 private String  zip_code;
	 
	 
	 
	public Costumers() {
		super();
	}
	public Costumers(Integer customer_id, String customer_name, String address, String city, String state,String zip_code) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	@Override
	public String toString() {
		return "Costumers [customer_id=" + customer_id + ", customer_name=" + customer_name + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip_code=" + zip_code + "]";
	}
	 
	 

}

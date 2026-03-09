package klu.SpringBoot_MVC_Annotations;

public class Customer {
	String name;
	String location;
	
	
	//constructor method to get the values from the customer
	public Customer(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	// to get and set i.e,assign the values these 4 methods are created:getter and setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	//to display the information this method is created : to_string method
	@Override
	public String toString() {
		return "Customer [name=" + name + ", location=" + location + "]";
	}
	
	

}

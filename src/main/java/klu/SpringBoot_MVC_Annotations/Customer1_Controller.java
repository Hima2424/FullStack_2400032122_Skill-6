package klu.SpringBoot_MVC_Annotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Customer1_Controller {
    
	List<Customer1>Customers = new ArrayList<Customer1>();
	
	//add customer
	@PostMapping("/addCustomer")
	public String getCustomers(@RequestBody Customer1 cust)
	{
		Customers.add(cust);
		return "Customer added successfully";
	}
      //view customers
	@GetMapping("/displaycustomer")
	public List<Customer1> viewcustomer(){
		return Customers;
	}
}

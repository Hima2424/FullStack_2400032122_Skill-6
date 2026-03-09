package klu.SpringBoot_MVC_Annotations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer_Controller {
	
	@GetMapping("/customer")
	public Customer getcustomer() {
		 
		Customer c = new Customer("Chaitra","vij");
		return c;
	}

}

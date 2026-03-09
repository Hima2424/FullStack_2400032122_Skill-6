package klu.SpringBoot_MVC_Annotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody if we use this ,this method we have created in this class will retuen the statement and not the html code linked to it

public class User_html {
	
	@GetMapping("/html")
	public String gethtml()
	{
		return "index"; 
	}

}

package klu.SpringBoot_MVC_Annotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class User_restcontroller {
	@GetMapping("/d7")
	@ResponseBody
	public String display7() {
		return "controller from display7 method";
	}
	@GetMapping("/d8")
	@ResponseBody
	public String display8() {
		return "controller from display8 method";
	}

}

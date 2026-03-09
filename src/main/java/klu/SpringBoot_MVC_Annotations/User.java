package klu.SpringBoot_MVC_Annotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody // class level response body
@RequestMapping("/Contoller") // done at end level
public class User {
	
    @GetMapping("/welcome")
    //@ResponseBody
	public String display() {
		return "Welcome controller";
	}
    @GetMapping("/d1") //end point
    //@ResponseBody
    public String display1() {
    	return "Conroller from display1 method";
    }
    @GetMapping("/d2")
    //@ResponseBody
    public String display2() {
    	return "Controller from display2 method";
    }
    @GetMapping("/d3")
    public String display3() {
    	return "24";
    }
    
    
    //with parameter name  @RequestParam used for parameter name  // to pass the parameter values
    @GetMapping("/d9") // http://localhost:8567/Contoller/d9?id=24 //here ? is used to connect the request parameter and variable used in url
    public int display9(@RequestParam("id") int uid) {
    	return uid;
    	}
    @GetMapping("/d11") // http://localhost:8567/Contoller/d9?id=24 //here ? is used to connect the request parameter and variable used in url
    public int display11(@RequestParam("i") int a,@RequestParam("j") int b) {
    	return a+b;   // http://localhost:8567/Contoller/d11?i=24&j=9
    	}
    @GetMapping("/d12") // http://localhost:8567/Contoller/d9?id=24 //here ? is used to connect the request parameter and variable used in url
    public String display12(@RequestParam("n") String name) {
    	return name;   // http://localhost:8567/Contoller/d12?n=Chaitra
    	}
    //without parameter name @PathVariable used without parameter name
    @GetMapping("/d10/{eid}") // http://localhost:8567/Contoller/d10/249
    public int display10(@PathVariable("eid") int uid1 ) {
    	return uid1;
    	
    }
    
    
    
    
    
    
    @GetMapping("/d4")
    public String display4() {
    	return "Conroller from display4 method";
    }
    @GetMapping("value=/d5")
    public String display5() {
    	return "Conroller from display5 method";
    }
    @GetMapping("path=/d6") // parameter value
    public String display6() {
    	return "Conroller from display6 method";

    }
}

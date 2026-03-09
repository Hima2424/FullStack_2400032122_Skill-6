package klu.SpringBoot_MVC_Annotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class LibraryController {
	 
	@GetMapping("/welcome")
	public String show()
	{
		return "WELCOME";
	}
	@GetMapping("/count")
	public int show1()
	{
		return bookTitles.size();
	}
	@GetMapping("/price")
	public double show2()
	{
		return 520.00;
	}
	List<String> bookTitles = new ArrayList<String>();
	@PostMapping("/addbooktitle")
	public String addBookTitle(@RequestBody String title)
	{
	    bookTitles.add(title);
	    return "Book title '" + title + "' added successfully!";
	}
	@GetMapping("/books")
	public List<String> getTitles() {
	    return bookTitles;
	}
	@GetMapping("/books/{id}")
	public int show3(@PathVariable("id") int un ) {
    	return un;
	}
	@GetMapping("/search")
	 public String show4(@RequestParam("name") String n) {
	    	return n;  
	}
	@GetMapping("/author/{name}")
	public String show5(@PathVariable("authorname") String name) {
    	return name;
    }
	@PostMapping("/addbook")
	public String show6(@RequestBody String book) {
	    bookTitles.add(book);
	    return "Book added successfully";
	}
	@GetMapping("/viewbooks")
    public List<String> viewBooks() {
        return bookTitles;
    }
}
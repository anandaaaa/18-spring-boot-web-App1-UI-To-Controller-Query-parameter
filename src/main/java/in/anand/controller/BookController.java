package in.anand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
	
	@GetMapping("/book")
	@ResponseBody
	public String getBookData(@RequestParam("ISBN") String str) {
		
		String msg="The book cost "+str+" is 456.00 INS";
		
		return msg;
		
	}

}

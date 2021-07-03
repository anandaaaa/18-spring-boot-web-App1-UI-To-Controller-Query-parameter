package in.anand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/car")
public class CarController {
	
	@GetMapping("/carDetails")
	@ResponseBody
	public String getcarInfo(@RequestParam(name="carName",required=false,defaultValue="maruthi") String str){
		
		
		return "carName"+str;
		
	}
	
}

package in.anand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@GetMapping("/courseData")
	@ResponseBody
	public String getCourseDtls(String courseName,String trainee)
	{
		
		if(courseName.equalsIgnoreCase("Java")) {
		String msg="The course name"+courseName+" teached by"+trainee;
		return msg;
		}else if(courseName.equalsIgnoreCase("spring")){
			String msg="The course name"+courseName+" teached by"+trainee;
			return msg;
		}
		return "contact this no:9908009567";
		
		
	}

}

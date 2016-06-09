package irbis.springboot.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Controller
public class ExampleMVCController {
	
	@RequestMapping("/mvc")
	public String mvc(Map<String, Object> model) {
		String message = "MVC Hello World!";
		
		model.put("message", message);
		
		return "mvc-view";
	}
	
	@RequestMapping("/mvc-foo")
	public String mvcFoo(Map<String, Object> model) {
		throw new RuntimeException("MVC foo");
	}
}
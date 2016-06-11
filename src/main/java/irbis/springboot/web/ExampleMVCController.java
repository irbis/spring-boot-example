package irbis.springboot.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleMVCController {
	
	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping("/mvc")
	public String mvc(Map<String, Object> model) {
		
		model.put("message", messageSource.getMessage(
				"messages.mvc.helloworld", null, LocaleContextHolder.getLocale()));
		
		return "mvc-view";
	}
	
	@RequestMapping("/mvc-foo")
	public String mvcFoo(Map<String, Object> model) {
		throw new RuntimeException("MVC foo");
	}
}
package irbis.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@Value("${messages.helloworld}")
	private String helloWorldMessage;
	
    @RequestMapping("/")
    String home() {
        return helloWorldMessage;
    }
}

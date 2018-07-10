package io.javabrains.springbootstarter.hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String SayHai() {
		return "Hi";
	}
	@RequestMapping("/topic")
	public List<Topic> Saytopic() {
		return Arrays.asList(
				new Topic(1,"asd","21 wedd"),
				new Topic(2,"zc","22 awedd"),
				new Topic(1,"po","21 rwedd"),
				new Topic(1,"cg","21 wedd")
				
				);
	
	}
}

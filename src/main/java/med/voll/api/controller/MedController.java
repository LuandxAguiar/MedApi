package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MedController {
	
	@GetMapping
	public String ola() {
		
		return "Hello Word API String!!";
	}
	
}

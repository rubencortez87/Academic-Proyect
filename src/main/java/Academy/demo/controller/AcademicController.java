package Academy.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Academy.demo.entity.Academic;
import Academy.demo.service.AcademicService;

@RestController
@RequestMapping("/academic")
public class AcademicController {
	@Autowired
	private AcademicService service;
	@GetMapping
	public Optional<Academic> getAcademic(@RequestParam Long id){
		return service.getAcademic(id);
	}
	@PostMapping
public void AddAcademic() { 
		Academic academic = new Academic();
		academic.setAdress("adress");
		academic.setBirthDate("birthdate");
		academic.setEmail("email");
		academic.setLastName("lastName");
		academic.setPhone("phone");
		academic.setResume("resume");
		service.saveAcademic(academic);
}
}

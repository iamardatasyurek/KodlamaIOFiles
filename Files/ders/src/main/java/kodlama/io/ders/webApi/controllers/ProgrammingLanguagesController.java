package kodlama.io.ders.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.ders.business.abstracts.ProgrammingLanguageService;
import kodlama.io.ders.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.add(programmingLanguage);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody ProgrammingLanguage programmingLanguage){
		programmingLanguageService.update(programmingLanguage);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody ProgrammingLanguage programmingLanguage){
		programmingLanguageService.delete(programmingLanguage);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") int id){
		programmingLanguageService.deleteById(id);
	}
	
	@GetMapping("/find/{id}")
	public ProgrammingLanguage getProgrammingLanguageById(@PathVariable("id") int id){
		return programmingLanguageService.getProgrammingLanguageById(id);
	}
	
	@GetMapping("/all")
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguageService.getAll();
	}
	
}

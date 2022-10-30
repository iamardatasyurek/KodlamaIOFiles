package kodlama.io.ders.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.ders.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.ders.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

	private List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguageRepository() {
		this.programmingLanguages = new ArrayList<ProgrammingLanguage>();
		this.programmingLanguages.add(new ProgrammingLanguage(0, "C"));
		this.programmingLanguages.add(new ProgrammingLanguage(1, "C++"));
		this.programmingLanguages.add(new ProgrammingLanguage(2, "C#"));
		this.programmingLanguages.add(new ProgrammingLanguage(3, "Java"));
		this.programmingLanguages.add(new ProgrammingLanguage(4, "Python"));
		this.programmingLanguages.add(new ProgrammingLanguage(5, "R"));
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
		System.out.println("The programming language has been added : " + programmingLanguage.getName());
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		// Something...
		System.out.println("The programming language has been updated : " + programmingLanguage.getName());	
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.remove(programmingLanguage);
		System.out.println("The programming language has been deleted : " + programmingLanguage.getName());
	}

	@Override
	public void deleteById(int id) {
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if(programmingLanguage.getId() == id) {
				programmingLanguages.remove(programmingLanguage);
				break;
			}
		}
		System.out.println("The programming language has been deleted by Id : " + id);
	}
	
	@Override
	public ProgrammingLanguage getProgrammingLanguageById(int id) {
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if(programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		return null;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return this.programmingLanguages;
	}


}

package kodlama.io.ders.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.ders.business.abstracts.ProgrammingLanguageService;
import kodlama.io.ders.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.ders.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		if(programmingLanguage.getName() == null || programmingLanguage.getName().isBlank()){ 
			System.out.println("Name cannot be empty or null.");
			return;
		}
		
		for(ProgrammingLanguage pL : programmingLanguageRepository.getAll()) {
			if(pL.getName().equals(programmingLanguage.getName())){ 
				System.out.println("Name cannot be same. ==> "+ pL.getId() + " : " + pL.getName()+
						" --- " + programmingLanguage.getId() + " : " + programmingLanguage.getName());
				return;
			}
		}
		
		programmingLanguageRepository.add(programmingLanguage);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.update(programmingLanguage);
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.delete(programmingLanguage);
	}

	@Override
	public void deleteById(int id) {
		programmingLanguageRepository.deleteById(id);
	}
	
	@Override
	public ProgrammingLanguage getProgrammingLanguageById(int id) {
		return programmingLanguageRepository.getProgrammingLanguageById(id);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}


}

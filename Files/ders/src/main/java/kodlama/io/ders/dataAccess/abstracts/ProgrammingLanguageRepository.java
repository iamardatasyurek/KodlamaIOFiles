package kodlama.io.ders.dataAccess.abstracts;

import java.util.List;

import kodlama.io.ders.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	void add(ProgrammingLanguage programmingLanguage);
	void update(ProgrammingLanguage programmingLanguage);
	void delete(ProgrammingLanguage programmingLanguage);
	void deleteById(int id);
	ProgrammingLanguage getProgrammingLanguageById(int id);
	List<ProgrammingLanguage> getAll();
}

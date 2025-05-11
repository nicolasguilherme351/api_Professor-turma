package com.nicolas.professores_turmas.configs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.repositories.CategoryRepository;
import com.nicolas.professores_turmas.entities.Coisa;
import com.nicolas.professores_turmas.entities.Professor;
import com.nicolas.professores_turmas.entities.Turma;
import com.nicolas.professores_turmas.repository.CoisaRepository;
import com.nicolas.professores_turmas.repository.ProfessorRepository;
import com.nicolas.professores_turmas.repository.TurmaRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@Autowired
	private TurmaRepository turmaRepository;
	
	@Autowired
	private CoisaRepository coisaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
	
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);
		 */
		
		
		Professor professor1 = new Professor(null, "João Trompa", 32);
		Professor professor2 = new Professor(null, "Rosa Trinta", 28);
		Professor professor3 = new Professor(null, "Romário Trompeta", 27);
		Turma turma1 = new Turma(null, "1 - ds");
		Turma turma2 = new Turma(null, "2 - ds");
		Turma turma3 = new Turma(null, "3 - ds");
		
		professorRepository.saveAll(Arrays.asList(professor1, professor2, professor3));
		turmaRepository.saveAll(Arrays.asList(turma1, turma2, turma3));
		
		professor1.getTurmas().add(turma2);
		professor2.getTurmas().add(turma1);
		professor3.getTurmas().add(turma3);
		professor2.getTurmas().add(turma2);
		professor2.getTurmas().add(turma3);
		professor3.getTurmas().add(turma1);
		
		professorRepository.saveAll(Arrays.asList(professor1, professor2, professor3));
		
		Coisa coisa = new Coisa(null, "Nome Exemplo");
		
		
		coisaRepository.save(coisa);
	}

}

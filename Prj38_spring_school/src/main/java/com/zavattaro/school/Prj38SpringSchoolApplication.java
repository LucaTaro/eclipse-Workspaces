package com.zavattaro.school;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zavattaro.school.dal.CorsoDAO;
import com.zavattaro.school.dal.StudenteDAO;
import com.zavattaro.school.entities.Corso;
import com.zavattaro.school.entities.Studente;

@SpringBootApplication
public class Prj38SpringSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj38SpringSchoolApplication.class, args);
	}
	
	public CommandLineRunner mappingDemo(StudenteDAO sd, CorsoDAO cd) {
		return args -> {
			Studente s1 = new Studente("Padoan", 29);
			Studente s2 = new Studente("Zavattaro", 28);
			Studente s3 = new Studente("Muschio Schiavone", 27);
			
			sd.save(s1);
			sd.save(s2);
			sd.save(s3);
			
			Corso c1 = new Corso("Lingue Straniere", 10);
			Corso c2 = new Corso("Informatica Applicata", 8);
			Corso c3 = new Corso("Anatomia", 9);
			Corso c4 = new Corso("Analisi", 6);
			
			cd.saveAll(Arrays.asList(c1, c2, c3, c4));
			
			s1.getCorsi().addAll(Arrays.asList(c1));
			s2.getCorsi().addAll(Arrays.asList(c2, c4));
			s3.getCorsi().addAll(Arrays.asList(c1, c3, c4));
			
			sd.save(s1);
			sd.save(s2);
			sd.save(s3);
		};
	}

}

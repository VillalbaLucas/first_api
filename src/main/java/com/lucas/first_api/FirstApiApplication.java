package com.lucas.first_api;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lucas.first_api.Entities.Alumno;
import com.lucas.first_api.Entities.Curso;
import com.lucas.first_api.Services.AlumnoService;
import com.lucas.first_api.Services.CursoService;

@SpringBootApplication
public class FirstApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApiApplication.class, args);	
	}

	@Bean
	CommandLineRunner commandLineRunner(
		AlumnoService alumnoSer,
		CursoService cursoSer	
	){
        return args -> {
			Curso ingles = new Curso("Ingles", 40);
			Curso matematica = new Curso("Matematica", 50);

			cursoSer.save(matematica);
			cursoSer.save(ingles);

			Alumno alum1 = new Alumno( "Juan", "Gomez", 42123616, ingles );
			Alumno alum2 = new Alumno("Lucas", "Villalba", 33987455, matematica );
			Alumno alum3 = new Alumno("Juli", "Gomez", 42123555, ingles );


			alumnoSer.save(alum1);
			alumnoSer.save(alum2);
			alumnoSer.save(alum3);

			ingles.addAlumnos( alum1 );
			ingles.addAlumnos( alum3 );
			matematica.addAlumnos(alum2);

			cursoSer.save(matematica);
			cursoSer.save(ingles);
		};
	}
	
}

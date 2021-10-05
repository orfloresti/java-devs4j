package com.example.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

// import com.example.di.profiles.EnviromentService;
// import com.example.di.qualifiers.Animal;
// import com.example.di.attribute.Coche;
// import com.example.di.qualifiers.Animal;
// import com.example.di.qualifiers.Nido;
// import com.example.di.qualifiers.Avion;
// import com.example.di.qualifiers.Pajaro;
// import com.example.di.qualifiers.Perro;
// import com.example.di.scopes.EjemploScopeService;

// import com.example.di.attribute.Coche;
// import com.example.di.attribute.Motor;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Bean
	public String getApplicationName() {
		return "¡Devs4j rules!";
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class);
		
		/*
		 * String nombreAplicacion = context.getBean(String.class);
		 * log.info("Nombre aplicacion {}", nombreAplicacion);
		 */
		
		// EjemploScopeService ejemploScopeService =
		// context.getBean(EjemploScopeService.class);
		// EjemploScopeService ejemploScopeService1 =
		// context.getBean(EjemploScopeService.class);

		// log.info("Are beans equals {} ",
		// ejemploScopeService.equals(ejemploScopeService1));
		// log.info("Are beans == {} ", ejemploScopeService == ejemploScopeService1 );

		// EnviromentService environmentService =
		// context.getBean(EnviromentService.class);

		// log.info("Active enviroment", environmentService.getEnviroment() );
		// Nido nido = context.getBean(Nido.class);

		// // log.info("Animal | nombre = {}, edad = {}", nido.getNombre(),
		// nido.getEdad());

		// nido.imprimir();

		// // context.getBean("qualifier", Animal.class);
	}

}

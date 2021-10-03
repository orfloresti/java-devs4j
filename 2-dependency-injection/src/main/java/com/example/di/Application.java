package com.example.di;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// import com.example.di.qualifiers.Animal;
//import com.example.di.attribute.Coche;
// import com.example.di.qualifiers.Animal;
import com.example.di.qualifiers.Nido;
//import com.example.di.qualifiers.Avion;
//import com.example.di.qualifiers.Pajaro;
//import com.example.di.qualifiers.Perro;

// import com.example.di.attribute.Coche;
// import com.example.di.attribute.Motor;

@SpringBootApplication
public class Application {

	
	// private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Nido nido = context.getBean(Nido.class);
		// log.info("Animal | nombre = {}, edad = {}", nido.getNombre(), nido.getEdad());
		nido.imprimir();
		
		// context.getBean("qualifier", Animal.class);
	}

}

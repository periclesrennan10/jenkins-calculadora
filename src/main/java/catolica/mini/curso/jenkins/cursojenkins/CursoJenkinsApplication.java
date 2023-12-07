package catolica.mini.curso.jenkins.cursojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.swing.*;

@SpringBootApplication
public class CursoJenkinsApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder buider){
		return buider.sources(CursoJenkinsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CursoJenkinsApplication.class, args);
	}

}


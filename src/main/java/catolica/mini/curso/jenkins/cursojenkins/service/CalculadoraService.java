package catolica.mini.curso.jenkins.cursojenkins.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public String hello(){
        return "Bem Vindo ao curso de Jenkins";
    }

    public int somar(int a, int b){
        return a + b;
    }
    public int subtrair(int a, int b){
        return a - b;
    }
}

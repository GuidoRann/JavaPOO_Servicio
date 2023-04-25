package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Scanner consola = new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre");
        String nombre = consola.next();
        
        System.out.println("Ingrese la edad");
        int edad = consola.nextInt();
        
        System.out.println("Ingrese el sexo. M- Masculino, F- Femenino, O- Otro");
        String sexo = consola.next();
        
        System.out.println("Ingrese el peso");
        int peso = consola.nextInt();
        
        System.out.println("Ingrese la altura");
        double altura = consola.nextDouble();
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public boolean esMayorDeEdad(Persona per){
        return per.getEdad() > 18;
    }
    
    public int calcularIMC(Persona per){
        double IMC = per.getPeso()/(per.getAltura() * per.getAltura());
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25){
            return 0;
        } else return 1;
    }
}

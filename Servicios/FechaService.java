package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    
    public Date fechaNacimiento(){
        Scanner consola = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el dia");
        int dia = consola.nextInt();
        System.out.println("Ingrese el dia");
        int mes = consola.nextInt();
        System.out.println("Ingrese el dia");
        int anio = consola.nextInt();
        
        return new Date(anio, mes, dia);
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public void diferencia(){
        
    }
}

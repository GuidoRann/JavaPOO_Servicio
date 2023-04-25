package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {
    Scanner consola = new Scanner(System.in).useDelimiter("\n");
    
    public Raices crearRaiz(){
        System.out.print("Ingrese el valor de a >> ");
        double a = consola.nextDouble();
        System.out.print("Ingrese el valor de b >> ");
        double b = consola.nextDouble();
        System.out.print("Ingrese el valor de c >> ");
        double c = consola.nextDouble();
        
        return new Raices(a, b, c);
    }
    
    public double getDiscriminante(Raices raiz){
        return (Math.pow(raiz.getB(),2) - (4 * raiz.getA() * raiz.getC()));
    }
    
    public boolean tieneRaices(Raices raiz){
        return getDiscriminante(raiz) > 0;
    }
    
    public boolean tieneRaiz(Raices raiz){
        return getDiscriminante(raiz) == 0;
    }
    
    public void obtenerRaices(Raices raiz){
        if (tieneRaices(raiz)) {
            System.out.println((-raiz.getB() + Math.sqrt((Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC())))) / (2 * raiz.getA()));
            System.out.println((-raiz.getB() - Math.sqrt((Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC())))) / (2 * raiz.getA()));
        }
    }
    
    public void obtenerRaiz(Raices raiz){
        if (tieneRaiz(raiz)) {
            System.out.println((-raiz.getB() + Math.sqrt((Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC())))) / (2 * raiz.getA()));            
        } 
    }
    
    public void calcular(Raices raiz){
        if (tieneRaices(raiz)) {
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)){
            obtenerRaiz(raiz);
        } else System.out.println("No exist solucion");
    }
}

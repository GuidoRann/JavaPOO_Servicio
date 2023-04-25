package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    private Scanner consola = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera() {
        System.out.println("Ingrese la capacidad maxima");
        int maxima = consola.nextInt();

        System.out.println("Ingrese la cantidad actual");
        int actual = consola.nextInt();

        return new Cafetera(actual, maxima);
    }
    
    public void llenarCafetera(Cafetera cafe){
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera cafe){
        int actual = cafe.getCantidadActual();
        System.out.println("Ingrese la cantidad de cafe para la taza");
        int taza = consola.nextInt();
        
        if (taza <= actual) {
            cafe.setCantidadActual(actual - taza);
            System.out.println("La taza se llenó correctamente");
        } else if (taza > actual){
            double porc = actual * 100 / taza;
            System.out.println("No habia cafe suficiente, por lo que la taza se lleno un " + porc + "%");
            cafe.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera cafe){
        cafe.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafe){
        System.out.println("¿Cuanto cafe desea cargar?");
        int carga = consola.nextInt();
        if (cafe.getCapacidadMaxima() < (cafe.getCantidadActual() + carga)) {
            System.out.println("""
                               No se puede cargar esa cantidad!
                               La cantidad que desea cargar es mayor a la cantidad maxima permitida""");
        }else {
            cafe.setCantidadActual(cafe.getCantidadActual() + carga);
            System.out.println("Se cargó exitosamente la cafetera");
        }
        
    }
        
}
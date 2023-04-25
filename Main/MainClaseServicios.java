     package Main;

import Entidades.*;
import Servicios.*;
import java.util.Scanner;

public class MainClaseServicios {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in).useDelimiter("\n");
       
        //-------------------Ejercicio 1------------------------
        /*
        CuentaBancariaServicio banco = new CuentaBancariaServicio();
        CuentaBancaria cuenta1 = banco.crearCuenta();
        boolean valido = true;
        do {
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("""
                               1- Ingresar dinero.
                               2- Retirar dinero.
                               3- Extraccion rapida.
                               4- Consultar saldo.
                               5- Consultar datos de la cuenta.
                               6- Salir
                               """);
            var op = consola.nextInt();

            switch (op) {
                case 1:
                    banco.ingresar(cuenta1);
                    System.out.println();
                    break;
                case 2:
                    banco.retirar(cuenta1);
                    System.out.println();
                    break;
                case 3:
                    banco.extraccionRapida(cuenta1);
                    System.out.println();
                    break;
                case 4:
                    banco.consultarSaldo(cuenta1);
                    System.out.println();
                    break;
                case 5:
                    banco.consultarDatos(cuenta1);
                    System.out.println();
                    break;
                case 6:
                    valido = false;
                    System.out.println("Hasta pronto...");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcion no encontrada");;
                    System.out.println();
            }
        } while (valido);
        */
        
        //-------------------Ejercicio 2------------------------
        /*
        CafeteraServicio cafe = new CafeteraServicio();
        Cafetera cafe1 = cafe.crearCafetera();
        boolean valido = true;
        do {
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("""
                               1- Llenar cafetra.
                               2- Vaciar cafetera.
                               3- Servir taza de cafe.
                               4- Agregar cafe en la cafetera.
                               5- Salir.
                               """);
            var op = consola.nextInt();

            switch (op) {
                case 1:
                    cafe.llenarCafetera(cafe1);
                    System.out.println();
                    break;
                case 2:
                    cafe.vaciarCafetera(cafe1);
                    System.out.println();
                    break;
                case 3:
                    cafe.servirTaza(cafe1);
                    System.out.println();
                    break;
                case 4:
                    cafe.agregarCafe(cafe1);
                    System.out.println();
                    break;
                case 5:
                    valido = false;
                    System.out.println("Hasta pronto...");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcion no encontrada");;
                    System.out.println();
            }
        } while (valido);
        */
        
        //-------------------Ejercicio 3------------------------
        /*
        int[] promedioIMC = new int[4];
        boolean[] mayores = new boolean[4];
        Persona[] personas = new Persona[4];
       
        PersonaServicio per = new PersonaServicio();
        
        for (int i = 0; i < 4; i++) {
            personas[i] = per.crearPersona();
            System.out.println(personas[i].getNombre());
            promedioIMC[i] = per.calcularIMC(personas[i]);
            mayores[i] = per.esMayorDeEdad(personas[i]);
        }    
        
        int mayor = 0, menor = 0;
        for (int i = 0; i < 4; i++) {
            if (mayores[i]) {
                mayor++;
            } else menor++;
        }
        
        int sobrePeso = 0, normal = 0, debajoPeso = 0;
        for (int i = 0; i < 4; i++) {
            switch (promedioIMC[i]) {
                case -1 -> debajoPeso++;
                case 0 -> normal++;
                default -> sobrePeso++;
            }
        } 
        
        double porcMay = mayor*100/4;
        double porcMen = menor*100/4;
        
        double porcBajo = debajoPeso*100/4;
        double porcIdeal = normal*100/4;
        double porcSobre = sobrePeso*100/4;
        
        
        System.out.println("Hay " + porcMay + "% de mayores de edad y " + porcMen + "% de menores de edad");
        System.out.println();
        System.out.println(porcBajo + "% de las personas se encuentran debajo del peso ideal, " + porcIdeal + "% de las personas se encuentran en un peso ideal y " + porcSobre + "% de las personas se encuentran con sobrepeso");      
        */
        //-------------------Ejercicio Extra 1------------------------
        /*
        RaicesServicio raiz = new RaicesServicio();
        Raices r = raiz.crearRaiz();
        
        raiz.calcular(r);
        */
        
        //-------------------Ejercicio Extra 2------------------------
        /*
        NIFServicio nif = new NIFServicio();
        NIF d1 = nif.crearNIF();
        
        nif.mostrar(d1);
        */
    }
}

       
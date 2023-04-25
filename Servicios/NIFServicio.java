package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class NIFServicio {
    Scanner consola = new Scanner(System.in).useDelimiter("\n");
    
    char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
    public NIF crearNIF(){
        System.out.println("Ingrese su DNI: ");
        long dni = consola.nextLong();
        
        long res = dni%23;
        char letra = letras[(int)res];
        
        return new NIF(dni, letra);
    }
    
    public void mostrar(NIF n){
        System.out.println(n.getDni() + "-" + n.getLetra());
    }
}

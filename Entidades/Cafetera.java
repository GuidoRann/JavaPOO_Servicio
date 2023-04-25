package Entidades;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 4000;
    }

    public Cafetera(int cantidadActual, int capacidadMaxima) {
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }
    
    

    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return this.cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    
}

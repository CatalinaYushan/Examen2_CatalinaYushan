package examen2_catalinayushan;

import java.util.Scanner;
import java.util.ArrayList;

public class Conejitos {
    String nombre;
    int precio;

    ArrayList<String> Conejitos = new ArrayList<String>();
    public Conejitos(String k, int m){
        this.nombre=k;
        this.precio=m;
    }
    
    public Conejitos(){
        System.out.println("Has decidido conseguir un conejito!");
        System.out.println("Dale un nombre a tu conejito");
        System.out.println("Ingresa el nombre de tu conejito: ");
        
        System.out.println("Has adquirido una nueva vaquita!");
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}

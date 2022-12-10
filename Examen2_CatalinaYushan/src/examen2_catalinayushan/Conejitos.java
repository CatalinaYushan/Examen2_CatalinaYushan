package examen2_catalinayushan;

import java.util.Scanner;
import java.util.ArrayList;

public class Conejitos {
    String nombre;
    int precio;

    public Conejitos(String k, int m){
        this.nombre=k;
        this.precio=m;
    }
    
    public ArrayList<String> Conejitos(){
        Scanner quaxly = new Scanner(System.in);
        ArrayList<String> Conejitos = new ArrayList<String>();
        System.out.println("Has decidido conseguir un conejito!");
        System.out.println("Dale un nombre a tu conejito");
        System.out.println("Ingresa el nombre de tu conejito: ");
        nombre = quaxly.nextLine();
        Conejitos.add(nombre);
        System.out.println("Has adquirido un nuevo conejito!");
        return Conejitos;
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

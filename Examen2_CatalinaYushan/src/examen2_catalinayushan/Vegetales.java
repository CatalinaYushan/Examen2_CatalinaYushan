package examen2_catalinayushan;

import java.util.Scanner;

public class Vegetales {
    int precio;
    int cantidad;

    public Vegetales(int price, int quantity){
        this.precio=price;
        this.cantidad=quantity;
    }
    
    public Vegetales(){
        Scanner sprigattito = new Scanner (System.in);
        System.out.println("Has decidido vender tus vegetales!");
        System.out.println("Cuantos vegetales vas a vender?: ");
        int vegetables = sprigattito.nextInt();
        System.out.println("Has vendido exitosamente tus vegetales!");
    }
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}

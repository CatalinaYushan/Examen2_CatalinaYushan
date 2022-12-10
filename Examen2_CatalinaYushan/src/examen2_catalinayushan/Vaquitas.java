package examen2_catalinayushan;

import java.util.ArrayList;
import java.util.Scanner;

public class Vaquitas {
    String name;
    int price;

    
    public Vaquitas(String n, int p){
        this.name=n;
        this.price=p;
    }

    public ArrayList<String> getVaquitas (){
        Scanner fuecoco = new Scanner(System.in);
        ArrayList<String> Vaquitas = new ArrayList<String>();
        System.out.println("Has decidido conseguir un vaquita!");
        System.out.println("Dale un nombre a tu vaquita!");
        System.out.println("Ingrese el nombre de su vaquita: ");
        name = fuecoco.nextLine();
        Vaquitas.add(name);
        System.out.println("Has conseguido una nueva vaquita!");
        return Vaquitas;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}

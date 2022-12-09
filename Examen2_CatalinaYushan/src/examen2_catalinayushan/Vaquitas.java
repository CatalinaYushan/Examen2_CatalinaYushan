package examen2_catalinayushan;

import java.util.ArrayList;
import java.util.Scanner;

public class Vaquitas {
    String name;
    int price;

    ArrayList<String>Vaquitas = new ArrayList<String>();
    
    public Vaquitas(String n, int p){
        this.name=n;
        this.price=p;
    }
    
    public Vaquitas(){
        Scanner fuecoco = new Scanner(System.in);
        System.out.println("Has decidido conseguir un conejito!");
        System.out.println("Dale un nombre a tu vaquita!");
        System.out.println("Ingrese el nombre de su vaquita: ");
        String moo = fuecoco.nextLine();
        //Vaquita.add(fuecoco());
        System.out.println("Has conseguido una nueva vaquita!");
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

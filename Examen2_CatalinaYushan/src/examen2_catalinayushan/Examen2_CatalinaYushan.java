package examen2_catalinayushan;

import java.util.Scanner;
import java.util.ArrayList;

public class Examen2_CatalinaYushan {

    public static void main(String[] args) {
        Scanner quaxly = new Scanner(System.in);
        String farmname;     
        System.out.println("---Bienvenido al nuestra pequeña granja!---");
        System.out.println("Ingrese el nombre de tu granja, pequeño granjero: ");
        farmname = quaxly.nextLine();
        System.out.println("Bienvenido a: " +farmname);
        System.out.println("Qué vamos a hacer para empezar nuestra aventura?");
        System.out.println("1. Descansar");
        System.out.println("2. Plantar una cosecha");
        System.out.println("3. Cosechar nuestros cultivos");
        System.out.println("4. Comprar animalitos");
        System.out.println("5. Vender nuestro producto");
        System.out.println("6. Retiro");
        System.out.println("-------------------------");
        System.out.println("Ingrese la opcion que desea digitar: ");
        int choice = quaxly.nextInt();
        int dias = 0;
        for (int i = 0; i < 5; i++) {
            if(choice<6)
                dias++;
        }
        do {
            switch (choice) {
                case 1:
                    System.out.println("--------------------Dia" +dias+ "--------------------");
                    System.out.println("Te sentías muy cansado hoy....");
                    System.out.println("Decidiste descansar el día de hoy!");
                    System.out.println("Z..z..z..z");
                    System.out.println("-----Ha transcurrido" +dias+ " días-----");
                    break;
                case 2:
                    System.out.println("--------------------Dia" +dias+ "--------------------");
                    System.out.println("Crees que ya es hora de ensuciarte un poco las manos...");
                    System.out.println("Has decidido plantar una cosecha!");
                    System.out.println("Recuerda! Tienes que esperar cinco días antes de poder cultivar la cosecha");
                    System.out.println("-----Ha transcurrido" +dias+ " días-----");
                    break;
                case 3:
                    /*if(){
                    System.out.println("--------------------------------------");
                    System.out.println("Crees que ya es hora de ensuciarte un poco las manos...");
                    System.out.println("Has decidido cosechar tu cosecha!");
                    System.out.println("-----Ha transcurrido" +dias+ " días-----");
                    }else
                        System.out.println("");*/
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("--------------------Dia" +dias+ "--------------------");
                    System.out.println("Tu vida como granjero ha sido larga y dura...");
                    System.out.println("Has encontrado mucha felicidad durante tus dias como granjero pero, es esto todo lo que quieres en la vida?");
                    System.out.println("Decidiste que es momento de retirarte y finalmente hacer lo que siempre has deseado, lo que tu corazon siempre ha anhelado pero jamas ha tenido el valor de explorar.!");
                    System.out.println("Algo que siempre se ha cruzado en tu camino que jamás has tenido el valor de perseguir");
                    System.out.println("Ser youtuber!");
                    System.out.println("Adios, granjero! Suerte con tus sueños :,) ");
                    System.out.println("-----Transcurrieron" +dias+ " días--------------");
                    break;
                
            }
        }while(choice<5);
    }

}

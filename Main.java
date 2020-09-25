package andres_masis_poo;

import andres_masis_poo.Items;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    static LinkedList<Items> todos_objetos = new LinkedList<>();
    static Scanner in = new Scanner(System.in);

    // ARMA
    static Armas weapon = new Armas(100, "Armas", "Slider", 0, 75, 0, 0, 3, 5);

    // ARMADURA
    static Armadura armor = new Armadura(100, "Armadura", "Chaleco debil", 0, 0, 50, 0, 3, 5, "Chaleco");

    // CONSUMIBLE
    static Consumibles potion = new Consumibles(25, "Consumibles", "Pocion pequeña", 3, 0, 0, 0, 0, 0);

    // PERSONAJE
    static Personaje character = new Personaje();
    

    public static void tienda(){
        do {
            int largo = todos_objetos.size();
            for (int i = 0; i < largo; i++) {
                System.out.println(i + 1 + ". " + todos_objetos.get(i).nombre);
            }
            System.out.println("4. Salir");
            System.out.println("Cual objeto deseas ver?");
            int opcion = in.nextInt()-1;
            if (opcion == 3){
               break;
            } 

            Items objeto = todos_objetos.get(opcion);

            preview(objeto, character);
            System.out.println("¿Que deseas hacer con " + objeto.nombre);
            System.out.println("1.Comprar");
            int metodo = in.nextInt();

            switch (metodo) {
                case 1:
                    character.comprar(objeto);
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }

        } while (true);
        

    }
    
    public static void inventario(){
        do {
            character.mostrarInventario();
            System.out.println("100. Salir ");
            System.out.println("Cual objeto deseas ver?");
            int opcion = in.nextInt()-1;

            if (opcion == 99){
               break;
            } 
            Items objeto = character.inventario.get(opcion);


            System.out.println("¿Que deseas hacer con " + objeto.nombre);
            System.out.println("1.Vender");
            System.out.println("2.Equipar");
            int metodo = in.nextInt();

            switch (metodo) {
                case 1:
                    character.vender(objeto);
                    break;
                case 2:
                    character.equipar(objeto);
                default:
                    System.out.println("Opcion Invalida");
            }

        } while (true);

    }
    
    public static void equipados(){
        do {
            character.mostrarEquipados();
            System.out.println("100. Salir ");
            System.out.println("Cual objeto deseas ver?");
            int opcion = in.nextInt()-1;

            if (opcion == 99){
               break;
            } 
            Items objeto = character.objetos_equipados.get(opcion);


            System.out.println("¿Que deseas hacer con " + objeto.nombre);
            System.out.println("1.Desequipar");
            int metodo = in.nextInt();

            switch (metodo) {
                case 1:
                    character.desequipar(objeto);
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }

        } while (true);

    }
    
    public static void preview(Items objeto, Personaje character){
        System.out.println("\nPREVIEW DE: " + objeto.nombre);
        System.out.println("Ataque: " + character.ataque + " +" + objeto.ataque);
        System.out.println("Defensa: " + character.defensa + " +" + objeto.defensa);
        System.out.println("Vida: " + character.vida + " +" + objeto.vida);
        System.out.println("Velocidad: " + character.velocidad + " +" + objeto.velocidad);
        System.out.println("Esstilo: " + character.estilo + " +" + objeto.estilo);
        System.out.println("Magia: " + character.magia + " +" + objeto.magia);
    }
    
    public static void verStats(Personaje character){
        System.out.println("\nPREVIEW DE TUS STATS");
        System.out.println("Ataque: " + character.ataque);
        System.out.println("Defensa: " + character.defensa);
        System.out.println("Vida: " + character.vida);
        System.out.println("Velocidad: " + character.velocidad);
        System.out.println("Esstilo: " + character.estilo);
        System.out.println("Magia: " + character.magia);
    }

    public static void main(final String[] args) {
        todos_objetos.add(weapon);
        todos_objetos.add(armor);
        todos_objetos.add(potion);

        // Menu
        verStats(character);
        boolean bandera = true;
        do{
            System.out.println("Que quieres ver?");
            System.out.println("1.Tienda \n2.Tus objetos \n3.Objetos que tienes equipados \n4. Ver tus stats \n100.Salir");
            int opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    tienda();
                    break;
                case 2:
                    inventario();
                    break;
                case 3:
                    equipados();
                    break;
                case 4:
                    verStats(character);
                    break;
                case 100:
                    bandera =false;
                    continue;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while(bandera);

    }
}

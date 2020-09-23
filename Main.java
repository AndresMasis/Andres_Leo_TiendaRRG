package andres_masis_poo;

import andres_masis_poo.Items;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    public static void main(final String[] args) {
        LinkedList<Items> todos_objetos = new LinkedList<>();
        Scanner in = new Scanner(System.in);

        //System.out.println("------------------ITEM-----------------------");
        Items primero;
        primero = new Items(100, "Armas", "Luci");
        /*primero.getNombre();
        primero.getCategoria();
        primero.getPrecio();*/
        todos_objetos.add(primero);

        //System.out.println("-------------------ARMA----------------------");
        Armas uno;
        uno = new Armas(100, "Armas", "Slider");
        uno.setArma(95, "Espada");
        /*uno.getNombre();
        uno.getCategoria();
        uno.getPrecio();
        uno.getArma();*/
        todos_objetos.add(uno);

        //System.out.println("--------------------ARMADURA---------------------");
        Armadura dos;
        dos = new Armadura(100, "Armadura", "Chaleco debil");
        dos.setArm(56, "Hombrera");
        /*dos.getNombre();
        dos.getCategoria();
        dos.getPrecio();
        dos.getArmadura();*/
        todos_objetos.add(dos);

        //System.out.println("-------------------CONSUMIBLE----------------------");
        Consumibles tres;
        tres = new Consumibles(25, "Consumibles", "Pocion pequeña");
        tres.setCon("Pocion de vida");
        /*tres.getNombre();
        tres.getCategoria();
        tres.getPrecio();
        tres.getCon();*/
        todos_objetos.add(tres);

        //System.out.println("----------------------PERSONAJE-----------------------");
        Personaje character = new Personaje();

        int opcion_accion, opcion_objeto, cantidad_objetos;
        cantidad_objetos = todos_objetos.size();

        do {
            opcion_accion = 0;
            
            // Imprime el nombre de TODOS los objetos
            for (int i = 0; i < cantidad_objetos; i++) {
                System.out.println(i + 1 + ". " + todos_objetos.get(i).nombre);
            }

            // Interactuar con el obejto
            System.out.println("\n¿Con cual objeto deseas interactuar?");
            opcion_objeto = in.nextInt() - 1;
            
            
            
            // Validaciones
            if (opcion_objeto == 9) {
                // Salir
                opcion_accion = 6;
            } else if(opcion_objeto < 0 || opcion_objeto >= cantidad_objetos) {
               System.out.println("Opcion invalida");
               opcion_accion = 6; 
            }
            
            
            // Opciones
            while (opcion_accion != 6) {
                System.out.println("¿Que deseas hacer con " + todos_objetos.get(opcion_objeto).nombre + "?\n\n"
                        + "\n 1. Comprar"
                        + "\n 2. Vender"
                        + "\n 3. Equipar "
                        + "\n 4. Desequipar "
                        + "\n 5. Mostar invetario"
                        + "\n 6. Salir");
                opcion_accion = in.nextInt();

                switch (opcion_accion) {
                    case 1:
                        character.comprar(todos_objetos.get(opcion_objeto));
                        break;
                    case 2:
                        character.vender(todos_objetos.get(opcion_objeto));
                        break;
                    case 3:
                        character.equipar(todos_objetos.get(opcion_objeto));
                        break;
                    case 4:
                        character.desequipar(todos_objetos.get(opcion_objeto));
                        break;
                    case 5:
                        character.mostrarInventario();
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }

            }
        } while (opcion_objeto != 9);

    }
}

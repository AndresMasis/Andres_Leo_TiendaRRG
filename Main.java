package andres_masis_poo;

import andres_masis_poo.Items;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    static LinkedList<Items> todos_objetos = new LinkedList<>();
    static Scanner in = new Scanner(System.in);

    //ARREGLOS DATOS PRECIO Y REVIEWS

    DatosApi pre = new DatosApi();
    
    // ARMA

     Armas weapon0 = new Armas(pre.listPrecio[0], "Armas", "Draktharr", 0, pre.listReviews[0], 0, 0, pre.listReviews[0]/3, pre.listReviews[0]/2);
     Armas weapon1 = new Armas(pre.listPrecio[1], "Armas", "Filo", 0, pre.listReviews[1], 0, 0, pre.listReviews[1]/3, pre.listReviews[1]/2);
     Armas weapon2 = new Armas(pre.listPrecio[2], "Armas", "Youmuu", 0, pre.listReviews[2], 0, 0, pre.listReviews[2]/3, pre.listReviews[2]/2);
     Armas weapon3 = new Armas(pre.listPrecio[3], "Armas", "Statikk", 0, pre.listReviews[3], 0, 0, pre.listReviews[3]/3, pre.listReviews[3]/2);
     Armas weapon4 = new Armas(pre.listPrecio[4], "Armas", "Guinsoo", 0, pre.listReviews[4], 0, 0, pre.listReviews[4]/3, pre.listReviews[4]/2);
     Armas weapon5 = new Armas(pre.listPrecio[5], "Armas", "Espadón", 0, pre.listReviews[5], 0, 0, pre.listReviews[5]/3, pre.listReviews[5]/2);
     Armas weapon6 = new Armas(pre.listPrecio[6], "Armas", "Rabadon", 0, pre.listReviews[6], 0, 0, pre.listReviews[6]/3, pre.listReviews[6]/2);
     Armas weapon7 = new Armas(pre.listPrecio[7], "Armas", "Manamune", 0, pre.listReviews[7], 0, 0, pre.listReviews[7]/3, pre.listReviews[7]/2);
     Armas weapon8 = new Armas(pre.listPrecio[8], "Armas", "Huracán", 0, pre.listReviews[8], 0, 0, pre.listReviews[8]/3, pre.listReviews[8]/2);

    // ARMADURA

     Armadura armor0 = new Armadura(pre.listPrecio[9], "Armadura", "Cotas", 0, 0, pre.listReviews[9], 0, pre.listReviews[9]/4, pre.listReviews[9]/10, "Chaleco con espinas");
     Armadura armor1 = new Armadura(pre.listPrecio[10], "Armadura", "Warmog", 0, 0, pre.listReviews[10], 0, pre.listReviews[10]/4, pre.listReviews[10]/10, "Chaleco grueso");
     Armadura armor2 = new Armadura(pre.listPrecio[11], "Armadura", "Caperuza", 0, 0, pre.listReviews[11], 0, pre.listReviews[11]/4, pre.listReviews[11]/10, "Casco de cuero");
     Armadura armor3 = new Armadura(pre.listPrecio[12], "Armadura", "Segahuesos", 0, 0, pre.listReviews[12], 0, pre.listReviews[12]/4, pre.listReviews[12]/10, "Casco de huesos");
     Armadura armor4 = new Armadura(pre.listPrecio[13], "Armadura", "Botas", 0, 0, pre.listReviews[13], 0, pre.listReviews[13]/4, pre.listReviews[13]/10, "Botas normales");
     Armadura armor5 = new Armadura(pre.listPrecio[14], "Armadura", "Escarpe", 0, 0, pre.listReviews[14], 0, pre.listReviews[14]/4, pre.listReviews[14]/10, "Botas de acero");
     Armadura armor6 = new Armadura(pre.listPrecio[15], "Armadura", "Leeroy ", 0, 0, pre.listReviews[15], 0, pre.listReviews[15]/4, pre.listReviews[15]/10, "Pantalon");
     Armadura armor7 = new Armadura(pre.listPrecio[16], "Armadura", "Jenkins", 0, 0, pre.listReviews[16], 0, pre.listReviews[16]/4, pre.listReviews[16]/10, "Pantalon");

    // CONSUMIBLE

     Consumibles potion0 = new Consumibles(pre.listPrecio[17], "Consumibles", "Pocion pequeña", pre.listReviews[17], 0, 0, 0, 0, 0);
     Consumibles potion1 = new Consumibles(pre.listPrecio[18], "Consumibles", "Pocion mediana", pre.listReviews[18], 0, 0, 0, 0, 0);
     Consumibles potion2 = new Consumibles(pre.listPrecio[19], "Consumibles", "Pocion grande", pre.listReviews[19], 0, 0, 0, 0, 0);




    // PERSONAJE
    Personaje character = new Personaje();
    

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
        todos_objetos.add(weapon0);
        todos_objetos.add(weapon1);
        todos_objetos.add(weapon2);
        todos_objetos.add(weapon3);
        todos_objetos.add(weapon4);
        todos_objetos.add(weapon5);
        todos_objetos.add(weapon6);
        todos_objetos.add(weapon7);
        todos_objetos.add(weapon8);
        
        todos_objetos.add(armor0);
        todos_objetos.add(armor1);
        todos_objetos.add(armor2);
        todos_objetos.add(armor3);
        todos_objetos.add(armor4);
        todos_objetos.add(armor5);
        todos_objetos.add(armor6);
        todos_objetos.add(armor7);       
        
        todos_objetos.add(potion0);
        todos_objetos.add(potion1);
        todos_objetos.add(potion2);

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

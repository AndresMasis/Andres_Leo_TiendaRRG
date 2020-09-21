package andres_masis_poo;
import andres_masis_poo.Items;
import java.util.Scanner;

class Main{
    
   public static void main(final String[] args) {

        System.out.println("------------------ITEM-----------------------");
        Items primero;
        primero = new Items(100,"Armas","Luci");
        primero.getNombre();
        primero.getCategoria();
        primero.getPrecio();
        
        
        System.out.println("-------------------ARMA----------------------");
        Armas uno;
        uno = new Armas(100,"Armas","Slider");
        uno.setArma(95,"Espada");
        uno.getNombre();
        uno.getCategoria();
        uno.getPrecio();
        uno.getArma();
        
        
        System.out.println("--------------------ARMADURA---------------------");
        Armadura dos;
        dos = new Armadura(100,"Armadura","Chaleco debil");
        dos.setArm(56,"Hombrera");
        dos.getNombre();
        dos.getCategoria();
        dos.getPrecio();
        dos.getArmadura();
        
        
        
        System.out.println("-------------------CONSUMIBLE----------------------");
        Consumibles tres;
        tres = new Consumibles(25,"Consumibles","Pocion pequeña");
        tres.setCon("Pocion de vida");
        tres.getNombre();
        tres.getCategoria();
        tres.getPrecio();
        tres.getCon();
        
        
        System.out.println("-----------------------------------------");
        
        
        
        
        System.out.println("Personaje");
        Scanner in = new Scanner(System.in);
        Personaje character = new Personaje();
        
        int opcion;
        
        do {
            System.out.println("¿Que deseas hacer? \n 1. Comprar"
                    + "\n 2. Vender"
                    + "\n 3. Equipar "
                    + "\n 4. Desequipar "
                    + "\n 5. Mostar invetario"
                    + "\n 6. Salir");
            opcion = in.nextInt();
            
            if(opcion == 1){
                character.comprar(dos);
            } else if (opcion == 2){
                character.vender(dos);
            } else if (opcion == 3){
                character.equipar(dos);
            } else if (opcion == 4){
                character.desequipar(dos);
            } else if (opcion == 5){
                character.mostrarInventario();
            } else {
                System.out.println("Opcion invalida");
            }
            
        } while (opcion != 6);
        
        
    
    }
}
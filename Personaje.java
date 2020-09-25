package andres_masis_poo;
import java.util.LinkedList;

public class Personaje {

    //Atributos
    double dinero;
    String nombre;

    double vida;  //Stat
    double ataque;  //Stat
    double defensa;  //Stat
    double velocidad;  //Stat
    double estilo;  //Stat
    double magia;  //Stat
    
    LinkedList<Items> inventario = new LinkedList<>();
    LinkedList<Items> objetos_equipados = new LinkedList();
    
    
    // Constructor
    public Personaje(){
        this.dinero = 3500;
        this.nombre = "Paquito";
        this.vida = 100;
        this.ataque = 10; 
        this.defensa = 10;
        this.velocidad = 15;
        this.estilo = 5; 
        this.magia = 3;
    }


    //Metodos
    
    public void comprar(Items objeto) {
        String name = objeto.nombre;
        Double price = objeto.precio;
        
        // Se revisa si hay suficiente dinero para cubrir ese precio
        if (price > this.dinero) {
            System.out.println("No tienes suficiente dinero para comprar este objeto");

        } else {
            // Se pudo comprar
            this.dinero -= price;
            this.inventario.add(objeto);
            System.out.println("Compraste " + name);
            System.out.println("El dinero te quedo en " + this.dinero);
        }
    }


    public void vender(Items objeto) {
        String nombre = objeto.nombre;
        double precio_venta = objeto.precioVen;

        desequipar(objeto);

        this.dinero += precio_venta;
        this.inventario.remove(objeto);
        System.out.println("Vendiste " + nombre);
        System.out.println("El dinero te quedo en " + this.dinero);
    }

    
 
    public void equipar(Items objeto) {
        if (this.inventario.contains(objeto)) {
            // Se equipo
            objeto.setEquipado(true);
            this.objetos_equipados.add(objeto);
            System.out.println("Has equipado " + objeto.nombre);
            asignarStats(objeto);

        } else {
            System.out.println("No has comprado " + objeto.nombre + " \n Por lo tanto no lo puedes equipar.");
        }
    }
    
    

    public void desequipar(Items objeto) {
        if (objeto.equipado) {
            // Se desequipo
            objeto.setEquipado(false);
            this.objetos_equipados.remove(objeto);
            System.out.println("Has desequipado " + objeto.nombre);
            quitarStats(objeto);
            
        } else {
            System.out.println("No has equipado " + objeto.nombre + " \n Por lo tanto no lo puedes desequipar.");
        }
    }
    
    public void asignarStats(Items objeto){
        // Se agregan los stats
        this.ataque += objeto.ataque;
        this.defensa += objeto.defensa;
        this.vida += objeto.vida;
        this.velocidad += objeto.velocidad;
        this.estilo += objeto.estilo;
        this.magia += objeto.magia;
    }
    
    public void quitarStats(Items objeto){
        // Se restan los stats
        this.ataque -= objeto.ataque;
        this.defensa -= objeto.defensa;
        this.vida -= objeto.vida;
        this.velocidad -= objeto.velocidad;
        this.estilo -= objeto.estilo;
        this.magia -= objeto.magia;
    }

    
    public void mostrarInventario() {
        int cantidad_objetos = inventario.size();
        for (int i = 0; i < cantidad_objetos; i++) {
           System.out.println(i + 1 + ". " + inventario.get(i).nombre);
        }
    }
    
    
    public void mostrarEquipados() {
        int cantidad_objetos = this.objetos_equipados.size();
        for (int i = 0; i < cantidad_objetos; i++) {
            System.out.println(i + 1 + ". " + this.objetos_equipados.get(i).nombre);
        }
    }

}

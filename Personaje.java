
package andres_masis_poo;
import java.util.LinkedList;

public class Personaje {
    //Atributos
    float dinero = 1500;
    String nombre = "Paquito";
    
    int vida = 100;  //Stat
    int ataque = 10;  //Stat
    int defensa = 10;  //Stat
    int velocidad = 15;  //Stat
    int estilo = 5;  //Stat
    int magia = 3;  //Stat
    
    
    LinkedList inventario = new LinkedList();
    LinkedList objetos_posee = new LinkedList();
    
    
    Item objeto = new Item();
    
    //Metodos
    
    public void comprar(Item objeto){
        float precio = objeto.getPrecio();
        if (precio > this.dinero){
            System.out.println("No tienes suficiente dinero para comprar este objeto");
            
        } else {
            this.dinero -= precio;
            this.inventario.add(objeto);  
        }
    }
    
    
    public void vender(Item objeto){
        float precio_venta = objeto.getPrecioVenta();
        this.dinero += precio_venta;
        this.inventario.remove(objeto);
        
        if objeto.equipado == true{
            this.inventario.remove(objeto);
        }
        
    }
    
    
}

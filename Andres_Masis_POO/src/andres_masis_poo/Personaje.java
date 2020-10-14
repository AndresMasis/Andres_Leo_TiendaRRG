package andres_masis_poo;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Personaje {

    //Atributos
    double dinero;

    double vida;  //Stat
    double ataque;  //Stat
    double defensa;  //Stat
    double velocidad;  //Stat
    double estilo;  //Stat
    double magia;  //Stat


    // Constructor
    public Personaje() {
        this.dinero = 3500;
        this.vida = 100;
        this.ataque = 10;
        this.defensa = 10;
        this.velocidad = 15;
        this.estilo = 5;
        this.magia = 3;
    }

    //Metodos
    
    // Comprar
    public void comprar(Items objeto, String procedencia) {
        //Restricciones
        if (objeto == null) {
            // No se ha seleccionado ningun objeto
            JOptionPane.showMessageDialog(null, "ERROR"
                    + "\nNo has seleccionado ningun objeto.");

        } else if (procedencia != "tienda") {
            // Se selecciono un objeto del inventario y no la tienda
            JOptionPane.showMessageDialog(null, "ERROR"
                    + "\nHas seleccionado un elemento del INVENTARIO"
                    + "\nPara comprar debes seleccionar un objeto de TIENDA");

            
        } else {
            // Entrada valida
            Double price = objeto.precio;

            // Se revisa si hay suficiente dinero para cubrir ese precio
            if (price > this.dinero) {
                // No hay suficiente dinero
                JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para comprar este objeto");

            } else {
                // Se pudo comprar
                this.dinero -= price;
                objeto.cantidad_posee += 1;              
            }
        }
    }

    
    
    // Vender
    public void vender(Items objeto, String procedencia) {
        //Restricciones
        if (objeto == null || objeto.cantidad_posee == 0) {
            // No se ha seleccionado ningun objeto o ya no se posee
            JOptionPane.showMessageDialog(null, "ERROR"
                    + "\nNo has seleccionado ningun objeto.");

        } else if (procedencia != "inventario") {
            // Se selecciono un objeto de la tienda y no inventario
            JOptionPane.showMessageDialog(null, "ERROR"
                    + "\nHas seleccionado un elemento de TIENDA"
                    + "\nPara vender debes seleccionar un objeto INVENTARIO");

        } else {

            double precio_venta = objeto.precioVen;
            this.dinero += precio_venta;
            objeto.cantidad_posee -= 1;
            
            if (objeto.cantidad_posee == 0 && objeto.equipado){
                // Si ya no tiene el objeto entonces se desequipa
                desequipar(objeto, procedencia);
            }
        }
    }
    
    

    // Equipar
    public void equipar(Items objeto, String procedencia) {
        // Restricciones
<<<<<<< Updated upstream
        if (objeto == null || objeto.cantidad_posee == 0) {
=======
    if (objeto == null) {
>>>>>>> Stashed changes
            // No se ha seleccionado ningun objeto o ya no se posee
            JOptionPane.showMessageDialog(null, "ERROR"
                    + "\nNo has seleccionado ningun objeto.");

        } else if (procedencia != "inventario") {
            // Se selecciono desde tienda
            this.comprar(objeto, "tienda");
            this.equipar(objeto, "inventario");
            
        } else if(objeto.categoria.equals("Consumibles")){
            // Los consumibles no se pueden equipar 
            JOptionPane.showMessageDialog(null, "ERROR"
                    + "\nLos consumibles no se pueden equipar.");

        } else if(objeto.equipado){
            // Ya tiene equipado ese objeto
            JOptionPane.showMessageDialog(null, "ERROR"
                    + "\nYa tienes equipado ese objeto");

        } else {
            // Valido, se equipo
            objeto.setEquipado(true);
            asignarStats(objeto);
        }
    }

    
    
    // Desequipar
    public void desequipar(Items objeto, String procedencia) {
        // Restricciones
        if (objeto == null || objeto.cantidad_posee == 0) {
            // No se ha seleccionado ningun objeto o ya no se posee
            JOptionPane.showMessageDialog(null, "ERROR"
                    + "\nNo has seleccionado ningun objeto.");

        } else if (procedencia != "inventario") {
            // Se selecciono desde tienda
            JOptionPane.showMessageDialog(null, "ERROR"
                    + "\nSeleccionaste un objeto de la TIENDA"
                    + "\nPara desequipar debes seleccionar un objeto del INVENTARIO");
            
        } else if (objeto.equipado == false) {
            // No esta equipado
            JOptionPane.showMessageDialog(null, "ERROR"
                    + "\nNo tienes equipado este objeto"
                    + "\nPor lo tanto no lo puedes desequipar");

        } else {
            // Valido, se desequipo
            objeto.setEquipado(false);
            quitarStats(objeto);
        }
    }

    
    
    // Asignar stats
    public void asignarStats(Items objeto) {
        // Se agregan los stats
        this.ataque += objeto.ataque;
        this.defensa += objeto.defensa;
        this.vida += objeto.vida;
        this.velocidad += objeto.velocidad;
        this.estilo += objeto.estilo;
        this.magia += objeto.magia;
    }

    
    
    // Quitar stats
    public void quitarStats(Items objeto) {
        // Se restan los stats
        this.ataque -= objeto.ataque;
        this.defensa -= objeto.defensa;
        this.vida -= objeto.vida;
        this.velocidad -= objeto.velocidad;
        this.estilo -= objeto.estilo;
        this.magia -= objeto.magia;
    }

}

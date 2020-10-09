package andres_masis_poo;

public class Items {

    // Atributos
    double precio;
    String categoria;
    String nombre;
    double precioVen;
    boolean equipado;
    int cantidad_posee;

    
    double vida;  //Stat
    double ataque;  //Stat
    double defensa;  //Stat
    double velocidad;  //Stat
    double estilo;  //Stat
    double magia;  //Stat
    
    

    public Items(final double precio, final String categoria, final String nombre,
            final double vida, final double ataque, final double defensa, final double velocidad,
            final double estilo, final double magia) {
        
  
        this.precio = precio;
        this.categoria = categoria;
        this.nombre = nombre;
        this.precioVen = precio * 0.65;
        this.equipado = false;
        
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.estilo = estilo;
        this. magia = magia;
        this.cantidad_posee = 0;
    }


    public void setEquipado(boolean equipado) {
        this.equipado = equipado;
    }
}





class Armas extends Items { // atributo opcional durabilidad

    public Armas(final double precio, final String categoria, final String nombre,
            final double vida, final double ataque, final double defensa, final double velocidad,
            final double estilo, final double magia) {
        
        super(precio, categoria, nombre, vida, ataque, defensa, velocidad, estilo, magia);
    }

}



class Armadura extends Items { // atributo opcional durabilidad
    String tipo_armadura;
    
    public Armadura(final double precio, final String categoria, final String nombre,
            final double vida, final double ataque, final double defensa, final double velocidad,
            final double estilo, final double magia, final String tipo_armadura) {
        
        super(precio, categoria, nombre, vida, ataque, defensa, velocidad, estilo, magia);
        this.tipo_armadura = tipo_armadura;
    }
}

class Consumibles extends Items { // atributo opcional cantidad

    public Consumibles(final double precio, final String categoria, final String nombre,
            final double vida, final double ataque, final double defensa, final double velocidad,
            final double estilo, final double magia) {
        
        super(precio, categoria, nombre, vida, ataque, defensa, velocidad, estilo, magia);
    }
    
}

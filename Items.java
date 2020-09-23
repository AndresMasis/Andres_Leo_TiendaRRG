package andres_masis_poo;

public class Items {

    double precio;
    String categoria;
    String nombre;
    double precioVen;

    public Items(final double precio, final String categoria, final String nombre) {
        this.precio = precio;
        this.categoria = categoria;
        this.nombre = nombre;
        this.precioVen = precio * 0.65;
    }

    public void asignarStats() { // lo activa el metodo equipar de la clase personaje
        final double lol;
    }

    public void quitarStats() { // lo activa el metodo equipar de la clase personaje
        final double lol;
    }

    public String getNombre() {
        System.out.println("Nombre: " + this.nombre);
        return this.nombre;
    }

    public void getCategoria() {
        System.out.println("Categoria: " + this.categoria);
    }

    public void getPrecio() {
        System.out.println("Precio: " + this.precio);
    }

    public void setItems(final double precio, final String categoria, final String nombre) {
        this.precio = precio;
        this.categoria = categoria;
        this.nombre = nombre;
    }
}

class Armas extends Items { // atributo opcional durabilidad

    public Armas(final double precio, final String categoria, final String nombre) {
        super(precio, categoria, nombre);
    }

    double daño;
    String tipoArma;

    public void setArma(final double daño, final String tipoArma) {
        this.daño = daño;
        this.tipoArma = tipoArma;
    }

    public void getArma() {
        System.out.println("Daño: " + this.daño);
        System.out.println("Tipo: " + this.tipoArma);
    }

}

class Armadura extends Items { // atributo opcional durabilidad

    public Armadura(final double precio, final String categoria, final String nombre) {
        super(precio, categoria, nombre);
    }

    double defensa;
    String tipoArma;

    public void setArm(final double defensa, final String tipoArma) {
        this.defensa = defensa;
        this.tipoArma = tipoArma;
    }

    public void getArmadura() {
        System.out.println("Defensa: " + this.defensa);
        System.out.println("Tipo: " + this.tipoArma);
        System.out.println("Tipo: " + this.precioVen);
    }

}

class Consumibles extends Items { // atributo opcional cantidad

    public Consumibles(final double precio, final String categoria, final String nombre) {
        super(precio, categoria, nombre);
    }

    String tipoConsu;

    public void setCon(final String tipoConsu) {
        this.tipoConsu = tipoConsu;
    }

    public void getCon() {
        System.out.println("Tipo: " + this.tipoConsu);
    }
}

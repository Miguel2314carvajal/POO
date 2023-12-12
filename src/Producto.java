
public class Producto {
    //Atributos
    private String nombre;
    double precio;

    public int cantidad;

    public Producto() {
        this.nombre = "Vacio";
    }
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;

    }
    public Producto(String nombre,double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public void imprimir(){
        System.out.print("Mi nombre es: " + nombre +  "     Precio: " + precio);
    }

    public void imprimir (String nombre,double precio,int cantidad){
        System.out.print("Nombre: " + nombre +  "    Precio: " + precio + "    Cantidad: " + cantidad);
    }

    public static void main (String [] args){
        Producto producto1 = new Producto();
        Producto producto2 = new Producto("Miguel",15.9);
        Producto producto3 = new Producto();
        System.out.println("Producto sin parametros");
        producto2.imprimir();
        System.out.println("\nProducto con dos parametros");
        producto2.imprimir();
        System.out.println("\nProducto con tres parametros");
        producto3.imprimir("Freddy",70.5,15);
    }
}
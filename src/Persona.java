public class Persona {
    //atributos
    public int cedula;
    public String nombre;
    public int edad;

    public Persona (int cedula,String nombre, int edad){
        //Metodo constructor
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void main(String [] args){
        //Funcion principal (Creacion de objetos)
        Persona persona1 = new Persona(1726864000,"Miguel",20);
        System.out.println("La cedula es: "+ persona1.cedula);
        System.out.println("El nombre es: "+ persona1.nombre);
        System.out.println("La edad es: "+ persona1.edad);
        Persona persona2 = new Persona(1711223394,"Deisy",53);
        System.out.println("La cedula es: "+ persona2.cedula);
        System.out.println("El nombre es: "+ persona2.nombre);
        System.out.println("La edad es: "+ persona2.edad);
        Persona persona3 = new Persona(1718585019,"Ana",30);
        System.out.println("La cedula es: "+ persona3.cedula);
        System.out.println("El nombre es: "+ persona3.nombre);
        System.out.println("La edad es: "+ persona3.edad);

    }
}

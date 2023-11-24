public class Estudiantes {
    //Atributos

    public  String nombre;
    public   int edad;

    public   Estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public  void saludar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }


    public static void main(String[] args) {
        Estudiantes estudiante_desarrollo = new Estudiantes("Miguel", 20);
        estudiante_desarrollo.saludar();
        Estudiantes estudiante_redes = new Estudiantes("Shamira",21 );
        estudiante_redes.saludar();

    }
}


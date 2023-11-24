public class Estudiantes2 {
    //Atributos

    private String nombre;
    private int edad;

    private Estudiantes2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    private void saludar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }


    public static void main(String[] args) {
        Estudiantes2 estudiante_desarrollo = new Estudiantes2("Miguel", 20);
        estudiante_desarrollo.saludar();


    }
}

public class Usuario {
    private String Nombre;
    private String Apellido;


    public String getNombre(){
        return Nombre;
    }
    public String getApellido(){
        return Apellido;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }
    public void Tilines(){
        System.out.println("Nombre: " +  getNombre() + " Apellido: " + getApellido());
    }
    public static void main(String [] args){
        System.out.println("Datos Iniciales");
        Usuario persona1 = new Usuario();
        persona1.setNombre("Freddy");
        persona1.setApellido("Villacicencio");
        persona1.Tilines();
        System.out.println("Datos Cambiados");
        persona1.setNombre("Miguel");
        persona1.setApellido("Carvajal");
        persona1.Tilines();
    }
}

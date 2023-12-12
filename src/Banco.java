public class Banco {
    public int Cedula;
    public String Nombre;

    public Banco (int Cedula,String Nombre){
        this.Cedula = Cedula;
        this.Nombre = Nombre;
    }

    public static void Registro_Usuario(){
        System.out.println("Datos Personales");
    }

    public void R_Cuenta_Bancaria(){
        System.out.println("Cuenta Registrada con exito");
        System.out.println("Cédula: " + Cedula);
        System.out.println("Nombre: " + Nombre);
    }

    public static void main(String [] args){
        Registro_Usuario();
        Banco Usuario1 = new Banco(1726864000,"Miguel");
        Usuario1.R_Cuenta_Bancaria();
    }
}

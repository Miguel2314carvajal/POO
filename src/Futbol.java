public class Futbol {
    //Atributos
    public String Equipo;
    public int Jugadores;

    public Futbol(String Equipo, int Jugadores) {
        this.Equipo = Equipo;
        this.Jugadores = Jugadores;
    }

    public static void Correr() {
        System.out.println("Recorrido 200 metros");
    }

    public static void main(String [] args){
        Correr();
    }
}

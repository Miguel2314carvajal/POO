public class Juegos {
    //Atributos
    public String titulo;
    public int fundacion;
    public String tipo;
    public String plataforma;

    public Juegos(String titulo,int fundacion,String tipo,String plataforma){
        //metodo constructor
        this.titulo = titulo;
        this.fundacion = fundacion;
        this.tipo = tipo;
        this.plataforma = plataforma;
    }

    public void saludar(){
        //metodos
        System.out.println("Bienvenido, a continuacion se le mostrara informacion sobre algunos juegos");
    }

    public void multijugadorF(){
        //metodos
        System.out.println("La cantidad de jugadores para Fortnite es 100\n" );
    }
    public void multijugadorC(){
        //metodos
        System.out.println("La cantidad de jugadores para Call of duty es 100 en multijugador\n" );
    }
    public void multijugadorL(){
        //metodos
        System.out.println("La cantidad de jugadores para League of Legends es 10\n" );
    }


    public static void main(String[] args){
        //Funcion principal (Creacion de los objetos)
        Juegos juego1 = new Juegos("Fortnite",2017,"Battle Royale","Play Station 4");
        juego1.saludar();
        System.out.println("Titulo: "+ juego1.titulo);
        System.out.println("Fundacion: "+ juego1.fundacion);
        System.out.println("Tipo: " + juego1.tipo);
        System.out.println("Plataforma: " + juego1.plataforma);
        juego1.multijugadorF();

        Juegos juego2 = new Juegos("Call of duty",2003,"Multijugador","PC");
        juego2.saludar();
        System.out.println("Titulo: "+ juego2.titulo);
        System.out.println("Fundacion: "+ juego2.fundacion);
        System.out.println("Tipo: " + juego2.tipo);
        System.out.println("Plataforma: " + juego2.plataforma);
        juego2.multijugadorC();

        Juegos juego3 = new Juegos("League of Legends",2009,"MOBA","PC ");
        juego3.saludar();
        System.out.println("Titulo: "+ juego3.titulo);
        System.out.println("Fundacion: "+ juego3.fundacion);
        System.out.println("Tipo: " + juego3.tipo);
        System.out.println("Plataforma: " + juego3.plataforma);
        juego3.multijugadorL();
    }

}

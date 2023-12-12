public class Carros {
    public String Modelo;
    public String Marca;
    public String Color;

    public Carros(String Modelo,String Marca,String Color){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
    }

    public String getModelo(){
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void Datos(){
        System.out.println("Modelo: " + getModelo() + " " + "Marca: "+ getMarca() + " " + "Color: "+ getColor());
    }
    public static void main(String[]args){

        System.out.println("Bienvenido al local de carros de miguelito");
        Carros auto1 = new Carros("Deportivo","Kia","Rojo");
        Carros auto2 = new Carros("Familiar","Nissan","Azul");
        System.out.println("Valores originales");
        auto1.Datos();
        auto2.Datos();

        System.out.println("Valores cambiados");
        auto1.setModelo("Casual");
        auto1.setColor("Blanco");
        auto1.setMarca("Mustang");
        auto1.Datos();

    }
}

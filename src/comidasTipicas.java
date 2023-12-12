public class comidasTipicas {
    //Atributos

    public String comida;

    public double precio;
    public String locacion;

    public  comidasTipicas(String comida,double precio,String locacion){
        this.comida = comida;
        this.precio = precio;
        this.locacion = locacion;
    }

    public static void main(String[]args){
        System.out.println("Bienvenido al restaurante de comida el Migueliño\n");

        comidasTipicas plato1 = new comidasTipicas("Encebollado",3.50,"Guayaquil");
        System.out.println("Comida: "+ plato1.comida);
        System.out.println("Precio: "+ plato1.precio);
        System.out.println("Locación: "+ plato1.locacion);

        comidasTipicas plato2 = new comidasTipicas("Locro de papas",4.50,"Sierra");
        System.out.println("\nComida: "+ plato2.comida);
        System.out.println("Precio: "+ plato2.precio);
        System.out.println("Locación: "+ plato2.locacion);

        comidasTipicas plato3 = new comidasTipicas("Hornado",5.50,"Oriente");
        System.out.println("\nComida: "+ plato3.comida);
        System.out.println("Precio: "+ plato3.precio);
        System.out.println("Locación: "+ plato3.locacion);

        comidasTipicas plato4 = new comidasTipicas("Chantacuros(Gusanos)",1.50,"Amazonia");
        System.out.println("\nComida: "+ plato4.comida);
        System.out.println("Precio: "+ plato4.precio);
        System.out.println("Locación: "+ plato4.locacion);

    }
}

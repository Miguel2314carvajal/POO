public class OperacionesMatematicas {
    public int num1;
    public int num2;
    public int num3;
    public double num4;
    public double num5;
    public int resultado_final;
    public double resultado_final2;

    public OperacionesMatematicas() {
    }

    public OperacionesMatematicas(int num1, int num2, int num3, int resultado_final) {
        this.num1=num1;
        this.num2=num1;
        this.num3=num3;
        this.resultado_final = resultado_final;
    }
    public OperacionesMatematicas(double num4,double num5) {
        this.num4=num4;
        this.num5=num5;
    }
    public void suma(int num1,int num2){

        resultado_final=num1+num2;
        System.out.println("la suma es igual a :"+resultado_final);
    }
    public void suma(int num1,int num2,int num3){

        resultado_final=num1+num2+num3+5;
        System.out.println("la suma es igual a :"+resultado_final);
    }
    public void suma(double num4,double num5){
        resultado_final2=num4+num5+2;
        System.out.println("la suma es igual a :"+resultado_final2);
    }
    public static void main(String[]args){
        OperacionesMatematicas suma1=new OperacionesMatematicas();
        suma1.suma(2,2);
        OperacionesMatematicas suma2=new OperacionesMatematicas();
        suma2.suma(5,5);
        OperacionesMatematicas suma3=new OperacionesMatematicas();
        suma3.suma(1.5,2.5);
    }
}

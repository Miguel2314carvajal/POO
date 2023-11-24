public class Mt {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 10;

        int cont = 0;
        while (num1 <= num2) {
            cont += 1;
            System.out.println(num1++);
        }

        System.out.println("El total de numeros es: ");
        System.out.println(cont);
    }
}
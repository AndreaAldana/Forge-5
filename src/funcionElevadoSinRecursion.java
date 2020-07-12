import java.util.Scanner;

public class funcionElevadoSinRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = sc.nextInt();

        System.out.println(elevadoIterado(num1, num2));

    }

    static public int elevadoIterado(int num1, int num2) {

        int resultado = 1;
        for (int i = 1; i <= num2; i++) {
            resultado *= num1;

        }
        return resultado;
    }
}

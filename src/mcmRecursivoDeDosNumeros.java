import java.util.Scanner;

public class mcmRecursivoDeDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese segundo número");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(mcm(num1, num2));
        } else {
            System.out.println(mcm(num2,num1));
        }

    }

    static public int mcm(int num1, int num2) {

        if (num2 == 0) {
            return num1;
        } else {
            return mcm(num2, num1 % num2);
        }
    }
}

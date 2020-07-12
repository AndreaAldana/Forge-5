import java.util.Scanner;

public class funcionSumaDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = sc.nextInt();
        System.out.println(suma(num1,num2));
    }
    static public int suma (int num1, int num2){
        return num1+num2;
    }
}

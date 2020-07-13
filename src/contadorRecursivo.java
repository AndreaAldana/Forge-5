import java.util.Scanner;

public class contadorRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número de inicio");
        int num1 = sc.nextInt();
        System.out.println("Ingrese número final");
        int num2 = sc.nextInt();
if(num1<num2){
        System.out.println(num2-- + contar(num1, num2));

    }
else{
    System.out.println(num1-- + contar(num2,num1));
}

}

    static public int contar(int num1, int num2) {
        int contador = 0;

        if (num2==num1) {
            return 0;
            }
        else if (num1<num2){
            System.out.println(num2-- + contar(num1,num2));
        }
        else{
            System.exit(-1);
        }
        return 0;

        }
    }

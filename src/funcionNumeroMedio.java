import java.util.Scanner;

public class funcionNumeroMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese segundo número");
        int num2 = sc.nextInt();
        System.out.println("Ingrese tercer número");
        int num3 = sc.nextInt();

        System.out.println(numeroMedio(num1, num2, num3));


    }
    static public int numeroMedio (int num1, int num2, int num3){

        if(num1 > num2){
            if(num1 < num3){
                return num1;
            }
        }
        if(num2 > num1){
            if(num2 < num3){
                return num2;
            }
            else{
                return num3;
            }
        }
        return 0;
    }
}

import java.util.Scanner;

public class ejercicioRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número");
        int a = sc.nextInt();

        System.out.println(a*factorialRecursiva(a-1));

    }

    static public int factorialRecursiva(int num){
        int counter;
        if(num==0){
            return 1;
        }else{
            counter= num*factorialRecursiva(num-1);
            System.out.println(counter);
        }
        return counter;
    }
}

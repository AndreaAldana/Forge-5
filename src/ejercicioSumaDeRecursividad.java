import java.util.Scanner;

public class ejercicioSumaDeRecursividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número y yo contaré hasta él");
        int num = sc.nextInt();


        System.out.println(num+sumaRecursiva(num-1));

    }
    public static int sumaRecursiva(int num) {
        int counter;


        if(num==0){
            return 0;
        }
        else{
            counter = num+sumaRecursiva(num-1);
            System.out.println(counter);
        }

        return 0;
    }
}

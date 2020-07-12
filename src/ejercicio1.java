import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num = sc.nextInt();

        System.out.println(cuenta(num));



    }
    static public int cuenta (int num){
        int counter = 0;

        for(int i= 0; i<=num;i++){
            counter +=1;
            System.out.println(counter);
            if(counter == num){
                break;
            }
        }
        return 0;
    }
}

import java.util.Scanner;

public class bucleAnidado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumPar = 0;

        while(true){
            System.out.println("Ingrese número");
            int num = sc.nextInt();

            if(num%2==0){
                sumPar+=num;
            }
            else{
                System.out.println(sumPar);
                break;
            }

        }


    }
}

import java.util.Scanner;

public class funcionRecursivaConSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = sc.nextInt();
        int sum =num1+num2;

        if(sum<100){

        System.out.println(sumaLimite(num1,num2));}
        else{
            System.exit(-1);
        }


    }
    static public int sumaLimite(int num1, int num2){
        int suma=num1+num2;
        if(suma==100){
            return 0;
        }else{
            return suma+sumaLimite(num1+num2,num1+num2);
        }

    }
}

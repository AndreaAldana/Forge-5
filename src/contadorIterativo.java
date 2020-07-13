import java.util.Scanner;

public class contadorIterativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número de inicio");
        int num1 = sc.nextInt();
        System.out.println("Ingrese número final");
        int num2 = sc.nextInt();

        System.out.println(contar(num1,num2));


    }

    static public int contar(int num1, int num2) {

            for(int i = 0; i <=num1; i++){
                if(num1>num2) {
                    num2++;
                    System.out.println(num2);
                }else{
                        num1++;
                        System.out.println(num1);
                }
                if(num2==num1){
                    System.exit(-1);
                }
            }


        return 1;
    }

    private static boolean num2esMayor(int num1, int num2) {
        return num2>num1;
    }

    static public boolean num1esMayor(int num1, int num2){
        return num1 > num2;
    }
}

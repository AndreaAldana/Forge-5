import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int a = sc.nextInt();
        System.out.println("Ingrese otro número");
        int b = sc.nextInt();

        System.out.println(cambiarLugar(a,b));


    }

    static public String cambiarLugar(int num1, int num2){
        int aux = num1;
        int aux2 = num2;

        String a = "Ahora num1 es " + aux2 +", ahora num2 es "+ aux;;

       if(num1!=num2) {

           return a;
       }
        else{
            System.exit(-1);
        }
        return "fin";
    }
}

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = sc.nextInt();

        System.out.println(cuentaRecursiva(num));


    }

    static public int cuentaRecursiva(int num) {
        int counter = 0;
        if (num == 0) {
            System.exit(-1);
        }
        if (counter <= num) {
            counter+= num;
            System.out.println(counter);
          return cuentaRecursiva(num-1);
            }
        return 0;
        }
    }



import java.util.Scanner;

public class funciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0.0;
        double cuenta = 0;


        while (true) {
            System.out.println("Ingrese una nota");
            double n = Double.parseDouble(sc.nextLine());

            if (esValida(n)) {
                suma += n;
                cuenta++;

            } else {
                break;
            }
        }
        System.out.println("El promedio es : " + (suma / cuenta));
    }

    private static boolean esValida(double n) {
        return n >= 1 && n <= 7;
    }
}

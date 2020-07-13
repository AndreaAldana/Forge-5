import java.util.Scanner;

public class funcionVuelto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca monto a pagar");
        int total = sc.nextInt();
        System.out.println("Introduzca pago");
        int pago = sc.nextInt();

        System.out.println(vuelto(total, pago));
        System.out.println("¡Hasta luego, vuelva pronto!");



    }

    static public String vuelto(int total, int pago){
        int veinte = 0;
        int diez = 0;
        int cincoMil = 0;
        int dosMil = 0;
        int mil = 0;
        int cambio = pago - total;

        while(true){
        if(cambio-20000 >= 0){
            veinte ++;
            cambio -= 20000;
        }
        else if (cambio - 10000 >= 0){
            diez++;
            cambio-=10000;
        }
        else if (cambio - 5000>=0){
            cincoMil++;
            cambio-=5000;
        }
        else if (cambio - 2000>=0){
            dosMil++;
            cambio -=2000;
        }
        else if (cambio - 1000>=0){
            mil++;
            cambio -= 1000;
        }
        else{
            break;
            }
        }

        return veinte + " billetes de 20000, \n"+
                diez + " billetes de 10000, \n" +
                cincoMil + " billetes de 5000,\n" +
                dosMil + " billetes de 2000, \n"+
                mil + " billetes de 1000";
    }
}

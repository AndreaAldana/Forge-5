import java.util.Scanner;

public class funcionCambio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dia");
        int dia = sc.nextInt();
        System.out.println("mes");
        int mes = sc.nextInt();
        System.out.println("año");
        int anho = sc.nextInt();

        dia = Integer.parseInt(dia + " - ");
        mes = Integer.parseInt(mes + " - ");
        anho = Integer.parseInt(" " + anho);
        if (dia == 31 && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) {

            System.out.println((1) + " - " + (mes + 1) + " " + anho);
        } else if (dia == 31 && mes == 12) {
            System.out.println(1 + " - " + 1 + (anho + 1));
        }
        else{
            System.out.println((dia+1) + " - " + mes + " - " + anho);
        }

        if (dia == 30 && mes == 4 && mes == 6 && mes == 9 && mes == 11) {
            System.out.println((1) + " - " + (mes+1) + " - " + anho);

        } else{
            System.out.println((dia+1) + " - " + mes + " - " + anho);
        }

        if(dia == 28 && mes == 2){
            System.out.println(1 + " - " + (mes+1) + " - " + anho);
        }else{
            System.out.println((dia+1 + " - " + mes + " - " + anho));
        }

    }
}

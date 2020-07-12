import java.util.Scanner;

public class fechasEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese día");
        int dia = sc.nextInt();
        System.out.println("Ingrese mes");
        int mes = sc.nextInt();
        System.out.println("Ingrese año");
        int anho = sc.nextInt();

        System.out.println(fecha(dia, mes, anho));


    }

    static public String fecha(int dia, int mes, int anho) {
        int diaSgte = dia;
        int mesSgte = mes;
        int anhoSgte = anho;

        if (diaSgte == 31) {
            if(tiene31dias(mes)){
                return 1 + " - " + (mesSgte + 1) + " - " + anhoSgte;
            }
            else if (diaSgte == 31 && mes == 12) {
                return 1 + " - " + 1 + " - " + (anhoSgte + 1);

            }

        }
        else if (dia!=31) {
            if(tiene31dias(mes)){
            return (diaSgte + 1) + " - " + mesSgte + " - " + anhoSgte;
        }}

        if (dia == 30) {
            if(tiene30dias(mes)){
                return 1 + " - " + (mesSgte + 1) + " - " + anhoSgte;

            }

        } else if (diaSgte != 30) {
            if (tiene30dias(mes)) {
                return (diaSgte + 1) + " - " + mes + " - " + anhoSgte;

            }

        }
        if (dia == 28 && mes == 2) {
            return 1 + " - " + (mesSgte + 1) + " - " + anhoSgte;
        } else if (dia != 28 && mes == 2) {
            return (diaSgte + 1) + " - " + mesSgte + " - " + anhoSgte;
        }
        return diaSgte + " - " + mesSgte + " - " + anhoSgte;

    }

    public static boolean tiene30dias(int mes) {
        return mes == 4 || mes == 6 || mes == 9 || mes == 11;

    }

    public static boolean tiene31dias(int mes) {
        return mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10;

    }
}

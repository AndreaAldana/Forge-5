/* import java.util.Scanner;

public class funcionFechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dia");
        int dia = sc.nextInt();
        System.out.println("mes");
        int mes = sc.nextInt();
        System.out.println("año");
        int anho = sc.nextInt();

        System.out.println(siguiente);


    }

    private static String siguiente(int dia, int mes, int anho) {
        int diaSgte = dia;
        int mesSgte = mes;
        int anhoSgte = anho;

        if(dia==31){
            diaSgte = 1;
            mesSgte +=1;
        } else if (dia==30){
            if(tiene30dias(mes)){
                diaSgte = 1;
                mesSgte += 1;
            }
            else if (dia==28 && mes==2){
                diaSgte = 1;
                mesSgte = 3;
            }  else{
                diaSgte += 1;
            }
        }
            if(mesSgte >12){
                mesSgte = 1;
                anhoSgte +=
            }

    }
}
*/
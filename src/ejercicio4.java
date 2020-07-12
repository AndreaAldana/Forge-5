import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nota");
        int nota = sc.nextInt();

        System.out.println(resultadosPorNota(nota));

    }
    static public String resultadosPorNota(int nota){
        if(nota==0){
            return "Reprobado";
        }
        else if(nota>=1 && nota<=3){
            return "Normal";
        }
        else if (nota>=4 && nota <=6){
            return "Bien";
        }
        else if(nota == 7){
            return "Excelente";
        }
        else{
            return "Nota inválida";
        }

    }
}

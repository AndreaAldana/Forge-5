import java.util.Scanner;

public class diosJpg {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número a elevar");
            int x = sc.nextInt();
        System.out.println("Ingrese número de elevaciones");
            int y = sc.nextInt();
            boolean flag = true;



                System.out.println(elevado(x,y));

    }




    static public int elevado(int x, int y) {

            int resultado = 1;

            if(y==0){
                return 1;
            } else{
                return x*elevado(x,y-1);

            }

        }
}




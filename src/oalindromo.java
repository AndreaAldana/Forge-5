import javax.swing.*;
import java.util.Scanner;

public class oalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un dato");
        String s = sc.nextLine();
        if(esPalindromo(s)){
            System.out.println("Es palindromo");
        } else{
            System.out.println("No es palindromo?");
        }

    }
    static public boolean esPalindromo(String s){
        if(s.length() <= 1){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        return esPalindromo(s.substring(1,s.length()-1));

    }
}

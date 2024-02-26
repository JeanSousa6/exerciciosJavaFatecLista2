package lista2.Banin.DispMov;
import java.util.Scanner;


public class exe1 {
    public static void main(String[] args){

        Scanner lerNumero = new Scanner(System.in);
        int n;
        boolean primo = true;

        System.out.print("Insira o valor de x: ");
        n = lerNumero.nextInt();


        if(n > 3) {
            for (int i = 2; i <= (n - 1); i++) {
                if (n % i == 0) {
                    primo = false;
                }
            }
        }


        if(n == 1 || !(primo)) {
            System.out.println( n + " Não é primo.");
        }

        else{
            System.out.println( n + " É primo.");
        }

        lerNumero.close();

    }
}

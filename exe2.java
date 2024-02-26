package lista2.Banin.DispMov;
import java.util.Scanner;
import java.util.ArrayList;


public class exe2 {

    private static boolean Primo(int n){
        boolean primo = true;
        if(n > 3){
            for(int i = 2 ; i < n - 1 ; i++) {
                if (n % i == 0) {
                    primo = false;
                }
            }
        }
        return primo;
    }



    public static void main(String[] args) {

        Scanner lerNumero = new Scanner(System.in);
        ArrayList<Integer> primos = new ArrayList<>();
        int min, max, aux, soma = 0;

        System.out.print("Insira o valor min: ");
        min = lerNumero.nextInt();
        System.out.print("Insira o valor max: ");
        max = lerNumero.nextInt();

        if(min >= 2 && max <= 999999) {
            if (min > max) {
                aux = min;
                min = max;
                max = aux;
            }

            for(int i = min ; i <= max; i++){
                if(Primo(i)){
                    primos.add(i);
                    soma++;
                }
            }

        }
        else{
            System.out.println("Insira um valor entre 2 e 999999");
        }
        System.out.println(primos);
        System.out.println("Numeros primos encontrados: " + soma);

    }

}
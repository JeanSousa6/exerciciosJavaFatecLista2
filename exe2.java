/*
2. Escreva um programa Java que leia dois inteiros Min e Max. O valor de Min deve ser no mínimo 2. O valor de Max deve ser
obrigatoriamente maior que Min e menor ou igual a 999999. O programa deve carregar um ArrayList de inteiros com todos os
números primos existentes no intervalo fechado [Min, Max]. Ao final mostre na tela esses números primos e quantos foram
encontrados. Para verificar se um número é primo crie um método que recebe n como parâmetro e retorna um boolean true se
n for primo, ou false se n não for primo.

*/

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

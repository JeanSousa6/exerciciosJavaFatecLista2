/* 4. Escreva um programa que leia um número inteiro n e mostre na tela os n primeiros termos da sequência de Fibonacci. Essa
sequência tem os dois primeiros termos 0 e 1, para os demais, cada termo é a soma dos dois anteriores.
Exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, etc...  */

package lista2.Banin.DispMov;
import java.util.Scanner;
import java.util.ArrayList;

public class exe4{
     public static void main(String[] args) {

        Scanner lerNum = new Scanner(System.in);
        ArrayList<Integer> numerosFibo = new ArrayList<>();
        int n, cont = 0;

        System.out.print("Insira um número: ");
        n = lerNum.nextInt();

        for(int i = 0 ; i < n ; i++){
            if(i < 2) {
                numerosFibo.add(i);
            }
            else {
                numerosFibo.add(numerosFibo.get(cont) + numerosFibo.get(cont + 1));
                cont++;
            }
        }

        System.out.println(numerosFibo);


    }

}

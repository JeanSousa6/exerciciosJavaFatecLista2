/*
3. Escreva um programa que leia um número inteiro de 5 dígitos, ou seja, no intervalo fechado [10.000, 99.999]. Crie um método
que receba esse número inteiro e calcule um dígito verificador segundo a regra a seguir. A regra de cálculo desse dígito verificador
tem o nome de módulo 7.
Exemplo: se o código for 21468, o dígito verificador será 3.

Em primeiro lugar deve-se tomar cada dígito individualmente e multiplicá-lo pelo peso apropriado. O peso do dígito menos
significativo é 6, o peso do segundo dígito menos significativo é 5 e assim por diante, conforme mostrado na tabela. Os resultados
das multiplicações devem ser somados e por fim calcula-se o resto dessa soma por 7

Usando o Exemplo: 21468 

| Digitos | 2 | 1 | 4 | 6 | 8 |
|     Peso| 2 | 3 | 4 | 5 | 6 |
|         | (2*2) + (1*3) + (4*4) + (6*5) + (8*6) = 101  

resto 101 por 7 = 3 

portanto: Digito verificador = 3. 

referencia extra: metodo substring em java: https://www.guj.com.br/t/imprimir-posicao-string/74698

*/

package lista2.Banin.DispMov;


import java.util.Scanner;
import java.util.ArrayList;

public class exe3 {

    public static void main(String[] args) {

        Scanner lerNum = new Scanner(System.in);
        int x, digitoVerificador;
        int soma = 0;
        int peso = 2;
        String plvr;

        System.out.printf("Digite um valor de 5 dígitos: ");
        x = lerNum.nextInt();

      if(x >= 10000 && x <= 99999){

          plvr = Integer.toString(x);

          for(int i = 0 ; i < 5; i++){

              //System.out.println(Integer.parseInt(plvr.substring(i, i + 1)) * peso);
              soma += Integer.parseInt(plvr.substring(i, i + 1)) * peso;
              peso++;

          }

          digitoVerificador = soma % 7;
          System.out.println("Digito verificador do número: " + x + " é " + digitoVerificador);
      }

      else{
          System.out.println("Digite um valor entre [10000 , 99999]");
      }


    }

}

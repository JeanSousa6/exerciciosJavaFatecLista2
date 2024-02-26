package lista2.Banin.DispMov;
//referencia: metodo substring em java: https://www.guj.com.br/t/imprimir-posicao-string/74698


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

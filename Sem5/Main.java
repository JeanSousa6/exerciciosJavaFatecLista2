package POO.Grace.Sem5;
import  java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner lerDado = new Scanner(System.in);
        Data d1;
        int num;

        System.out.print("Insira o ano para verificar se é bissexto: ");
        num = lerDado.nextInt();
        d1 = new Data(num);


        if(d1.bisSexto(d1.getAno())){
            System.out.println(num + " É bissexto.");
        }
        else{
            System.out.println(num + " Não é bissexto");
        }

    }
}




/*  Testando números binários dado um intervalo



       Data d1;


      for(int i = 1000 ; i <= 2024 ; i++){
            d1 = new Data(i);

            if(d1.bisSexto(d1.getAno())){
                System.out.println(i + " É bissexto");
            }
            else{
                System.out.println(i + " Não é bissexto");
            }
      }

OK!
 */
























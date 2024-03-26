package POO.Grace.Sem5;


//Método de número bissexto linha 73
public class Data {
    private int mes;
    private int dia;
    private int ano;


    public Data (int d , int m , int a){
        setData(d, m , a);
    }

    public Data (int m , int a){
        setData(1, m , a);
    }

    public Data (int a){
        setData(1, 1, a);
    }


    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public void setData(int d, int m, int a){
        if(m > 0 && m <= 12){
            mes = m;
        }
        else{
            mes = 1;
            System.out.println("Mês " +
                    m + " invalido. Configurando mês = 1.");
        }
        ano = a;
        dia = checkDia(d);
    }




    private int checkDia(int diaTeste){
            int diaMes [] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if(diaTeste > 0 && diaTeste <= diaMes[mes]){
                return diaTeste;
            }
            else{
                System.out.println("Dia " + diaTeste +
                        " invalido. Configurado dia = 1.");
                return 1;
            }
    }

    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }




    //Método bissexto - ATIVIDADE 09


    public boolean bisSexto(int ano){
        if(ano % 400 == 0){
            return true;
        }
        else if(ano % 4 == 0 && !(ano % 100 == 0)){
            return true;
        }
        return false;
    }

}

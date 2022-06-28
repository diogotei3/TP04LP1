import java.text.*;
import java.util.*;

/**
 * Alterado pelo exercício 1 do trabalho final:
 * Exercício 01(1,0)
Renomear as propriedades e métodos da classe Data, deixando-os de acordo com o padrão UML
(métodos getters e setters).
 */

/**
 * Exercício 01 - Crie a classe Data conforme especificado abaixo:
 *
 * @author Rian Gustavo Quintanilha de Aquino e Diogo Santos Teixeira
 O construtor Data() deverá permitir ao usuário digitar os valores de dia, mês e ano e com eles
inicializar os atributos da classe. Os valores digitados deverão ser consistidos e só aceitos se válidos,
caso contrário, redigitar;
 O construtor Data(int d, int m, int a) deverá receber os valores de dia, mês e ano e com eles inicializar
as propriedades da classe;
 Os métodos entraDia(int d), entraMes(int m) e entraAno(int a) devem receber um valor e atribuí-lo às
respectivas propriedades;
 Os métodos entraDia (),entraMes () e entraAno () devem permitir ao usuário digitar um valor e atribuí-
lo a respectiva propriedade. Os valores digitados devem sofrer consistência e só aceitos quando válidos,
caso contrário, solicitar ao usuário redigitar;
 Os métodos retDia(), retMes() e retAno() devem nos devolver as respectivas propriedades;
 O método mostra1() deve nos devolver a data no formato: dd/mm/aaaa;
 O método mostra2() deve nos devolver a data no formato: dd/mesPorExtenso/ano;
 O método bissexto() deve nos devolver um boolean informando se o ano é ou não bissexto;
 O método diasTranscorridos, deve retornar a quantidade de dias transcorridos no ano até a data
digitada.
 O método apresentaDataAtual() deve imprimir a data atual, utilizando as classes Date e DateFormat, o
DateFormat empregando o seguinte método: getDateInstance(DateFormat.FULL);
 Conveniente colocar tratamento de exceção para as possíveis inconsistências na entrada de dados.
 */

public class Data {

    private int dia;
    private int mes;
    private int ano;
    Scanner scan = new Scanner(System.in);

    Data(){
        do{
            System.out.println("Digite o dia: ");
            System.out.print("-> ");
            dia=scan.nextInt();

            System.out.println("Digite o mes: ");
            System.out.print("-> ");
            mes=scan.nextInt();

            System.out.println("Digite o ano: ");
            System.out.print("-> ");
            ano=scan.nextInt();

            if(dia<=0 || dia>=32 || mes<=0 || mes>=13 || ano<0){
                System.out.println("Atenção! Alguma data digitada incorretamente, tente novamente.");
            }
        }while(dia<=0 || dia>=32 || mes<=0 || mes>=13 || ano<0);
    }
    Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }

    public void setDia(int d){
        dia = d;
    }

    public void setMes(int m){
        mes = m;
    }

    public void setAno(int a){
        ano = a;
    }

    public void setDia(){
        do{
            System.out.println("Digite o dia: ");
            System.out.print("-> ");
            dia=scan.nextInt();

            if(!(dia>0 && dia<32)){
                System.out.println("Atenção! Dia digitado incorretamente, tente novamente.");
            }
        }while(dia<=0 || dia>=32);
    }

    public void setMes(){
        do{
            System.out.println("Digite o mes: ");
            System.out.print("-> ");
            mes=scan.nextInt();

            if(mes<=0 || mes>=13){
                System.out.println("Atenção! Mês digitado incorretamente, tente novamente.");
            }
        }while(mes<=0 || mes>=13);
    }

    public void setAno(){
        do{
            System.out.println("Digite o ano: ");
            System.out.print("-> ");
            ano=scan.nextInt();

            if(!(ano>0)){
                System.out.println("Atenção! Ano digitado incorretamente, tente novamente.");
            }
        }while(ano<0);
    }

    public int getDia(){
        return dia;
       
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public String getData1(){
        String ret = dia + "/" + mes + "/" + ano;
        return ret;
    }

    public String getData2() {
        String text;
        switch (mes) {
            case 1:
                text = "janeiro";
                break;
            case 2:
                text = "fevereiro";
                break;
            case 3:
                text = "março";
                break;
            case 4:
                text = "abril";
                break;
            case 5:
                text = "maio";
                break;
            case 6:
                text = "junho";
                break;
            case 7:
                text = "julho";
                break;
            case 8:
                text = "agosto";
                break;
            case 9:
                text = "setembro";
                break;
            case 10:
                text = "outubro";
                break;
            case 11:
                text = "novembro";
                break;
            case 12:
                text = "dezembro";
                break;
            default:
                text = "InvalidMonth";
                break;
        }
        return dia + "/" + text + "/" + ano;
    }

    public boolean bissexto(){
        boolean bi;
        if (ano % 4 == 0) {
            bi = true;
        }
        else{
            bi = false;
        }
        return bi;
    }

    public int diasTranscorridos(){
        int dias= dia + 31*mes;
        return dias;
    }
    public static void getDataAtual (){
        DateFormat DFormat = DateFormat.getDateInstance();
        System.out.println( "A data atual: " + DFormat.format(new Date()));
    }

}

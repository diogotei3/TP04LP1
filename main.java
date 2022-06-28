import java.util.*;

/**
 * Alterado pelo exercício 1 do trabalho final:
 * Exercício 01(1,0)
 Renomear as propriedades e métodos da classe Data, deixando-os de acordo com o padrão UML
 (métodos getters e setters).
 */

/**
 *
 * @author Rian Gustavo Quintanilha de Aquino e Diogo Santos Teixeira
 *
 * Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no
exercício anterior.
 */
public class main {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int dia, mes, ano;

        System.out.println("Por construtor vazio: ");
        Data obj1 = new Data();
        System.out.println("");

        System.out.println("Por construtor com parametros: ");
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
        } while(dia<=0 || dia>=32 || mes<=0 || mes>=13 || ano<0);
        Data obj2 = new Data(dia, mes, ano);
        System.out.println("");

        System.out.println("Métodos entraDia/Mes/Ano: ");
        obj1.setDia();
        obj1.setMes();
        obj1.setAno();
        System.out.println("");

        obj2.setDia(4);
        obj2.setMes(4);
        obj2.setAno(2004);

        System.out.println("Dia primeira data: " +obj1.getDia());
        System.out.println("Mes primeira data: " +obj1.getMes());
        System.out.println("Ano primeira data: " +obj1.getAno());
        System.out.println("");

        System.out.println("Dia segunda data: " +obj2.getDia());
        System.out.println("Mes segunda data: " +obj2.getMes());
        System.out.println("Ano segunda data: " +obj2.getAno());
        System.out.println("");

        System.out.println("Primeira data: " +obj1.getData1());
        System.out.println("Segunda data: " +obj2.getData2());
        System.out.println("");

        System.out.println("Data 1 tem ano bissexto? " +(obj1.bissexto()?"SIM":"NÃO"));
        System.out.println("Data 2 tem ano bissexto? " +(obj2.bissexto()?"SIM":"NÃO"));
        System.out.println("");

        System.out.println("Dias transcorridos até data 1: " + obj1.diasTranscorridos());
        System.out.println("Dias transcorridos até data 2: " + obj2.diasTranscorridos());
        System.out.println("");

        Data.getDataAtual();

    }

}

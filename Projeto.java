import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.nio.channels.NonWritableChannelException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Projeto{

        private static final String inicio = "inicio";
        private static String compartilhamentos = "compartilhamentos";
    public static void main(String[] args){

        //Calculadora();

        Cadastro();
      
    }

    public static void Calculadora(){

        Scanner sc = new Scanner(System.in);

        double vinvestido = sc.nextDouble();

        ArrayList<Integer> resultado = new ArrayList<Integer>();
        resultado = Calculadora.calculaNumVizualizacoes(vinvestido);
        
        System.out.println("numero de vizualizações: " + resultado.get(0));

    }

    public static void Cadastro (){
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Para iniciar seu cadastro insira os seguintes dados: ");
        
        System.out.println("Nome do anúncio: ");
        String nomeAnuncio = scann.nextLine();
        
        System.out.println("Cliente: ");
        String nomeCliente = scann.nextLine();

        System.out.println("Data de inicio: ");
        System.out.println("Dia: ");
        int diaIni = scann.nextInt();
        System.out.println("Mês: ");
        int mesIni = scann.nextInt();
        System.out.println("Ano: ");
        int anoIni = scann.nextInt();

        System.out.println("Data de término: ");
        System.out.println("Dia: ");
        int diaTer = scann.nextInt();
        System.out.println("Mês: ");
        int mesTer = scann.nextInt();
        System.out.println("Ano: ");
        int anoTer = scann.nextInt();

        LocalDate startDate = LocalDate.of(anoIni, mesIni, diaIni);
        LocalDate endDate = LocalDate.of(anoTer, mesTer, diaTer);

        System.out.println("Agora insira o valor de ivestimento por dia: ");
        double vindia = scann.nextDouble();

        double days = ChronoUnit.DAYS.between(startDate, endDate);


        System.out.println("Obrigado, segue o relatório do seu anúncio: ");
        double vtotal = 0;

        if(days == 0){
            vtotal = vindia;
        } else{
            vtotal = (vindia * days);
        }

        ArrayList<Integer> resultado = new ArrayList<Integer>();
        resultado = Calculadora.calculaNumVizualizacoes(vtotal);
        System.out.println("Valor total investido: " + "R$" + vtotal);
        System.out.println("Quantidade máxima de vizualizações: " + resultado.get(0));
        System.out.println("Quantidade máxima de cliques: " + resultado.get(1));
        System.out.println("Quantiddade máxima de compartilhamentos: " + resultado.get(2));

        int aux;
        System.out.println("Digite 1 para realizar um novo cadastro ou digite 2 para sair: ");
        aux = scann.nextInt();

        if(aux == 1){
            Cadastro();
        } return;
        
    }

}
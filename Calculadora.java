import java.util.ArrayList;

public class Calculadora {
    
    private static final String inicio = "inicio";
    private static String compartilhamentos = "compartilhamentos";

    public static ArrayList<Integer> calculaNumVizualizacoes (double vinvestido){
        int numeroVizualizacoes = calculaVizualizacoes(vinvestido, inicio);
        int numeroCliques = calculaCliques(numeroVizualizacoes);
        int numeroCompartilhamentos = calculaCompartilhamentos(numeroCliques);

        if(numeroCompartilhamentos < 1){ 
            ArrayList<Integer> dadosInicio = new ArrayList<Integer>();
            dadosInicio.add(numeroVizualizacoes);
            dadosInicio.add(numeroCliques);
            dadosInicio.add(numeroCompartilhamentos);
            return (dadosInicio);
        } 

        ArrayList<Integer> dadosAtual= new ArrayList<Integer>();
        int vizAcum = numeroVizualizacoes;
        int cliAcum = numeroCliques;
        int comAcum = numeroCompartilhamentos;

        ArrayList<Integer> aux = new ArrayList<Integer>();

        for(int i=0; i < 3; i++){
            aux = calculaVizPorCompartilhamento(numeroCompartilhamentos);
            dadosAtual.add(0, aux.get(0));
            dadosAtual.add(1, aux.get(1));
            dadosAtual.add(2, aux.get(2));

            vizAcum += aux.get(0);
            cliAcum += aux.get(1);
            comAcum += aux.get(2);

            numeroCompartilhamentos = aux.get(2);

        }

        ArrayList<Integer> dados = new ArrayList<Integer>();
        dados.add(vizAcum);
        dados.add(cliAcum);
        dados.add(comAcum);

        return (dados);
    }

    public static ArrayList<Integer> calculaVizPorCompartilhamento(int numeroCompartilhamentos){
        
        int numVizCompartilhermentos = calculaVizualizacoes(numeroCompartilhamentos, compartilhamentos);
        int cliquesCompartilhamento = calculaCliques(numVizCompartilhermentos);
        int compartilhamentosCompartilhamento = calculaCompartilhamentos(cliquesCompartilhamento);

        ArrayList<Integer> dados = new ArrayList<Integer>();
        dados.add(numVizCompartilhermentos);
        dados.add(cliquesCompartilhamento);
        dados.add(compartilhamentosCompartilhamento);

        return (dados);
    }

    public static int calculaVizualizacoes(double v, String origem){
        double resultado = 0;
        
        if (origem.equals(inicio)){
            resultado = (v * 30);
        } else if(origem.equals(compartilhamentos)){
            resultado = (v * 40);
        } 
        return (int) Math.floor(resultado);
    }

    public static int calculaCliques(int numviz){
        return (int) Math.floor(numviz * 0.12);
    }

    public static int calculaCompartilhamentos(int numcliques){
        return (int) Math.floor(numcliques * 0.15);
    }
}

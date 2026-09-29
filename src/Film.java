public class Film {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}

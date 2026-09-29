import br.com.guichosta.screenmatch.modelos.Film;
import br.com.guichosta.screenmatch.modelos.Serie;
import br.com.guichosta.screenmatch.modelos.Titulo;

public class Principal {
    public static void main(String[] args) {
        Film meuFilme = new Film();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(6);
        meuFilme.avalia(4);
        meuFilme.exibeFichaTecnica();
        System.out.println("Filme: " + meuFilme.getNome());
        System.out.println("Lançamento: " + meuFilme.getAnoDeLancamento());
        System.out.println("Duração: " + meuFilme.getDuracaoEmMinutos() + " minutos");
        System.out.println("Nota: " + meuFilme.mediaDasAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        //System.out.println(meuFilme.somaDasAvaliacoes); não usavel pro causa do "private" ou modificadores de acesso


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setEpisodiosPorTemporada(10);
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println("Duração: " + lost.getDuracaoEmMinutos());
    }

}

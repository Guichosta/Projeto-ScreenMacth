public class Principal {
    public static void main(String[] args) {
        Film meuFilme = new Film();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(6);
        meuFilme.avalia(4);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacao);
        System.out.println(meuFilme.mediaDasAvaliacoes());
    }

}

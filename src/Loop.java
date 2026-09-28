import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double meidaAvaliacao = 0;
        double nota = 0;

        for(int i = 0; i < 3; i++){
            System.out.println("Digite sua avaliação para o filme ");
            nota = leitura.nextDouble();
            meidaAvaliacao += nota;
        }

        System.out.println("Média de avaliações " + meidaAvaliacao/3);

    }
}

import java.util.Scanner;
import java.util.StringTokenizer;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = scanner.nextLine();
        System.out.println("Qual o ano de lançamento do filme: ");
        int anoDeLancamento = scanner.nextInt();
        System.out.println("Diga sua avaliação para o filme: ");
        double avaliacao = scanner.nextDouble();

        System.out.println("O filme "+filme+" foi lançado em "+anoDeLancamento+"e possuí "+avaliacao+"pontos");

    }
}

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotals = 0 ;

        while (nota != -1){
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar");
            nota = scanner.nextDouble();
            //Recebe o que ele já tinha mais a nota
            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotals++;
            }

        }
        System.out.println("Média de avaliações: "+ mediaAvaliacao/totalDeNotals);
/*
Jogo / desafio modulo 3
        int escolha = 0;

        while (escolha != 3){

            System.out.println("""

                       ----Menu----
                       1 - Calcular área do quadrado.
                       2 - Calcular área  do círculo.
                       3 - Sair.""");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:

                    System.out.println("\nDigite o lado do quadrado:");
                    double lado = scanner.nextDouble();
                    double areaQuadrado = lado * lado;
                    System.out.println("A área deste quadrado é de: " + areaQuadrado);
                    break;

                case 2:

                    System.out.println("\nDigite o raio do círculo:");
                    double raio = scanner.nextDouble();
                    double areaCirculo = 3.14 * (raio * raio);
                    System.out.println("A área deste círculo é de: " + areaCirculo);
                    break;

                case 3:

                    System.out.println("\nEncerrando programa...");
                    escolha = 3;
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");

            }

*/
        }
    }


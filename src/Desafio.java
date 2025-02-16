import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = 0.0;
        int opcao = 0;
        String titular = "Carlos Eduardo Sanches Mariano";


        while (opcao != 5){
            System.out.println("""
                    
                    ----Menu---
                    1 - Consultar Dados.
                    2 - Depositar valor.
                    3 - Transferir valor.
                    4 - Sair.
                    
                    Digite sua opção abaixo:
                    """);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.printf("""
        *=*=*=*=*=*=*=*=*=*=*
            Dados iniciais do cliente:
        
                Titular: %s
                Tipo de conta: Corrente
                Saldo inicial: %.2f
        
        *=*=*=*=*=*=*=*=*=*=*
        """, titular, saldoAtual);
            } else if (opcao == 2) {

                System.out.println("Digite o valor que deseja depositar:");
                saldoAtual += scanner.nextDouble();

            } else if (opcao == 3) {

                System.out.println("Digite o valor que deseja transferir:");
                double transferencia = scanner.nextDouble();

                if (saldoAtual < transferencia) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldoAtual -= transferencia;
                }

            } else if (opcao == 4) {
                System.out.println("Encerrando operação....");
                opcao = 4;
            } else {
                System.out.println("Opção inválida. Por favor, tente novamente!");
            }
        }

    }
}

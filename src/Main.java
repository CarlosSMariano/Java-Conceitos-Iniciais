//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
          to see how IntelliJ IDEA suggests fixing it.
         Printar no console
              System.out.println("Esse é o Screen Match");
              System.out.println("Filme: Ainda Estou Aqui");

             TIPOS PRIMITIVOS:

              boolean
          O tipo boolean é utilizado para representar valores lógicos, podendo assumir apenas dois
          valores: true ou false. É utilizado em expressões condicionais, loops e outros casos onde se
          deseja avaliar se uma determinada condição é verdadeira ou falsa.

          byte
          O tipo byte é utilizado para representar valores numéricos inteiros de 8 bits.
          Ele possui uma faixa de valores de -128 a 127.

          char
          O tipo char é utilizado para representar caracteres individuais.
          Ele pode armazenar qualquer caractere Unicode e é representado por aspas simples ('').

          short
          O tipo short é utilizado para representar valores numéricos inteiros de 16 bits.
          Ele possui uma faixa de valores de -32.768 a 32.767.

          int
          O tipo int é utilizado para representar valores numéricos inteiros de 32 bits.
          É um dos tipos de dados mais utilizados para representar números inteiros em Java e
          possui uma faixa de valores de -2.147.483.648 a 2.147.483.647.

          long
          O tipo long é utilizado para representar valores numéricos inteiros de 64 bits.
          Ele é utilizado para representar valores inteiros muito grandes e possui uma faixa de
          valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.

          float
          O tipo float é utilizado para representar valores numéricos de ponto flutuante, ou seja,
          valores com casas decimais, sendo que ocupa 32 bits de memória.
          Ele pode representar números decimais com até sete dígitos e tem uma precisão limitada,
          o que significa que ele pode arredondar os números se eles forem muito grandes ou muito pequenos.

          double
          O tipo double é similar o float, entretanto ele ocupa 64 bits de memória e
          pode representar números decimais com até 15 dígitos.

         */

              //inteiro
              int anoDeLancamento = 2024;

              //booleano = true or false
              boolean incluidoNoPlano = true;

              //representa números decimais, ocupando 64bits de memória
              double notaDoFilme = 5.0;

              //Média calculada por 3 notas (aleatórias)
              double media = (9.8 + 6.3 + 7.0 ) / 3;
              System.out.println(media);

              String sinopse;
              sinopse = "Filme bibliográfico sobre Runice Paiva, esposa de Rubens Paiva";

              String nome = "Eunice Paiva";
              int ano = 1971 ;
              double valor = 8000000.00;

              //Concatenação com TextBlock (""") e formatted
              System.out.println("""
                      Filme bibliográfico sobre %s, esposa de Rubens Paiva em %d
                      Durante a ditadura militar
                      O filme custou %f
                      """.formatted(nome, ano, valor));

/*
              * Comparação de Strings:
              *
              * O operador == comumente utilizado, verifica se as duas variáveis apontam para
              * o mesmo objeto na memóri ae não se o conteúdo das Strings é igual. Para comparar o contúdo
              * de duas Strings, é necessário utilizar o método equals().
              *
              * Exempo da alura:
              * String senha = "12345";
                  if(senha.equals("1234")){
                      System.out.println("Acesso autorizado!");
                  }else{
                      System.out.println("Senha incorreta");
                  }
*/

              //Convertendo Valores:
              int classificacao = (int) (media / 2);
              System.out.println(classificacao);


         // Desafio : Conversor de celsius para Fahrenheit

         double celsius = 38.0;
         double conversorFahrenheit = (celsius * 1.8) + 32;

         System.out.println("%fCº é equivalente a %fFº".formatted(celsius, conversorFahrenheit));

         int inteiroFahrenheit = (int) conversorFahrenheit;
         System.out.println("A temperatura inteira em Fahrenheit é: %dFº".formatted(inteiroFahrenheit));

    }
}
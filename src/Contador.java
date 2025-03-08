import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro parâmetro: ");
        int parametro1 = terminal.nextInt();

        System.out.println("Digite o valor do segundo parâmetro: ");
        int parametro2 = terminal.nextInt();

        // Utilizar o método contar utilizando o bloco try/catch
    }

    public static void contar (int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = segundoParametro - primeiroParametro;

        for (int i=1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

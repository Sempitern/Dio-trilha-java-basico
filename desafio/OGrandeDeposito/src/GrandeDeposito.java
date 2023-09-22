import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        double novoSaldo;
        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            novoSaldo = valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$ "+ df.format(novoSaldo));
        } else if (valor < 0) {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }else{
            System.out.println("Encerrando o programa...");
        }
    }
}
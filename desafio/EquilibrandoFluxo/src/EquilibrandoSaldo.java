import java.text.DecimalFormat;
import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0"); 
        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        double novoSaldo = saldoAtual + valorDeposito - valorRetirada;
        
        System.out.println("Saldo atualizado na conta: " + novoSaldo);
       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.

     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
    }
}
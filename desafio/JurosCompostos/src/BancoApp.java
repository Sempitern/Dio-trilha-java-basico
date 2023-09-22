import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
   
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        taxaJuros = 1 + taxaJuros;
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        for(int i = 0; i < periodo; i++){
            valorFinal = valorFinal * taxaJuros;
        }
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}
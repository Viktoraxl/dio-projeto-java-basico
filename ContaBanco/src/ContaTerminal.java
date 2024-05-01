import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da Agência: ");
        String agenciaString = scanner.nextLine();
        int agenciaInt = Integer.parseInt(agenciaString);

        System.out.println("Digite o número da conta: ");
        String conta = scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite seu saldo: ");
        String saldoString = scanner.nextLine();
        double saldoDouble = Double.parseDouble(saldoString);
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String saldoFormatado = formatoMoeda.format(saldoDouble);

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco"
        +", sua agência é "+ agenciaInt +", conta "+ conta + " e seu saldo "+ saldoFormatado 
        +" já está disponível para saque");      
    }
}

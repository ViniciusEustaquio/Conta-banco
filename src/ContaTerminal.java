import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o Numero da conta");
        int numero = scanner.nextInt();
        
        System.out.println("Digite sua agencia");
        String agencia = scanner.next();
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        Double Saldo = 550.10;
        
        
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "  + agencia + ", conta " + numero + " e seu saldo " + Saldo + " já está disponível para saque");
        
    }
}

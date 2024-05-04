import java.util.Scanner; 

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        numeroConta = myObj.nextInt();
        
        // Consumir a nova linha pendente
        myObj.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = myObj.nextLine();

        System.out.println("Por favor, digite o seu Nome !");
        nomeCliente = myObj.nextLine();

        System.out.println("Por favor, digite o seu saldo !");
        saldo = myObj.nextFloat();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        
    }
}

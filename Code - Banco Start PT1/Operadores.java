
import java.util.Scanner;

public class Operadores {

    Scanner sc = new Scanner(System.in);

    public String nome;
    public int codigoConta;
    public double deposito;
    public double saque;
    public String extrato;
    public int oplista; // add toLowerCase(), porem nao sei como fazer //
    public String continuar; // add toLowerCase(), porem nao sei como fazer //

    // eu faria diferente que o professor quer, eu colocaria um metodo só para tudo //
    // relacionado a banco //

    /*
     * public static double usuario() {
     * return (codigoConta, nome);
     * }
     */

    public String oi() { // como que pula linha no toString// resolvido :) //
        return String.format("        ---OPÇÕES---   " + "%n"
                + "1. Entrar" + "%n"
                + "2. Cadastrar" + "%n"
                + "3. Depósito" + "%n"
                + "4. Saque" + "%n"
                + "5. Extrato" + "%n"
                + "6. Encerrar processo");
    }

    public void login(int senha, int pin) {

        senha = 2002;

        while (senha != pin) {
            System.out.println();
            System.out.print("Usuário: ");
            sc.next();
            nome = sc.nextLine();

            System.out.print("Senha: ");
            pin = sc.nextInt();

            if (senha == pin) {
                System.out.println();
                System.out.println("Acesso permitido.");
                System.out.println("Entrando...");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Acesso negado, tente novamente.");
            }
        }

    }

    public void cadastro() {

        int nascimento;

        System.out.println("Seja bem viado ");
        System.out.println("Nome completo: ");
        nome = sc.nextLine();
        System.out.println("Data de nascimento:  ");
        nascimento = sc.nextInt();
        System.out.println();
        System.out.println("Seja bem viado ");
    }

    public void dep(double mov) {
        mov = (deposito = deposito + 1);
    }

    public void saq(double sak) {
        sak = deposito - saque;
    }

    public void extratex(double situC) {
        situC = deposito;
    }

    public String toString() { // isso daqui é o estrato kkk //
        return String.format("     ---EXTRATO BANCÁRIO---     "
                + "A conta do número: "
                + codigoConta
                + "Portador: "
                + nome
                + "Saldo: "
                + "situ");
    }
}
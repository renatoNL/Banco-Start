
import java.util.Scanner;

public class Operadores {

    
    Scanner sc = new Scanner(System.in);
    Usuario user = new Usuario();
    // add toLowerCase(), porem nao sei como fazer //

    // eu faria diferente que o professor quer, eu colocaria um metodo só para tudo //
    // relacionado a banco //
    public double deposito;
    public double saque;
    public String extrato;
    /*
     * public void double usuario() {
     * return (codigoConta, nome);
     * }
     */

    public String oi() { // como que pula linha no toString// resolvido :) //
        return String.format("---OPÇÕES---   " + "%n" + "%n"
                + "1. Entrar" + "%n"
                + "2. Novo Cadastro" + "%n"
                + "3. Depósito" + "%n"
                + "4. Saque" + "%n"
                + "5. Extrato" + "%n"
                + "6. Encerrar processo");
    }

    public void login(int senha) {

        while (senha != 2002) {
            System.out.println();
            System.out.print("Usuário: ");
            sc.next();
            user.nome = sc.nextLine();

            System.out.print("Senha: ");
            senha = sc.nextInt();

            if (senha == 2002) {
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

        System.out.println("Seja bem viado ");

        System.out.print("Nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Data de nascimento:  ");
        int nascimento = sc.nextInt();

        System.out.print("CPF: "); // da erro aqui quando eu insiro o cpf //
        long CPF = sc.nextInt();
        
        System.out.print("Telefone:");
        long phone = sc.nextInt();
        
        System.out.println();

        Usuario user = new Usuario(nome, CPF, phone, nascimento);
        user.getNome();
        // ideia para se fazer futuramente: colocar um link HTML para ser direcionado //

    }

    public void dep(double mov) {
        double value = user.getSaldo();
        user.setSaldo(value + mov); // deposito só recebe e soma ao que ja tem //
    }

    public void saq(double sak) {
        
        double valor = user.getSaldo(); // saque só subtrai do deposito //
        user.setSaldo(valor - sak);
        
    }

    /*  public void extratex(double situC) { // essa classe é necessaria?? acho que nao 
        situC = deposito;
    }*/

    public String toString() { // isso daqui é o estrato kkk //
        return String.format("     ---EXTRATO BANCÁRIO---     " + "%n"
                + "A conta do número: " 
                + user.getCodigoConta() + "%n"
                + "Portador: " 
                + user.getNome() + "%n"
                + "Saldo: "
                + user.getSaldo());
    }
}
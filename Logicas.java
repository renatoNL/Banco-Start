import java.io.Console;
import java.util.Scanner;

public class Logicas {

    Scanner sc = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    Console console = System.console();
    Operadores ent = new Operadores();

    public static void opcaoentrada(String op) { // add toLowerCase(), porem nao sei como fazer //
        if (op != "s") {
            System.out.println("Saindo..."); // eu consigo puxar um metodo para dentro de um metodo? //
            System.exit(0);
            return;
        } else {
            System.out.print("Valor do depósito:");
        }
    }

    public void opcaolista(String valoRec) {

        switch (valoRec) {
            case "1":
                // add um limpador de console //
                console.printf("\033[H\033[2J");
                ent.login(2002, 123);
                break;
            case "2":
                // add um limpador de console //
                console.printf("\033[H\033[2J");
                ent.cadastro();
                break;
            case "3":
                // add um limpador de console //
                console.printf("\033[H\033[2J");
                ent.dep(0);
                break;
            case "4":
                // add um limpador de console //
                console.printf("\033[H\033[2J");
                ent.saq(0);
                break;
            case "5":
                // add um limpador de console //
                console.printf("\033[H\033[2J");
                ent.toString();
                break;
            case "6":
                // add um limpador de console //
                console.printf("\033[H\033[2J");
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida, tente novamente!"); // ele não está voltando//
                break;
        }

    }

    public void info(int eita) {

        do {

            System.out.print("Digite seu código de usuário: ");
            eita = sc.nextInt();

            if (eita != 2024) {
                System.out.println("Código não cadastrado");
                System.out.println("Dica de código para testes: ano de gente coisada :D (2024)");
                
            } else {
                System.out.print("Digite seu nome de usuário: ");
                ent.nome = sc.nextLine();
            }
            console.printf("\033[H\033[2J");
            System.out.println("Acesso concluido");
        } while (eita != 2024);

    }

}

import java.io.Console;
import java.util.Scanner;

public class Logicas {

    public int oplista; // add toLowerCase(), porem nao sei como fazer //
    public String continuar;

    Scanner sc = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    Console console = System.console();
    Operadores ent = new Operadores();
    Usuario user = new Usuario();

    public void firstQ(String resposta) {

        while (resposta == "s" || resposta == "n") {

            if (resposta == "s") {
                ent.cadastro();
            } else if (resposta == "n") {
                info();
            } else {
                System.out.println("Opção inválida! Tente novamente"); // pq que isso aparece anyway? //
            }
        }

    }

    public void opcaoentrada(String op) { // add toLowerCase(), porem nao sei como fazer //
        if (op == "n") {
            System.out.println("Saindo..."); // eu consigo puxar um metodo para dentro de um metodo? //
            System.exit(0);
        } else {    // aprimorar isso daqui //
            System.out.print("Valor do depósito: ");
            ent.dep(sc.nextDouble());
        }
    }

    public void opcaoentradas(String opi) { // add toLowerCase(), porem nao sei como fazer //
        if (opi == "n") {
            System.out.println("Saindo..."); // eu consigo puxar um metodo para dentro de um metodo? //
            System.exit(0);
        } else {    // aprimorar isso daqui //
            System.out.print("Valor do saque: ");
            ent.saq(sc.nextDouble());
        }
    }

    public void opcaolista(int valoRec) {

        switch (valoRec) {
            case 1:
                // add um limpador de console //
                console.printf("\033[H\033[2J");
                ent.login(2002);
                break;
            case 2:
                // add um limpador de console //
                console.printf("\033[H\033[2J");
                ent.cadastro();
                break;
            case 3:
                // add um limpador de console //
                console.printf("\033[H\033[2J");
                System.out.println("Desejas fazer um depósito? ");
                System.out.println("-----------[s/n]-----------");
                String op = sc.next().toLowerCase(); // para add o toLowerCase eu vou ter que transformar em String // resolvido :) //
                opcaoentrada(op);
                ent.dep(0);
                break;
            case 4:
                // add um limpador de console //
                console.printf("\033[H\033[2J");
                System.out.println("Desejas fazer um saque? ");
                System.out.println("-----------[s/n]-----------");
                String opi = sc.next().toLowerCase(); // para add o toLowerCase eu vou ter que transformar em String // resolvido :) //
                opcaoentradas(opi);
                ent.saq(0);
                break;
            case 5:
                // add um limpador de console //
                console.printf("\033[H\033[2J");
                System.out.println(ent.toString()); 
                break;
            case 6: 
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

    public void info() {

        int eita = 1;

        while (eita != 2024) {

            System.out.print("Digite seu código de usuário: ");
            eita = sc.nextInt();
            sc.nextLine();
            if (eita != 2024) {
                System.out.println();
                System.out.println("Código não cadastrado");
                System.out.println("Dica de código para testes: ano de gente coisada :D (2024)");
                System.out.println();

            } else {
                System.out.println(); // este bloco nao está sendo executado // resolvido :D //
                System.out.print("Digite seu nome de usuário: ");
                String nome = sc.nextLine();
                user.setNome(nome);
                console.printf("\033[H\033[2J");
                System.out.println("Acesso concluido");
                System.out.println();
            }

        }

    }

}

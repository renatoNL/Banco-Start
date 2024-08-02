import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operadores ent = new Operadores();
        Logicas log = new Logicas();

        do {
            
            System.out.println("------------------------------");
            System.out.println("Seja bem vindo ao banco Start!");
            System.out.println("------------------------------");
            
            // add um pre codigo aqui // 

            log.info(2024);

            System.out.println(ent.oi()); // mano a ideia aqui é colocar a lista em um metodo //
            System.out.println();
            log.opcaolista(sc.nextLine());// a ideia aqui é colocar um metodo para executar toda a logica dedicada a
                                          // cada opcao //

            // colocar alguma estrutura de repetição por aqui // 
            ent.codigoConta = sc.nextInt();

            System.out.println();
            System.out.println("Seja bem-vindo! Sr(a). " + ent.nome); // gostaria que a variavel nome tivesse guardado o valor em que associei a ela no login/cadastro //
        
            System.out.println("Desejas fazer um depósito? ");
            System.out.println("-----------[s/n]-----------");
            String op = sc.next(); // para add o toLowerCase eu vou ter que transformar em String //
            Logicas.opcaoentrada(op);

            System.out.println("Deseja continuar?");
            System.out.println("------[s/n]------");
            ent.continuar = sc.next();
            
        } while (ent.continuar == "s");

        System.out.println("Volte sempre!");
        System.out.println("Saindo...");

        sc.close();
    }
}
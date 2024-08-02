import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operadores ent = new Operadores();
        Logicas log = new Logicas();
        Usuario user = new Usuario();

        /*
         * ideia: add uma pergunta se é a primeira vez da pessoa usando o banco, se sim
         * só iria para as opções de deposito saque e extrado, se nao, fazer o cadastro
         */

        System.out.println("É sua sua primeira vez usando o banco Start?"); // fazer um void para isso //
        System.out.println("             ------[s/n]------              ");
        String resposta = sc.next();
        log.firstQ(resposta);

        int ops = 1;
        
        System.out.println("------------------------------");
        System.out.println("Seja bem vindo ao banco Start!");
        System.out.println("------------------------------");

        log.info();

        while (ops != 0) {
            System.out.println(ent.oi()); // mano a ideia aqui é colocar a lista em um metodo //
            System.out.println();
            int opcao = sc.nextInt();
            log.opcaolista(opcao);// a ideia aqui é colocar um metodo para executar toda a logica dedicada a
                                  // cada opcao //

            // colocar alguma estrutura de repetição por aqui //

            System.out.println();
            System.out.println("Seja bem-vindo! Sr(a). " + user.getNome()); // gostaria que a variavel nome tivesse
                                                                            // guardado o
            // valor em que associei a ela no login/cadastro
            // //

            System.out.println("Deseja continuar?");
            System.out.println("------[Sim: 1]------");
            System.out.println("------[Não: 0]------");
            ops = sc.nextInt();

        }

        System.out.println("Volte sempre!");
        System.out.println("Saindo...");

        sc.close();
    }
}
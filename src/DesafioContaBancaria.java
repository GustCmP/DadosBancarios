import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {

        String nomeCliente = "Gustavo Campelo";
        String tipoConta = "Poupança";
        double saldoConta = 2500;
        System.out.println("***************************************************");
        System.out.println("\nDados Iniciais do Cliente:");
        System.out.println("\nNome: " + nomeCliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: R$" + saldoConta);
        System.out.println("\n***************************************************");
        System.out.println("\nOperações");

        String listaOperacoes = """
                \n*** Digite a opcão desejada ***
                
                 1- Consultar saldo
                 2- Transferir Valor
                 3- Depositar Valor
                 4- Sair
                """;

        Scanner opcaoMenu = new Scanner(System.in);

        int opcao =0;
        while (true) {
            System.out.println(listaOperacoes);
            opcao = opcaoMenu.nextInt();
            if (opcao == 1) {
                System.out.println("\nSaldo Atualizado: " + saldoConta);
            }
            if (opcao == 2) {
                System.out.println("\nDigite o valor para transferir: ");
                double valorParaTransferir = opcaoMenu.nextDouble();
                if (valorParaTransferir > saldoConta) {
                    System.out.println("\nValor superior ao saldo disponivel. Por favor, verifique o saldo e tente novamente.");
                } else {
                    valorParaTransferir = saldoConta - valorParaTransferir;
                    String textoTransferencia = """
                            \n Por favor,aguarde.
                            .......................
                            .......................
                            .......................
                            .......................
                            .......................
                            \n Transferencia realizada. Saldo atual R$:
                            """ + valorParaTransferir;
                    System.out.println(textoTransferencia);}
            }
            if (opcao == 3) {
                System.out.println("\nDigite o valor que será depositado: ");
                double valorDepositado = opcaoMenu.nextDouble();
                valorDepositado = saldoConta + valorDepositado;
                String textoDeposito = """
                        \n Por favor,aguarde.
                            .......................
                            .......................
                            .......................
                            .......................
                            .......................
                            \n Deposito realizado. Saldo atual R$:
                        """ + valorDepositado;
                System.out.println(textoDeposito);
            }
            if (opcao == 4) {
                System.out.println("Finalizando operação. Obrigado por usar o CaixaGustavo");
                break;

            } else if (opcao != 4) {
                System.out.println("Opção Invalida");

            }

        }
    }
}
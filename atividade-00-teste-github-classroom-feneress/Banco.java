import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] contas = new int[10];
        double[] saldos = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o código da conta " + (i + 1) + ": ");
            contas[i] = sc.nextInt();

            System.out.print("Digite o saldo da conta " + contas[i] + ": ");
            saldos[i] = sc.nextDouble();
        }

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Efetuar depósito");
            System.out.println("2 - Efetuar saque");
            System.out.println("3 - Consultar ativo bancário");
            System.out.println("4 - Finalizar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o código da conta: ");
                int codigo = sc.nextInt();
                System.out.print("Digite o valor do depósito: ");
                double valor = sc.nextDouble();
                boolean encontrado = false;

                for (int i = 0; i < 10; i++) {
                    if (contas[i] == codigo) {
                        saldos[i] += valor;
                        System.out.println("Depósito realizado! Novo saldo: " + saldos[i]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Conta não encontrada!");
                }
            }

            else if (opcao == 2) {
                System.out.print("Digite o código da conta: ");
                int codigo = sc.nextInt();
                System.out.print("Digite o valor do saque: ");
                double valor = sc.nextDouble();
                boolean encontrado = false;

                for (int i = 0; i < 10; i++) {
                    if (contas[i] == codigo) {
                        if (saldos[i] >= valor) {
                            saldos[i] -= valor;
                            System.out.println("Saque realizado! Novo saldo: " + saldos[i]);
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Conta não encontrada!");
                }
            }

            else if (opcao == 3) {
                double soma = 0;
                for (int i = 0; i < 10; i++) {
                    soma += saldos[i];
                }
                System.out.println("Ativo bancário total: " + soma);
            }

        } while (opcao != 4);

        System.out.println("Programa finalizado.");
    }
}

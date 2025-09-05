import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        double valorPago = sc.nextDouble();

        double troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("Valor pago insuficiente!");
        } else {
            System.out.println("\nTroco: R$ " + String.format("%.2f", troco));

            int centavos = (int) Math.round(troco * 100);

            int[] notas = {20000, 10000, 5000, 2000, 1000, 500, 200};
            int[] moedas = {100, 50, 25, 10, 5, 1};

            System.out.println("\nDistribuição do troco:");

            for (int nota : notas) {
                int qtd = centavos / nota;
                if (qtd > 0) {
                    System.out.println(qtd + " nota(s) de R$ " + (nota / 100.0));
                    centavos %= nota;
                }
            }

            for (int moeda : moedas) {
                int qtd = centavos / moeda;
                if (qtd > 0) {
                    System.out.println(qtd + " moeda(s) de R$ " + (moeda / 100.0));
                    centavos %= moeda;
                }
            }
        }
    }
}
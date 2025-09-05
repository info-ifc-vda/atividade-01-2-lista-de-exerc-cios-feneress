import java.util.Scanner;

public class TabelaValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorLinhas = 0;

        while (true) {
            System.out.print("Digite um número (0 ou negativo para sair): ");
            double numero = sc.nextDouble();

            if (numero <= 0) {
                break;
            }

            if (contadorLinhas % 20 == 0) {
                System.out.println("Valor | Cubo | Raiz Quadrada");
            }

            double cubo = Math.pow(numero, 3);
            double raiz = Math.sqrt(numero);

            System.out.println(numero + " | " + cubo + " | " + raiz);
            contadorLinhas++;
        }

        System.out.println("Programa Finalizado.");
    }
}

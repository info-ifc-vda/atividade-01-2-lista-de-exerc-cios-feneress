import java.util.Scanner;

public class Fatoriais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.println("\nFatoriais no intervalo de " + inicio + " até " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            long fat = 1;
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            System.out.println(i + "! = " + fat);
        }

    }
}

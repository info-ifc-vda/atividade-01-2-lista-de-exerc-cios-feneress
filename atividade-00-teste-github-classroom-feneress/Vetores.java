import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];

        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Digite 5 números para o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = sc.nextInt();
        }

        System.out.println("\n--- Vetor Resultante 1 (pares do primeiro somados a todos do segundo) ---");
        for (int i = 0; i < 10; i++) {
            if (vetor1[i] % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print((vetor1[i] + vetor2[j]) + " ");
                }
                System.out.println();
            }
        }

        System.out.println("\n--- Vetor Resultante 2 (divisores ímpares no segundo vetor) ---");
        for (int i = 0; i < 10; i++) {
            if (vetor1[i] % 2 != 0) {
                int divisores = 0;
                for (int j = 0; j < 5; j++) {
                    if (vetor1[i] % vetor2[j] == 0) {
                        divisores++;
                    }
                }
                System.out.println("Número " + vetor1[i] + " tem " + divisores + " divisores no segundo vetor.");
            }
        }

    }
}

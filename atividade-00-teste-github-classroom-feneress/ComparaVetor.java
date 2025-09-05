import java.util.ArrayList;
import java.util.Scanner;

public class ComparaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = sc.nextInt();
        }

        ArrayList<Integer> naoComuns = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            boolean encontrado = false;
            for (int j = 0; j < 10; j++) {
                if (vetor1[i] == vetor2[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado && !naoComuns.contains(vetor1[i])) {
                naoComuns.add(vetor1[i]);
            }
        }

        for (int i = 0; i < 10; i++) {
            boolean encontrado = false;
            for (int j = 0; j < 10; j++) {
                if (vetor2[i] == vetor1[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado && !naoComuns.contains(vetor2[i])) {
                naoComuns.add(vetor2[i]);
            }
        }

        System.out.println("Vetor dos números não comuns:");
        for (int num : naoComuns) {
            System.out.print(num + ", ");
        }
    }
}
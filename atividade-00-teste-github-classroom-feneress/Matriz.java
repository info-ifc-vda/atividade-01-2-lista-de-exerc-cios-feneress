import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[7][7];
        int[] maioresLinhas = new int[7];
        int[] menoresColunas = new int[7];

        System.out.println("Digite os valores da matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 7; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 7; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maioresLinhas[i] = maior;
        }

        for (int j = 0; j < 7; j++) {
            int menor = matriz[0][j];
            for (int i = 1; i < 7; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            menoresColunas[j] = menor;
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMaior elemento de cada linha:");
        for (int i = 0; i < 7; i++) {
            System.out.print(maioresLinhas[i] + " ");
        }

        System.out.println("\nMenor elemento de cada coluna:");
        for (int j = 0; j < 7; j++) {
            System.out.print(menoresColunas[j] + " ");
        }
    }
}

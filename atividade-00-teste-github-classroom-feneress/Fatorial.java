import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int fatorial = 1;

        System.out.print("Digite um número para calcular o fatorial: ");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}

import java.util.Scanner;

public class QtdPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorPrimos = 0;

        for (int j = 1; j <= 10; j++) {
            System.out.print("Digite o " + j + "º número inteiro: \n");
            int numero = sc.nextInt();

            boolean primo = true;

            if (numero <= 1) {
                primo = false; 
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                contadorPrimos++;
            }
        }

        System.out.println("Quantidade de números primos digitados: " + contadorPrimos);

    }
}

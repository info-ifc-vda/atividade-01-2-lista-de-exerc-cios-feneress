import java.util.Scanner;
public class Quilowatt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salarioMinimo = 0;
        int quilowatt = 0;
        double valorQuilowatt = 0;
        double valorConta = 0;

        System.out.println("Qual o valor do salario minimo?");
        salarioMinimo = sc.nextInt();

        System.out.println("Quantos quilowatts foram consumidos?");
        quilowatt = sc.nextInt();

        valorQuilowatt = salarioMinimo * 1/100;
        System.out.println("O valor de cada quilowatt e de: " + valorQuilowatt);

        valorConta = quilowatt * valorQuilowatt;
        System.out.println("O valor da conta de luz e de: " + valorConta);

    }
}
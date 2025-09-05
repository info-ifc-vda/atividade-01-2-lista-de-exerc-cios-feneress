import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lado1 = 0, lado2 = 0, lado3 = 0;
        double ang1 = 0, ang2 = 0, ang3 = 0;

        System.out.print("Digite o lado 1: ");
        lado1 = sc.nextDouble();

        System.out.print("Digite o lado 2: ");
        lado2 = sc.nextDouble();

        System.out.print("Digite o lado 3: ");
        lado3 = sc.nextDouble();

        System.out.print("Digite o ângulo 1: ");
        ang1 = sc.nextDouble();

        System.out.print("Digite o ângulo 2: ");
        ang2 = sc.nextDouble();

        System.out.print("Digite o ângulo 3: ");
        ang3 = sc.nextDouble();

        String tipoAngulo = "";
        if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
            tipoAngulo = "Retângulo";
        } else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
            tipoAngulo = "Obtusângulo";
        } else {
            tipoAngulo = "Acutângulo";
        }

        String tipoLado = "";
        if (lado1 == lado2 && lado2 == lado3) {
            tipoLado = "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            tipoLado = "Isósceles";
        } else {
            tipoLado = "Escaleno";
        }

        System.out.println("O triângulo é: " + tipoAngulo + " e " + tipoLado);
    }
}

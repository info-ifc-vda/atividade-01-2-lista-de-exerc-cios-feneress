import java.util.Scanner;

public class Salario{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salarioHora = 0;
        int horasTrabalhadas = 0;
        int impostoRenda = 0;
        int salarioBruto = 0;
        int salarioLiquido = salarioBruto - (salarioBruto *impostoRenda/ 100);

        System.out.println("Quantas horas voce trabalha por mes?");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Quanto voce ganha por hora?");
        salarioHora = sc.nextInt();

        salarioBruto = salarioHora * horasTrabalhadas;
        System.out.println("Seu salario bruto e de: " + salarioBruto);
        System.out.println("Qual o percentual de imposto de renda que voce paga?");
        impostoRenda = sc.nextInt();

        salarioLiquido = salarioBruto - (salarioBruto * impostoRenda / 100);
        System.out.println("Seu salario liquido e de: " + salarioLiquido);
    }

}
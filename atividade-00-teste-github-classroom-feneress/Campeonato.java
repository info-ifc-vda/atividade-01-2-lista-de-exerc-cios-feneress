import java.util.Scanner;

public class Campeonato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = 5;
        int jogadoresPorTime = 11;
        int totalJogadores = times * jogadoresPorTime;

        int qtdMenores18 = 0; 
        double somaAlturas = 0;
        int qtdMais80kg = 0;

        for (int i = 1; i <= times; i++) {
            int somaIdadesTime = 0;

            System.out.println("Time " + i);

            for (int j = 1; j <= jogadoresPorTime; j++) {
                System.out.println("Jogador " + j);

                System.out.print("Idade: ");
                int idade = sc.nextInt();

                System.out.print("Peso (kg): ");
                double peso = sc.nextDouble();

                System.out.print("Altura (m): ");
                double altura = sc.nextDouble();

                if (idade < 18) {
                    qtdMenores18++;
                }

                somaIdadesTime += idade;

                somaAlturas += altura;

                if (peso > 80) {
                    qtdMais80kg++;
                }
            }

            double mediaIdadesTime = (double) somaIdadesTime / jogadoresPorTime;
            System.out.println("Média de idades do time " + i + ": \n" + mediaIdadesTime);
            System.out.println("--------------------------------------\n");
        }

        double mediaAlturas = somaAlturas / totalJogadores;

        double porcentagemMais80kg = (qtdMais80kg * 100.0) / totalJogadores;

        System.out.println("Quantidade de jogadores com menos de 18 anos: \n" + qtdMenores18);
        System.out.println("Média de altura de todos os jogadores: \n" + mediaAlturas);
        System.out.println("Porcentagem de jogadores acima de 80kg: \n" + porcentagemMais80kg + "%");
    }
}
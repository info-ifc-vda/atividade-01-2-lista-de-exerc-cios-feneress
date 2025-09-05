import java.util.Scanner;

public class Produtos {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo = 0;
        int quantidade = 0;
        float precoTotal = 0;

        System.out.print("Digite o código do produto (1-40): \n");
        codigo = sc.nextInt();

        System.out.println("Digite a quantidade do produto: \n");
        quantidade = sc.nextInt();

        if(codigo  > 0 && codigo <=10){
            System.out.println("Preço unitário: R$ 10,00\n");

            precoTotal = quantidade * 10;
        }
        else if(codigo > 10 && codigo <=20){
            System.out.println("Preço unitário: R$ 15,00\n");

            precoTotal = quantidade * 15;
        }
        else if(codigo > 20 && codigo <=30){
            System.out.println("Preço unitário: R$ 20,00\n");

            precoTotal = quantidade * 20;
        }
        else if(codigo > 30 && codigo <=40){
            System.out.println("Preço unitário: R$ 40,00\n");

            precoTotal = quantidade * 40;
        }
        else{
            System.out.println("Código inválido.\n");
        }
        
        System.out.printf("Preço total: R$ %.2f\n", precoTotal);

        if(precoTotal < 250 && precoTotal > 0){
            System.out.printf("Você conseguiu um desconto de 5%!\n");

            precoTotal = precoTotal - (precoTotal * 0.05f);
        }
        else if(precoTotal >= 250 && precoTotal < 500){
            System.out.printf("Você conseguiu um desconto de 10%!\n");

            precoTotal = precoTotal - (precoTotal * 0.10f);
        }
        else if(precoTotal >= 500){
            System.out.printf("Você conseguiu um desconto de 15%!\n");

            precoTotal = precoTotal - (precoTotal * 0.15f);
        }

        System.out.printf("\nPreço final com desconto: R$ %.2f", precoTotal);

    }
}

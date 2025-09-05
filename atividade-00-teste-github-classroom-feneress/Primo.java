import java.util.Scanner;

public class Primo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        boolean primo = false;
    
        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            } else {
                primo = true;
            }
        }  

        if (primo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }
}

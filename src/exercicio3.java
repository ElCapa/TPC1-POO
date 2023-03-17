import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double maiorNumero = getMaiorNumero(numero1, numero2, numero3);

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Os números não são distintos.");
        } else {
            System.out.println("O maior número é " + maiorNumero);
        }
    }

     static double getMaiorNumero(double numero1, double numero2, double numero3) {
        double maiorNumero = numero1;

        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        }

        if (numero3 > maiorNumero) {
            maiorNumero = numero3;
        }

        return maiorNumero;
    }
}

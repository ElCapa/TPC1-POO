import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = calcularArea(raio);
        double circunferencia = 2 * 3.14 * raio;

        System.out.println("Área do círculo: " + area);
        System.out.println("Circunferência do círculo: " + circunferencia);

    }
     static double calcularArea(double raio) {
        return 3.14 * raio * raio;
    }
}


import java.util.Scanner;
public class exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double tempF = scanner.nextDouble();

        double tempC = converter(tempF);

        System.out.println(tempF + " graus Fahrenheit correspondem a " + tempC + " graus Celsius.");

        scanner.close();
    }

     static double converter(double tempF) {
        double tempC = (tempF - 32) * 5 / 9;
        return tempC;
    }
}

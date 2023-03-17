import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        double salary = readDouble("Por favor, insira seu salário: ");
        double percentageRaise = readDouble("Qual a percentagem do aumento?");

        System.out.println("Salário atual: " + salary);
        System.out.println("Aumento de " + percentageRaise + "% resulta em um salário de: " + (salary + salary * percentageRaise / 100));
    }

     static double readDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}

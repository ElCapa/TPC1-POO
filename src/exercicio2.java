import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (checkArmstrong(numero)) {
            System.out.println(numero + " é um número de Armstrong.");
        } else {
            System.out.println(numero + " não é um número de Armstrong.");
        }

    }

     static boolean checkArmstrong(int numero) {
         int numDigitos = 0;
         int temp = numero;
         while (temp != 0) {
             numDigitos++;
             temp /= 10;
         }

         int soma = 0;
         temp = numero;
         while (temp != 0) {
             int digito = temp % 10;
             int resultado = 1;
             for (int i = 0; i < numDigitos; i++) {
                 resultado *= digito;
             }
             soma += resultado;
             temp /= 10;
         }

         return soma == numero;
     }
}

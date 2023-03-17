import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de crianças: ");
        int numeroTotalDeCriancas = scanner.nextInt();

        System.out.print("Digite o tamanho dos grupos: ");
        int tamanhoDoGrupo = scanner.nextInt();

        int numeroDeGrupos = numeroTotalDeCriancas / tamanhoDoGrupo;
        int criancasSemGrupo = numeroTotalDeCriancas % tamanhoDoGrupo;

        System.out.println("Número de grupos formados: " + numeroDeGrupos);
        System.out.println("Número de crianças sem grupo: " + criancasSemGrupo);
    }
}

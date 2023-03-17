import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double r = sc.nextDouble();

        System.out.print("Digite o valor da altura: ");
        double h = sc.nextDouble();

        double sphereVolume = sphereVolume(r);
        double sphereSurface = sphereSurface(r);
        double cylinderVolume = cylinderVolume(r, h);
        double cylinderSurface = cylinderSurface(r, h);
        double coneVolume = coneVolume(r, h);
        double coneSurface = coneSurface(r, h);

        System.out.println("Volume da esfera: " + sphereVolume);
        System.out.println("Área da superfície da esfera: " + sphereSurface);
        System.out.println("Volume do cilindro: " + cylinderVolume);
        System.out.println("Área da superfície do cilindro: " + cylinderSurface);
        System.out.println("Volume do cone: " + coneVolume);
        System.out.println("Área da superfície do cone: " + coneSurface);

    }

     static double sphereVolume(double r) {
        return 4.0 / 3.0 * 3.14 * r * r * r;
    }

     static double sphereSurface(double r) {
        return 4.0 * 3.14 * r * r;
    }

     static double cylinderVolume(double r, double h) {
        return 3.14 * r * r * h;
    }

     static double cylinderSurface(double r, double h) {
        return 2.0 * 3.14 * r * h + 2.0 * 3.14 * r * r;
    }

     static double coneVolume(double r, double h) {
        return 1.0 / 3.0 * 3.14 * r * r * h;
    }

     static double coneSurface(double r, double h) {
        double h2 = r * r + h * h;
        double slantHeight = Math.sqrt(h2);
        return 3.14 * r * slantHeight + 3.14 * r * r;
    }
}

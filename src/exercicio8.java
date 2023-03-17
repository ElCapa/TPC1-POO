import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a hora: ");
        int hours = scanner.nextInt();

        System.out.print("Insira os minutos: ");
        int minutes = scanner.nextInt();

        System.out.println(getTimeName(hours, minutes));

    }

     static String getTimeName(int hours, int minutes) {
        String timeName = "";

        if (minutes == 0) {
            timeName += getHourName(hours);
        } else if (minutes == 15) {
            timeName += "um quarto para " + getHourName(hours + 1);
        } else if (minutes == 30) {
            timeName += getHourName(hours) + " e meia";
        } else if (minutes == 45) {
            timeName += "um quarto passadas as " + getHourName(hours);
        } else if (minutes < 30) {
            timeName += "passam " + minutes + " minutos das " + getHourName(hours);
        } else {
            timeName += "faltam " + (60 - minutes) + " minutos para " + getHourName(hours + 1);
        }

        return timeName;
    }

     static String getHourName(int hours) {
        String hourName = "";

        switch (hours) {
            case 1:
                hourName = "uma hora";
                break;
            case 2:
                hourName = "duas horas";
                break;
            case 3:
                hourName = "três horas";
                break;
            case 4:
                hourName = "quatro horas";
                break;
            case 5:
                hourName = "cinco horas";
                break;
            case 6:
                hourName = "seis horas";
                break;
            case 7:
                hourName = "sete horas";
                break;
            case 8:
                hourName = "oito horas";
                break;
            case 9:
                hourName = "nove horas";
                break;
            case 10:
                hourName = "dez horas";
                break;
            case 11:
                hourName = "onze horas";
                break;
            case 12:
                hourName = "doze horas";
                break;
        }

        return hourName;
    }
}

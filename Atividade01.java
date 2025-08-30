import java.util.Scanner;

public class Atividade01 {

    // Verifica se um ano é bissexto
    static boolean ehBissexto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }

    static int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 1: return 31;
            case 2: return ehBissexto(ano) ? 29 : 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;
        }
    }
    static int diasDesdeAnoZero(int dia, int mes, int ano) {
        int total = 0;

        for (int i = 0; i < ano; i++) {
            total += ehBissexto(i) ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            total += diasNoMes(i, ano);
        }
        total += dia;
        return total;
    }

    static int calculaDias(int diaN, int mesN, int anoN, int diaA, int mesA, int anoA) {
        int diasNascimento = diasDesdeAnoZero(diaN, mesN, anoN);
        int diasHoje = diasDesdeAnoZero(diaA, mesA, anoA);
        return diasHoje - diasNascimento;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento (dd mm aaaa):");
        int diaN = sc.nextInt();
        int mesN = sc.nextInt();
        int anoN = sc.nextInt();

        System.out.println("Digite a data de hoje (dd mm aaaa):");
        int diaA = sc.nextInt();
        int mesA = sc.nextInt();
        int anoA = sc.nextInt();

        int diasDeVida = calculaDias(diaN, mesN, anoN, diaA, mesA, anoA);

        System.out.println("Você tem aproximadamente " + diasDeVida + " dias de vida.");
    }
}

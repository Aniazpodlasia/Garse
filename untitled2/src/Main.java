import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double iloscpaliwa = pobierzIlosc("Wpisz ilosc paliwa", scan);
        double gazu = pobierzIlosc("Wpisz ilosc gazu", scan);
        double spalania = pobierzIlosc("Wpisz ilosc spalania", scan);

        double wynik = obliczSpalanie(iloscpaliwa, spalania);
        double wynikdlagazu = obliczGaz(wynik);

        wyswietlWyniki(spalania, wynik, wynikdlagazu);
    }

    private static double pobierzIlosc(String komunikat, Scanner scan) {
        System.out.println(komunikat);
        String iloscStr = scan.nextLine();
        return Double.parseDouble(iloscStr);
    }

    private static double obliczSpalanie(double iloscpaliwa, double spalania) {
        return iloscpaliwa * spalania;
    }

    private static double obliczGaz(double wynik) {
        return wynik * 1.10;
    }

    private static void wyswietlWyniki(double spalania, double wynik, double wynikdlagazu) {
        System.out.println("Srednie spalanie to " + Math.round(spalania) +
                " Czyli przejedziesz " + Math.round(wynik) +
                " km" + " a Gazu to " + Math.round(wynikdlagazu));
    }
}

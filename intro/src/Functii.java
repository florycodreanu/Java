public class Functii {
    // functie = o logica delimitata care poate fi refolosita
    // functie = o structura care face ceva ce ne poate ajuta in mai multe probleme
    // nu putem pune spatii in nume
    // nu putem defini o functie in alta functie
    // in Java se definesc in clasa nu in psvm
    // public o putem accesa de oriunde
    // ststic nu este poo
    // void = nu returneaza ( nu da raspuns)
    // functie care nu returneaza = f care nu poate fi salvata in variabile pentru a lucra mai apoi cu ea

    // O functie simpla care printeaza pe ecran
    // functie care nu da rasuns (fara return)
    // fara parametri
    public static void printGreeting()
    {
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // O functie care saluta clientul in functie de numele lui
    // functie care nu da rasuns (fara return)
    // cu parametri
    public static void printGreetingByName (String nume, String prenume)
    {
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    // O functie care calculeaza media a 3 numere
    // functie care da rasuns - suma nr. (cu return)
    // ce tip de date va avea raspunsul?
    // cu parametri
    public static double mediaNr(double a, double b, double c)
    {
        double media = (a + b + c) / 3; // sau pur si simplu return si expresia
        return media;
    }

    // O functie care ne da valoarea lui pi
    // ne da un raspuns? da
    // raspuns double
    // fara parametri cu return
    public static double piValue()
    {
        // constanta - variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }

    public static void main(String[] args)
    {
        //intra clientul 1
        printGreeting(); // se apeleaza functia

        // intra clientul 2
        printGreeting(); // CTRL + Functie => ne duce la corpul ei

        // apelam o functie cu parametri, oferind argumente
        printGreetingByName("Cojanu","Florentina");
        printGreetingByName("Cojanu","George - Catalin");
        printGreetingByName("Cojanu","Clara - Mihaela");
        printGreetingByName("Cojanu","David - Andrei");

        //apelam functia pentru medie
        System.out.println(mediaNr(3,3,4));
        double media1 = mediaNr(31213,312313,423);
        double media2 = mediaNr(35,324,41);
        double media3 = mediaNr(33,11,11);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        // Daca vrei rezultat double atunci si variabila trebuie sa fie double

        System.out.println(piValue());
        System.out.println(piValue());

        /*
        Tipuri de probleme:
        - aria unui dreptunghi
        - aria cercului
        - suma a doua nr
        - o functie care returneaza cate caractereare are nume + prenume
        hint: si la string se pot folosi f ajutatoare
         */
    }
}

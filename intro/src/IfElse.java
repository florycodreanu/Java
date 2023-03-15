import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // flow control(conditiolnale)
        // - if....else
        // evalueaza conditii si bifurca codul in functie de rezultat
        System.out.println("Pornim Radio");
        boolean piesa_faina1 = true; // invat piesa daca piesa este frumoasa
        // Daca imi lace piesa dau mai tare
        if (piesa_faina1 == true) {
            System.out.println("Dau mai tare");
            System.out.println("incep sa fredonez piesa");
        }
        System.out.println("Oprim Radio");


        System.out.println("Pornim Radio");
        boolean piesa_faina2 = false;
        if (piesa_faina2 == true) {
            System.out.println("Dau mai tare");
            System.out.println("incep sa fredonez piesa");
        }
        System.out.println("Oprim Radio");

        //if else
        int nr = 4;
        if (nr % 2 == 0 ){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }
        // pozitiv sau nu
        if (nr > 0 ){
            System.out.println("pozitiv");
        }else{
            System.out.println("nu este pozitiv");
        }

        // if, else if, else
        // luam date de la tastatura
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu ora");
        int ora = sc.nextInt();
        if (ora<0) {
            System.out.println("Ora invalida!");
        } else if (ora <=11) {
            System.out.println("Buna dimineata!");
        } else if (ora <=18) {
            System.out.println("Buna ziua!");
        } else if (ora <=21) {
            System.out.println("Buna seara!");
        } else if (ora <=24) {
            System.out.println("Noapte buna!");
        } else {
            System.out.println("Este mai mare decat 24. Ora invalida");
        }

        //<0 vit invalida  0 stationeaza, <= 50 in localitate <=90 drum judetean, autostrada
        System.out.println("Introduceti viteza");
        int viteza = sc.nextInt();
        if (viteza < 0) {
            System.out.println("Viteza introdusa este invalida");
        } else if (viteza == 0 ){
            System.out.println("Masina stationeaza");
        } else if (viteza <= 50){
            System.out.println("Masina se deplaseaza prin localitate");
        } else if (viteza <= 90){
            System.out.println("Masina se deplaseaza pe un drum judetean");
        } else {
            System.out.println("Masina circula pe autostrada.");
        }

        // flow control
        //switch - se foloseste cand stim valorile exact
        System.out.println("Alege optiunea");
        int optiune = sc.nextInt();
        switch (optiune){
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("en");
                break;
            default:
                System.out.println("optiune invalida");
        }

    }// inchide functia main
}//inchide clasa

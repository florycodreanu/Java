package oop;

public class ContBancar {
    // definim logica unui cont bancar

    // oop = object oriented programming
    // poo = programare orientata pe obiecte

    // o clasa = un tip nou
    // este definitia unui concept
    // o clasa este ca o reteta, adica este o baza pe care o putem folosi pentru mai multe produse
    // ex: clasa Car

    // obiect = instanta unei clase
    // produsul rezultat dein reteta
    // ex: obiect de tip car

    // fields = proprietati = atribute (variabile)
    // ex: tipul masinii/culoarea/combustibilul/consum/pret

    // metode - actiuni ce pot fi facute pe obiecte(functii)
    // ex: accelereaza(), franeaza(), descideUsa()

    // Atributele/fields
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercari_activare = 0;

    // constructor = are rolul de a impune date de start
    // ca * in formulare, cerinte obligatorii
    public ContBancar(String titularCont, String iban)
    {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    //matode
    public void interogareSold()
    {
        System.out.println(" Titular cont " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ " + this.activ);
        System.out.println("Nr de incercari gresite " + this.incercari_activare);
        System.out.println("----------------------------------------");
    }

    public void activareCont(int pinUtilizator)
    {
        // modificare active in true doar daca pinul e corect
        System.out.println("Buna "+ this.titularCont);
        if (pinUtilizator == this.pin) {
            System.out.println("Card activat cu succes!");
            System.out.println("-----------");
            this.activ = true;
        }else {
            System.out.println(" Pin Gresit");
            System.out.println("-----------");
            this.incercari_activare++;
        }
    }

    public void alimentareCont(double suma_depusa){
        // La ce aveam in cont se mai adauga suma depusa
        this.sold = this.sold + suma_depusa;
        System.out.println("Buna "+ this.titularCont);
        System.out.println("Ati depus cu succes suma de " + suma_depusa + ". Soldul dumneavoastra este: " + this.sold );
        System.out.println("-----------");

    }

    public void plataCard(double suma_cheltuita){
        System.out.println("Buna "+ this.titularCont);
        // Pot cheltui doar ce am
        if(suma_cheltuita <= this.sold){
            this.sold = this.sold-suma_cheltuita;
            System.out.println("Ai cheltuit " + suma_cheltuita);
            System.out.println("Mai ai " + this.sold);
            System.out.println("-----------");
        }else{
            System.out.println("Fonduri insuficiente!");
            System.out.println("-----------");
        }

    }

}

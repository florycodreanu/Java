package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // aici folosim logica creata

        // initializare obiecte de tip ContBancar
        // instante ale Clasei ContBancar
        ContBancar cont1 = new ContBancar("Codreanu Florentina","RO001");
        ContBancar cont2 = new ContBancar( "Cojanu George","RO002");

        // Apelam metoda de descriere
        cont1.interogareSold();
        cont2.interogareSold();

        //Activam conturile;
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);
        //alimentam contul
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        //neg testing, cheltuim mai mult decat avem
        cont1.plataCard(500); //corect

        //pozitiv cusuma exacta
        cont1.plataCard(300.5); //corect

        //pozitiv de doua ori
        cont2.plataCard(100);
        cont2.plataCard(200);

        cont1.interogareSold();
        cont2.interogareSold();
    }
}

public class Array {
    public static void main(String[] args) {
        // declarare si initializare cand stim valorile
        String[] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ada", "Mari"};
        int[] numere = {1, 33, 81, 99, 201};
        // contine mai multe elemente de acelasi tip
        // Accesam elemente prin index, care incep de la 0
        // Are o dimensiune fixa
        // Are proprietatea length care ne da dimensiunea array-ului
        // System.out.println(elevi[11]); ==>>primim eroare

        System.out.println(elevi[0]);
        System.out.println(elevi[1]);
        System.out.println(elevi[2]);
        elevi[2] = "Sebi"; // Suprascriere
        System.out.println(elevi[2]);
        System.out.println(elevi.length);

        // Putem sa ne jucam cu valorile din spate
        System.out.println(elevi[0] + " " + elevi[1]);// "Gigel" + "Costel"
        System.out.println(elevi.length + 5);

        // Sa printam tot timpul ultimul element indiferent de marime
        // System.out.println("Last place" + elevi[3]); -> doar in cazul in care lungimea este 4
        System.out.println("Last place : " + elevi[elevi.length -1]);

        // Declarare si initializare memorie
        int [] note = new int[5]; // 0, 0, 0, 0, 0
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 9;
        note[2] = 5;
        note[3] = 6;
        note[4] = 8;
        System.out.println(note[1]);
    }
}

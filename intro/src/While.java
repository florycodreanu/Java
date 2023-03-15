public class While {
    public static void main(String[] args) {
        // While este un loop/ciclu repetitiv
        // o zona de cod care se repeta atata timp cat o conditie este true

        // Problema: Masina merge cat timp inca are combustibil
        int litri_combustibil = 10;
        while (litri_combustibil > 0) {
            // acceleram
            System.out.println("Vruum vruum");
            // scadem benzina
            litri_combustibil = litri_combustibil - 1;
            //aprindem beculetul cand avem <= 3 litri
            if (litri_combustibil <= 3){
                System.out.println("Se aprinde becul rosu");
            }
        }
        System.out.println("STOP! Nu mai avem combustibil");
    }
}

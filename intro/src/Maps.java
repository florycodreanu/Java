import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Map = reprezentare de date in sistem tip cheie valoare
        // Exemplu: Gigel are nota 10, Costel are nota 9

        // Declaram un Map
        Map<String, Integer> note_elevi = new HashMap<>();

        // Adaugam elemente
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 10);

        // Aflu notele
        System.out.println("Ana are nota " + note_elevi.get("Ana"));

        // Suprascriem/Actualizam valori
        note_elevi.replace("Costel",10);
        System.out.println("Costel si-a marit nota la " + note_elevi.get("Costel"));

        // Aflam dimensiunea
        System.out.println(note_elevi.size());

        //stergem valori
        note_elevi.remove("Gigel");
        System.out.println(note_elevi.get("Gigel"));

        // Declaram si initializam cu valori
        // Map nu este ordonat
        Map<String, Integer> luni = new HashMap<>()
        {{
            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);
        }};

        System.out.println(luni);
    }

}

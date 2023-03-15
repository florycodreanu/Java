import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // Declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // Au o dimensiune dinamica

        //Adaugam elemente in lista
        fructe.add("Mar");
        fructe.add("Banana");
        fructe.add("Portocala");

        // Cum se iau elemente
        System.out.println(fructe.get(0));

        //Cum se afla indexul unui element
        System.out.println(fructe.indexOf("Banana"));

        //Este lista goala?
        System.out.println(fructe.isEmpty());

        //Eliminam toate fructele din lista
        //fructe.clear();

        //Scoatem un element
        fructe.remove("Mar");

        //Aflam dimensiunea listei
        System.out.println(fructe.size());

        //Listam elementele
        System.out.println(fructe);


        if(!fructe.isEmpty()){
            System.out.println("Avem ce manca");
        }else {
            System.out.println("Nu avem ce manca");
        }

        //Declaram o lista imutabila si o initializam cu valori
        List<String> list = Arrays.asList(new String[]{"foo", "bar"});
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});
        // listam elemente
        System.out.println(list);
        System.out.println(numere);

        // declaram o lista dinamica
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowerlist = new ArrayList<>(Arrays.asList(flowers));
        flowerlist.add("Rose");
        System.out.println(flowerlist);

        //Aflam unde este poppy
        int poppy_index = flowerlist.indexOf("Poppy");
        //Stergem ce este in acea pozitie
        flowerlist.remove(poppy_index);

        //Scoatem in functie de valoare
        flowerlist.remove("Catmint");

        // System.out.println(Arrays.toString(flowerlist.toArray()));

        // un array nu poate fi printat cu sout pe cand o lista poate fi printata doar cu sout
        System.out.println(flowerlist);
    }
}

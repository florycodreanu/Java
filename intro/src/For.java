public class For {
    public static void main(String[] args) {
       // For - loop/ structura repetitiva
       // De unde incepem?
       // Pana unde mergem?
       // Pasul de parcurgere
       // Problema: Vrem sa printam 101 dalmatieni
       for (int i = 1; i <= 101; i++)
       {
           System.out.println("Dalmatianul cu numarul " + i);
       }

       // Ne ajuta sa parcurgem un array prin intermediul indexului
        int[] numere = {3, 7, 10, 20, 30}; // fiecare valoare regasita are un index: numere[0] = 3
       //Nu putem sa le printam pur si simplu
        for (int i = 0; i < numere.length; i++)
        {
            System.out.println(" Elementul cu index " + i + " are valoarea " + numere[i]);
        }

        // For each - parcurge toate elementele din array si ajunge direct la valoare
        // adica nu ne mai folosim de index
        for (int numar : numere)
        {
            System.out.println("Numarul este: " + numar);
        }

        // Parcurgem array de culori
        String[] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori)
        {
            System.out.println("Culoarea actuala este " + culoare );
        }

        // Suma numerelor din array cu for each
        int suma = 0;
        for (int numar : numere)
        {
           suma = suma + numar;
        }
        System.out.println(suma);

        // De cate ori apare 3 in [3, 2, 3, 5, 3, 3]
        int nr_aparitii = 0;
        int[] lista = {3, 2, 3, 5, 3, 3};
        for ( int nr : lista)
        {
            if(nr == 3)
            {
                nr_aparitii = nr_aparitii + 1;
            }
        }
        System.out.println(nr_aparitii);
    }
}

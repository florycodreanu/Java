public class Variabile {
    public static void main(String[] args) {
        // declarare si initializare
        String marcaMasina="Volvo";
        String modelMasina="XC 60";

        // strongly typed - trebuie sa specificam tipul de variabile cu care lucram

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        //suprascrierea
        modelMasina = "XC 60 facelift";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        //declararea
        String nume;
        String prenume;
        //initializare
        prenume = "Flori";
        nume = "Codreanu";
        int varstsa= 26;
        // concatenare de doua tringuri
        System.out.println(nume + " " + prenume + " am varsta de " + varstsa);
    }
}

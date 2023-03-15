/*
Recap:
variabile
tipuri de date: char, string, int, float/double, boolean

Operatori:
aritmetici: +, -, *, /, %
de comparare: <, >, ==, !=, >=, <=
logici: &&, ||, !(not)

 */
public class Operatori {
    public static void main(String[] args) {
        // declarare && initializare
        int a = 3;
        int b = 5;
         a = b; // o suprascriere
        System.out.println(a);
        //operatori aritmetici
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/5);
        System.out.println(a%b);
        System.out.println(11%b);
        System.out.println(b>a);
        System.out.println(a-1>=b);
        System.out.println(a!=b); //5 diferit de 5 => false
        System.out.println(a==b); //5 este egal cu 5 => adevarat
        System.out.println(7>b && 8>b); //7>b si 8>b?
        System.out.println(7>b && 3>b); //7>b si 3>b?
        System.out.println(7>b || 3>b); //7>b sau 3>b?
        System.out.println(7>b && (8>b || 3>b)); // true && true
        System.out.println(7>b && (2>b || 3>b)); // true && false
        System.out.println(7>b || (8>b || 3>b));
        System.out.println(!(7>b));// !true => false
    }
}

package it.develhope.booleanOperators2;

public class Main {
    public static void main(String[] args) {


        boolean a = (55 != 55) && (false ^ true); // FALSE, 55 non è diverso da 55, ed anche se false e true sono due
        // risultati diversi, con AND sarà comunque false
        boolean b = (!true || !false) || 2 == '2'; //TRUE, anche se 2=='2' darà risultato false, perché pur essendo
        // entrambi 2 sono comunque due variabili diverse, il primo risultato è true
        boolean c = false && true || false && !false; //FALSE, entrambi i valori paragonati hanno un elemento false e
        // uno true, quindi entrambi avranno risultato false
        boolean d = (false && true) || (false || true); //TRUE, il primo sarà false, ma il secondo, con l'operatore OR,
        // avrà risultato true

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

/**
 * Created by icondor on 12/11/16.
 */
public class ExceptiiDeRuntime {

    public static void main(String[] args) {

        try {
            int[] numere = new int[2];
            numere[0] = 6;
            numere[1] = 61;
            numere[2] = 13;
        }
        catch(Exception e) {
            System.out.println("exceptie, exemplu de ce nu se prinde, ci se fixeaza in cod");
            e.printStackTrace();
        }

        System.out.println("gata programul, doar daca o exceptie e tratata se ajunge aici");


    }
}

/**
 * Created by icondor on 12/11/16.
 */
public class ExceptiiDeclarateSiTratate {

    public static void main(String[] args) {



        ExceptiiDeclarateSiTratate obj = new ExceptiiDeclarateSiTratate();
        String a = "ana are mere ";
        String b ="gandul nostru ana este";
        String c=null;

        try {
            System.out.println("primul"+obj.doesItStartWithAna(a));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("al doilea"+obj.doesItStartWithAna(c));
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            System.out.println("al treilea"+obj.doesItStartWithAna(b));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    // daca o metoda arunca exceptii, ea obliga pe cei ce o apeleaza
    // sa trateze exeptia sau sa o arunge mai departe
    private boolean doesItStartWithAna(String sentence) throws Exception { // cu throws anunt ca arunc
       if(sentence==null)
           throw new Exception("nu-i slobod null"); // cu throw arunc efectiv
            boolean yes = false;
            if (sentence.startsWith("ana") || sentence.startsWith("Ana"))
                yes = true;
            return yes;

    }


}

/**
 * Created by fav on 11/17/2016.
 */
public class Notepad {
    public static void main(String[] args) throws Exception {

        Runtime rt=Runtime.getRuntime();

        String file="C:\\Users\\fav\\Desktop\\Linux teme\\NotePadLaunch.txt";

        Process p=rt.exec("notepad "+file);

        System.out.println("uite lansez notepad");

    }


}







import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pwieczorek on 10.09.16.
 */
public class MainApplication {

    private static String text = "ala ma kota i kot ma ale aLe KoTa nie widziano.";

    public static void main(String[] args) {
        //text.toLowerCase();
        Pattern ala = Pattern.compile("al/S");
        Pattern kot = Pattern.compile("kot");

        Integer firstApearence;
        Integer lastAppearance;

        Matcher mAla = ala.matcher(text);
        Matcher mKot = kot.matcher(text);


        do{
            mAla.find();

        }while(mAla.hitEnd());

    }
}

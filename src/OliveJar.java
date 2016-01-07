import java.util.ArrayList;

/**
 * Created by mostafa on 07/01/16.
 */
public class OliveJar {
    public ArrayList<Olive> olives;
    {
        System.out.println("initializing");
        olives = new ArrayList<>();
        olives.add(new Olive("kalamata", 0x000000));
        olives.add(new Olive("Picholine", 0x00ff00));
        olives.add(new Olive("kalamata", 0x000000));
    }
    public OliveJar(){
        System.out.println("Construting....");
    }
}
